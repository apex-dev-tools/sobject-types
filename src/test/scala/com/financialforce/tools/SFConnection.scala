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

import com.sforce.soap.metadata.MetadataConnection
import com.sforce.soap.partner.PartnerConnection
import com.sforce.ws.{ConnectionException, ConnectorConfig}

case class SFConnection(
  connection: PartnerConnection,
  serverURL: String,
  metadataURL: String,
  loginURL: String,
  username: String
) {
  def metadataConnection(): MetadataConnection = {
    val config = new ConnectorConfig
    config.setServiceEndpoint(metadataURL)
    config.setSessionId(connection.getConfig.getSessionId)
    new MetadataConnection(config)
  }
}

object SFConnection {

  def login(
    username: String,
    passwordAndToken: String,
    instance: String,
    api: String,
  ): Either[String, SFConnection] = {
    // [Oct 2025] Per https://help.salesforce.com/s/articleView?id=005132110&type=1
    // SOAP login() is being retired - last supported version is 64
    // use 64 to get session ID and then modify the API service URL to the desired version

    val loginUrl = s"https://$instance.salesforce.com/services/Soap/u/64.0"
    val config = new ConnectorConfig
    config.setAuthEndpoint(loginUrl)
    config.setServiceEndpoint(loginUrl)
    config.setManualLogin(true)

    try {
      val connection = new PartnerConnection(config)
      val result     = connection.login(username, passwordAndToken)

      val url = setApiVersion(result.getServerUrl, api)
      val metaUrl = setApiVersion(result.getMetadataServerUrl, api)
      val newConfig = new ConnectorConfig
      newConfig.setServiceEndpoint(url)
      newConfig.setSessionId(result.getSessionId)
      Right(
        SFConnection(
          new PartnerConnection(newConfig),
          url,
          metaUrl,
          loginUrl,
          username
        )
      )
    } catch {
      case e: ConnectionException => Left(e.toString)
    }
  }

  private def setApiVersion(url: String, api: String): String = url.replace("64.0", api)
}
