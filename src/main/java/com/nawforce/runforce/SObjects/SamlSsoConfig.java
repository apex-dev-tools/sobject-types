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
public class SamlSsoConfig extends SObject {
	public static SObjectType$<SamlSsoConfig> SObjectType;
	public static SObjectFields$<SamlSsoConfig> Fields;

	public String AttributeFormat;
	public String AttributeName;
	public String Audience;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String ErrorUrl;
	public Id ExecutionUserId;
	public User ExecutionUser;
	public Id Id;
	public String IdentityLocation;
	public String IdentityMapping;
	public Boolean IsDeleted;
	public String Issuer;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LoginUrl;
	public String LogoutUrl;
	public String MasterLabel;
	public String NamespacePrefix;
	public Boolean OptionsSpInitBinding;
	public Boolean OptionsUseConfigRequestMethod;
	public Boolean OptionsUseSameDigestAlgoForSigning;
	public Boolean OptionsUserProvisioning;
	public String RequestSignatureMethod;
	public Id SamlJitHandlerId;
	public ApexClass SamlJitHandler;
	public String SingleLogoutBinding;
	public String SingleLogoutUrl;
	public Datetime SystemModstamp;
	public String ValidationCert;
	public String Version;

	public SamlSsoConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public SamlSsoConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SamlSsoConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SamlSsoConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SamlSsoConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
