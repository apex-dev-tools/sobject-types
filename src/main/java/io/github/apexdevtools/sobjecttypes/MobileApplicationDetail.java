/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MobileApplicationDetail extends SObject {
	public static SObjectType$<MobileApplicationDetail> SObjectType;
	public static SObjectFields$<MobileApplicationDetail> Fields;

	public String AppInstallUrl;
	public Blob ApplicationBinary;
	public String ApplicationBinaryFileName;
	public String ApplicationBundleIdentifier;
	public Integer ApplicationFileLength;
	public String ApplicationIcon;
	public String ApplicationIconFileName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String DevicePlatform;
	public String DeviceType;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEnterpriseApp;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String MinimumOsVersion;
	public String NamespacePrefix;
	public Datetime SystemModstamp;
	public String Version;

	public MobileApplicationDetail clone$() {throw new java.lang.UnsupportedOperationException();}
	public MobileApplicationDetail clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MobileApplicationDetail clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MobileApplicationDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MobileApplicationDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
