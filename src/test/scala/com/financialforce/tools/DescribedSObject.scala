package com.financialforce.tools

import com.financialforce.tools.DescribedSObject.recordTypeIdObjects
import com.sforce.soap.partner.{DescribeSObjectResult, Field}

import java.io.{BufferedWriter, StringWriter, Writer}

case class DescribedSObject(describe: DescribeSObjectResult) {

  val name: String = describe.getName

  lazy val fieldsAndTypes: Array[(String, String)] =
    describe.getFields.map(df => (df.getName, DescribedSObject.getPlatformType(df)))

  lazy val relationshipsAndTypes: Array[(String, String)] =
    describe.getChildRelationships.map(cr => (cr.getRelationshipName, cr.getChildSObject))
      .filterNot(cr => cr._1 == null)

  lazy val asJava: String = {
    val stringWriter = new StringWriter()
    val writer = new BufferedWriter(stringWriter)

    val hasStandardSObjectType = !fieldsAndTypes.exists(_._1.equalsIgnoreCase("SObjectType"))
    val hasStandardFieldsType = !fieldsAndTypes.exists(_._1.equalsIgnoreCase("Fields"))
    val fieldTypes = fieldsAndTypes.map(fieldAndType => {
      if (isIdField(fieldAndType._1, fieldAndType._2))
        "Id"
      else
        fieldAndType._2
    }).toSet

    CopyrightWriter.write(writer)
    writer.write(
      s"""|
         |package com.nawforce.runforce.SObjects;
          |
          |""".stripMargin)

    if (hasStandardFieldsType) {
      writer.write("import com.nawforce.runforce.Internal.SObjectFields$;\n")
    }

    if (hasStandardSObjectType) {
      writer.write("import com.nawforce.runforce.Internal.SObjectType$;\n")
    }

    val hasRecordTypeId = recordTypeIdObjects.contains(name)
    val extendedFieldType: Set[String] =
      if (hasRecordTypeId)
        fieldTypes ++ Set("Id")
      else
        fieldTypes

    val starImport = extendedFieldType.intersect(DescribedSObject.optionalImportable).size >= 3

    if (!starImport && fieldTypes.contains("Address"))
      writer.write("import com.nawforce.runforce.System.Address;\n")

    writer.write("import com.nawforce.runforce.System.Boolean;\n")

    if (!starImport && fieldTypes.contains("Datetime"))
      writer.write("import com.nawforce.runforce.System.Datetime;\n")

    if (!starImport && fieldTypes.contains("Decimal"))
      writer.write("import com.nawforce.runforce.System.Decimal;\n")

    if (!starImport && fieldTypes.contains("Id"))
      writer.write("import com.nawforce.runforce.System.Id;\n")

    if (fieldTypes.contains("Integer"))
      writer.write("import com.nawforce.runforce.System.Integer;\n")

    if (fieldTypes.contains("Long"))
      writer.write("import com.nawforce.runforce.System.Long;\n")

    if (!starImport)
      writer.write("import com.nawforce.runforce.System.SObject;\n")

    if (fieldTypes.contains("String"))
      writer.write("import com.nawforce.runforce.System.String;\n")

    if (starImport)
      writer.write("import com.nawforce.runforce.System.*;\n")

    writer.write(s"""\n@SuppressWarnings("unused")\npublic class $name extends SObject {\n""")

    if (hasStandardSObjectType)
      writer.write(s"\tpublic static SObjectType$$<$name> SObjectType;\n")

    if (hasStandardFieldsType)
      writer.write(s"\tpublic static SObjectFields$$<$name> Fields;\n")

    if (hasStandardSObjectType || hasStandardFieldsType)
      writer.write("\n")

    if (hasRecordTypeId) {
      writer.write("\tpublic Id RecordTypeId;\n")
      writer.write("\tpublic RecordType RecordType;\n")
    }

    fieldsAndTypes.sortBy(_._1).foreach(fd => writeField(fd._1, fd._2, writer))
    if (relationshipsAndTypes.nonEmpty)
      writer.write(s"\n")
    relationshipsAndTypes.sortBy(_._1).foreach(rd =>
      writer.write(s"\tpublic ${rd._2}[] ${rd._1};\n")
    )

    writer.write(
      s"""
         |\tpublic $name clone$$() {throw new java.lang.UnsupportedOperationException();}
         |\tpublic $name clone$$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
         |\tpublic $name clone$$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
         |\tpublic $name clone$$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
         |\tpublic $name clone$$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
         |""".stripMargin)

    writer.write(s"}\n")

    writer.close()
    stringWriter.toString
  }

  private def isIdField(name: String, fieldType: String): Boolean = {
    name != "Id" && name.endsWith("Id") && fieldType.startsWith("SObject.")
  }

  private def writeField(name: String, fieldType: String, writer: Writer): Unit = {
    if (isIdField(name, fieldType)) {
      writer.write(s"\tpublic Id $name;\n")
      writer.write(s"\tpublic ${fieldType.drop("SObject.".length)} ${name.dropRight(2)};\n")
    }
    else
      writer.write(s"\tpublic $fieldType $name;\n")
  }
}

object DescribedSObject {
  private val optionalImportable = Set("Datetime", "Id", "Integer", "String", "Address", "Decimal", "Long")

  private val recordTypeIdObjects = Set("Account", "Campaign", "CampaignMember", "Case", "Contact", "Contract",
    "Lead", "Opportunity", "QuickText", "Solution", "Order")

  private def getPlatformType(field: Field): String = {
    field.getType.toString match {
      case "reference" =>
        if (field.getReferenceTo.length == 1) {
          "SObject." + field.getReferenceTo.head
        } else if (field.isNamePointing) {
          "SObject.Name"
        } else {
          "SObject.SObject"
        }
      case "address" => "Address"
      case "anyType" => "Object"
      case "base64" => "Blob"
      case "boolean" => "Boolean"
      case "combobox" => "String"
      case "complexvalue" => "Object"
      case "currency" => "Decimal"
      case "date" => "Date"
      case "datetime" => "Datetime"
      case "double" => "Decimal"
      case "email" => "String"
      case "encryptedstring" => "Blob"
      case "id" => "Id"
      case "int" => "Integer"
      case "location" => "Location"
      case "long" => "Long"
      case "multipicklist" => "String"
      case "percent" => "Decimal"
      case "phone" => "String"
      case "picklist" => "String"
      case "string" => "String"
      case "textarea" => "String"
      case "time" => "Time"
      case "url" => "String"
      case "json" => "String"
      case "datacategorygroupreference" => "String"
    }
  }

  def apply(describe: DescribeSObjectResult): DescribedSObject = new DescribedSObject(describe)
}
