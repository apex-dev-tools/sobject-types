/*
 [The "BSD licence"]
 Copyright (c) 2017 Kevin Jones
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

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
    val sObjectNames = partnerConnection
      .describeGlobal()
      .getSobjects
      .filterNot(dfr => dfr.getCustom || dfr.getCustomSetting)
      .map(_.getName)

    var count = 0;
    sObjectNames
      .grouped(100)
      .foreach(grp => {
        partnerConnection
          .describeSObjects(grp)
          .foreach(sobjectDescribe => {
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
