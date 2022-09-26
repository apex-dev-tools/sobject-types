/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
