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
public class MobSecurityCertPinConfig extends SObject {
	public static SObjectType$<MobSecurityCertPinConfig> SObjectType;
	public static SObjectFields$<MobSecurityCertPinConfig> Fields;

	public String CertificateHash;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String DomainName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public Boolean IsSubdomainIncluded;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String MobilePlatform;
	public Id MobileSecurityAssignmentId;
	public MobileSecurityAssignment MobileSecurityAssignment;
	public String NamespacePrefix;
	public String SeverityLevel;
	public Datetime SystemModstamp;
	public String Type;

	public MobSecurityCertPinConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public MobSecurityCertPinConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MobSecurityCertPinConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MobSecurityCertPinConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MobSecurityCertPinConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
