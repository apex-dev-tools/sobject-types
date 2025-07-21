/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AuthProvider extends SObject {
	public static SObjectType$<AuthProvider> SObjectType;
	public static SObjectFields$<AuthProvider> Fields;

	public String AppleTeam;
	public String AuthorizeUrl;
	public String ConsumerKey;
	public String ConsumerSecret;
	public Datetime CreatedDate;
	public String CustomMetadataTypeRecord;
	public String DefaultScopes;
	public String DeveloperName;
	public String EcKey;
	public String ErrorUrl;
	public Id ExecutionUserId;
	public User ExecutionUser;
	public Id FlowDefaultAccountId;
	public Account FlowDefaultAccount;
	public Id FlowDefaultProfileId;
	public Profile FlowDefaultProfile;
	public String FriendlyName;
	public String IconUrl;
	public Id Id;
	public String IdTokenIssuer;
	public String LinkKickoffUrl;
	public String LogoutUrl;
	public String OauthKickoffUrl;
	public Boolean OptionsIncludeOrgIdInId;
	public Boolean OptionsIsBitbucket;
	public Boolean OptionsIsEmi;
	public Boolean OptionsIsEmiSnapchatAds;
	public Boolean OptionsIsEmiTikTokAds;
	public Boolean OptionsIsMuleSoftEU;
	public Boolean OptionsIsMuleSoftUS;
	public Boolean OptionsIsPkceEnabled;
	public Boolean OptionsIsSegmentIntelligence;
	public Boolean OptionsIsWebDataConnector;
	public Boolean OptionsRequireMfa;
	public Boolean OptionsSendAccessTokenInHeader;
	public Boolean OptionsSendClientCredentialsInHeader;
	public Boolean OptionsSendSecretInApis;
	public Id PluginId;
	public ApexClass Plugin;
	public String ProviderType;
	public Id RegistrationHandlerId;
	public ApexClass RegistrationHandler;
	public String SsoKickoffUrl;
	public String TokenUrl;
	public String UserInfoUrl;

	public AuthProvider clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthProvider clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthProvider clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthProvider clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthProvider clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
