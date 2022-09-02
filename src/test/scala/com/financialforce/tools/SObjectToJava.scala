
package com.financialforce.tools

import java.io.{BufferedWriter, FileWriter}
import java.nio.file.Paths


object SObjectToJava {
  def loginURL = "https://login.salesforce.com/services/Soap/u/56.0"

  def main(args: Array[String]): Unit = {

    args.length match {
      case 2 => ()
      case _ => println("Usage: SObjectToJava <username> <password>"); return
    }

    val connectionResult = SFConnection.login(loginURL, args(0), args(1))
    if (connectionResult.isLeft) {
      println(connectionResult.left.get)
      return
    }
    val partnerConnection = connectionResult.right.get.connection
    println("Connected to Org")
    val sObjectNames = partnerConnection.describeGlobal().getSobjects.filterNot(
      dfr => dfr.getCustom || dfr.getCustomSetting
    ).map(_.getName)

    sObjectNames.grouped(100).foreach(grp => {
      partnerConnection.describeSObjects(grp).foreach(sobjectDescribe => {
        val describedSObject = DescribedSObject(sobjectDescribe)
        if (describedSObject.fieldsAndTypes.exists(_._1 == "Id")) {
          val output = Paths.get(s"src/test/scala/com/financialforce/tools/output/${describedSObject.name}.java").toFile
          val writer = new BufferedWriter(new FileWriter(output))
          writer.write(describedSObject.asJava)
          writer.flush()
          writer.close()
        }
      })
    })
  }
}
