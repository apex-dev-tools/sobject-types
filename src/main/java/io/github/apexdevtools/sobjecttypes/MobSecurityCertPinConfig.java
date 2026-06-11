/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
