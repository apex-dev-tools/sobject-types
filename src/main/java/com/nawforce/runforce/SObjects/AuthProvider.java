/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
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
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AuthProvider extends SObject {
	public static SObjectType$<AuthProvider> SObjectType;
	public static SObjectFields$<AuthProvider> Fields;

	public com.nawforce.runforce.System.String AppleTeam;
	public com.nawforce.runforce.System.String AuthorizeUrl;
	public com.nawforce.runforce.System.String ConsumerKey;
	public com.nawforce.runforce.System.String ConsumerSecret;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CustomMetadataTypeRecord;
	public com.nawforce.runforce.System.String DefaultScopes;
	public com.nawforce.runforce.System.String DeveloperName;
	public com.nawforce.runforce.System.String EcKey;
	public com.nawforce.runforce.System.String ErrorUrl;
	public Id ExecutionUserId;
	public User ExecutionUser;
	public com.nawforce.runforce.System.String FriendlyName;
	public com.nawforce.runforce.System.String IconUrl;
	public Id Id;
	public com.nawforce.runforce.System.String IdTokenIssuer;
	public com.nawforce.runforce.System.String LinkKickoffUrl;
	public com.nawforce.runforce.System.String LogoutUrl;
	public com.nawforce.runforce.System.String OauthKickoffUrl;
	public com.nawforce.runforce.System.Boolean OptionsIncludeOrgIdInId;
	public com.nawforce.runforce.System.Boolean OptionsSendAccessTokenInHeader;
	public com.nawforce.runforce.System.Boolean OptionsSendClientCredentialsInHeader;
	public com.nawforce.runforce.System.Boolean OptionsSendSecretInApis;
	public Id PluginId;
	public ApexClass Plugin;
	public com.nawforce.runforce.System.String ProviderType;
	public Id RegistrationHandlerId;
	public ApexClass RegistrationHandler;
	public com.nawforce.runforce.System.String SsoKickoffUrl;
	public com.nawforce.runforce.System.String TokenUrl;
	public com.nawforce.runforce.System.String UserInfoUrl;

	public AuthProvider clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthProvider clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthProvider clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthProvider clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthProvider clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
