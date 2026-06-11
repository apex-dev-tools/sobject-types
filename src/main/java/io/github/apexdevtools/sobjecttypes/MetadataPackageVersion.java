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
public class MetadataPackageVersion extends SObject {
	public static SObjectType$<MetadataPackageVersion> SObjectType;
	public static SObjectFields$<MetadataPackageVersion> Fields;

	public Integer BuildNumber;
	public Id Id;
	public Boolean IsDeprecated;
	public Integer MajorVersion;
	public Id MetadataPackageId;
	public MetadataPackage MetadataPackage;
	public Integer MinorVersion;
	public String Name;
	public Integer PatchVersion;
	public String ReleaseState;
	public Datetime SystemModstamp;

	public PackagePushRequest[] PackagePushRequests;
	public PackageSubscriber[] PackageSubscribers;

	public MetadataPackageVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public MetadataPackageVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MetadataPackageVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MetadataPackageVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MetadataPackageVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
