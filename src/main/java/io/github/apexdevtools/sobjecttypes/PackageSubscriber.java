/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
