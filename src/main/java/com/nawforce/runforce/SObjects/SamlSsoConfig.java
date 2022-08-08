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
public class SamlSsoConfig extends SObject {
	public static SObjectType$<SamlSsoConfig> SObjectType;
	public static SObjectFields$<SamlSsoConfig> Fields;

	public com.nawforce.runforce.System.String AttributeFormat;
	public com.nawforce.runforce.System.String AttributeName;
	public com.nawforce.runforce.System.String Audience;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String DeveloperName;
	public com.nawforce.runforce.System.String ErrorUrl;
	public Id ExecutionUserId;
	public User ExecutionUser;
	public Id Id;
	public com.nawforce.runforce.System.String IdentityLocation;
	public com.nawforce.runforce.System.String IdentityMapping;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.String Issuer;
	public com.nawforce.runforce.System.String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LoginUrl;
	public com.nawforce.runforce.System.String LogoutUrl;
	public com.nawforce.runforce.System.String MasterLabel;
	public com.nawforce.runforce.System.String NamespacePrefix;
	public com.nawforce.runforce.System.Boolean OptionsSpInitBinding;
	public com.nawforce.runforce.System.Boolean OptionsUseConfigRequestMethod;
	public com.nawforce.runforce.System.Boolean OptionsUserProvisioning;
	public com.nawforce.runforce.System.String RequestSignatureMethod;
	public Id SamlJitHandlerId;
	public ApexClass SamlJitHandler;
	public com.nawforce.runforce.System.String SingleLogoutBinding;
	public com.nawforce.runforce.System.String SingleLogoutUrl;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String ValidationCert;
	public com.nawforce.runforce.System.String Version;

	public SamlSsoConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public SamlSsoConfig clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SamlSsoConfig clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SamlSsoConfig clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SamlSsoConfig clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
