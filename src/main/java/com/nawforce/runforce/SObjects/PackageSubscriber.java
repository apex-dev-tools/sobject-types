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
public class PackageSubscriber extends SObject {
	public static SObjectType$<PackageSubscriber> SObjectType;
	public static SObjectFields$<PackageSubscriber> Fields;

	public Id Id;
	public String InstalledStatus;
	public String InstanceName;
	public Id MetadataPackageId;
	public MetadataPackage MetadataPackage;
	public Id MetadataPackageVersionId;
	public MetadataPackageVersion MetadataPackageVersion;
	public String OrgKey;
	public String OrgName;
	public String OrgStatus;
	public String OrgType;
	public String ParentOrg;
	public Datetime SystemModstamp;

	public PackageSubscriber clone$() {throw new java.lang.UnsupportedOperationException();}
	public PackageSubscriber clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PackageSubscriber clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PackageSubscriber clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PackageSubscriber clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
