/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ExtlClntAppOauthSettings extends SObject {
	public static SObjectType$<ExtlClntAppOauthSettings> SObjectType;
	public static SObjectFields$<ExtlClntAppOauthSettings> Fields;

	public String ClientAssertionCertificate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id ExternalClientApplicationId;
	public ExternalClientApplication ExternalClientApplication;
	public Boolean ExtlClntAppOauthOptionsFirstPartyAppEnabled;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String OauthLink;
	public Boolean OauthScopesADDRESS;
	public Boolean OauthScopesAPI;
	public Boolean OauthScopesCDP_API;
	public Boolean OauthScopesCDP_CALCULATED_INSIGHT_API;
	public Boolean OauthScopesCDP_IDENTITYRESOLUTION_API;
	public Boolean OauthScopesCDP_INGEST_API;
	public Boolean OauthScopesCDP_PROFILE_API;
	public Boolean OauthScopesCDP_QUERY_API;
	public Boolean OauthScopesCDP_SEGMENT_API;
	public Boolean OauthScopesCHATBOT_API;
	public Boolean OauthScopesCHATTER_REST_API;
	public Boolean OauthScopesCONTENT;
	public Boolean OauthScopesCUSTOM_PERMISSIONS;
	public Boolean OauthScopesECLAIR_REST_API;
	public Boolean OauthScopesEINSTEIN_GPT_API;
	public Boolean OauthScopesEMAIL;
	public Boolean OauthScopesFORGOT_PASSWORD;
	public Boolean OauthScopesFULL;
	public Boolean OauthScopesHUB_API;
	public Boolean OauthScopesINTERACTION_API;
	public Boolean OauthScopesLIGHTNING;
	public Boolean OauthScopesOFFLINE_ACCESS;
	public Boolean OauthScopesOPENID;
	public Boolean OauthScopesPARDOT_API;
	public Boolean OauthScopesPHONE;
	public Boolean OauthScopesPROFILE;
	public Boolean OauthScopesPWDLESS_LOGIN_API;
	public Boolean OauthScopesREFRESH_TOKEN;
	public Boolean OauthScopesSFAP_API;
	public Boolean OauthScopesSSO;
	public Boolean OauthScopesUSER_REGISTRATION_API;
	public Boolean OauthScopesVF;
	public Boolean OauthScopesWAVE_REST_API;
	public Boolean OauthScopesWEB;
	public String SingleLogoutUrl;
	public Datetime SystemModstamp;

	public ExtlClntAppOauthIpRange[] ExtlClntAppOauthIpRanges;
	public ExtlClntAppOauthSetAttr[] ExtlClntAppOauthSetAttrs;
	public ExtlClntAppOauthSetCustmScp[] ExtlClntAppOauthSetCustmScps;

	public ExtlClntAppOauthSettings clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthSettings clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthSettings clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
