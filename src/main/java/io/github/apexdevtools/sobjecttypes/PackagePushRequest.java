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
public class PackagePushRequest extends SObject {
	public static SObjectType$<PackagePushRequest> SObjectType;
	public static SObjectFields$<PackagePushRequest> Fields;

	public Integer DurationSeconds;
	public Datetime EndTime;
	public Id Id;
	public Boolean IsMigration;
	public Id PackageVersionId;
	public MetadataPackageVersion PackageVersion;
	public Datetime ScheduledStartTime;
	public Datetime StartTime;
	public String Status;
	public Datetime SystemModstamp;

	public PackagePushJob[] PackagePushJobs;

	public PackagePushRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public PackagePushRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PackagePushRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PackagePushRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PackagePushRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
