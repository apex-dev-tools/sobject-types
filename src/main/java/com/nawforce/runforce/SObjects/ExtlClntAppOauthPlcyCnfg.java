/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ExtlClntAppOauthPlcyCnfg extends SObject {
	public static SObjectType$<ExtlClntAppOauthPlcyCnfg> SObjectType;
	public static SObjectFields$<ExtlClntAppOauthPlcyCnfg> Fields;

	public Id ApexHandlerId;
	public ApexClass ApexHandler;
	public String ClientCredentialsFlowUser;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id ExecuteHandlerAsId;
	public User ExecuteHandlerAs;
	public Id ExternalClientApplicationId;
	public ExternalClientApplication ExternalClientApplication;
	public Id ExtlClntAppOauthSettingsId;
	public ExtlClntAppOauthSettings ExtlClntAppOauthSettings;
	public String GuestJwtSessionTimeoutType;
	public String GuestJwtTimeout;
	public Id Id;
	public String IpRelaxationPolicyType;
	public Boolean IsClientCredentialsFlowEnabled;
	public Boolean IsDeleted;
	public Boolean IsGuestCodeCredFlowEnabled;
	public Boolean IsNamedUserJwtEnabled;
	public Boolean IsTokenExchangeFlowEnabled;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamedUserJwtSessionTimeoutType;
	public String NamedUserJwtTimeout;
	public String PermittedUsersPolicyType;
	public String PolicyAction;
	public String RefreshTokenPolicyType;
	public Integer RefreshTokenValidityPeriod;
	public String RefreshTokenValidityUnit;
	public String RequiredSessionLevel;
	public Integer SessionTimeoutInMinutes;
	public String SingleLogoutUrl;
	public String StartUrl;
	public Datetime SystemModstamp;

	public ExtlClntAppOauthPlcyAttr[] ExtlClntAppOauthPlcyAttrs;
	public ExtlClntAppOauthPlcyCustmScp[] ExtlClntAppOauthPlcyCustmScps;

	public ExtlClntAppOauthPlcyCnfg clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthPlcyCnfg clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthPlcyCnfg clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthPlcyCnfg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthPlcyCnfg clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
