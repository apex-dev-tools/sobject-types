
package com.financialforce.tools

import java.io.{BufferedWriter, FileWriter}
import java.nio.file.{Files, Paths}

object SObjectToJava {
  def loginURL(instance: String): String = s"https://$instance.salesforce.com/services/Soap/u/57.0"

  def main(args: Array[String]): Unit = {

    args.length match {
      case 3 => ()
      case _ => println("Usage: SObjectToJava <username> <password> <instance>"); return
    }

    val connectionResult = SFConnection.login(loginURL(args(2)), args(0), args(1))
    if (connectionResult.isLeft) {
      println(connectionResult.swap.getOrElse("Connection failed"))
      return
    }
    val partnerConnection = connectionResult.toOption.get.connection
    println("Connected to Org")
    val sObjectNames = partnerConnection.describeGlobal().getSobjects.filterNot(
      dfr => dfr.getCustom || dfr.getCustomSetting
    ).map(_.getName)

    var count = 0;
    sObjectNames.grouped(100).foreach(grp => {
      partnerConnection.describeSObjects(grp).foreach(sobjectDescribe => {
        val describedSObject = DescribedSObject(sobjectDescribe)
        if (describedSObject.fieldsAndTypes.exists(_._1 == "Id")) {
          val output = Paths.get(s"generated/${describedSObject.name}.java")
          Files.createDirectories(output.getParent)
          val writer = new BufferedWriter(new FileWriter(output.toFile))
          writer.write(describedSObject.asJava)
          writer.flush()
          writer.close()
          count += 1;
        }
      })
    })
    println(s"Generated $count files")
  }
}
