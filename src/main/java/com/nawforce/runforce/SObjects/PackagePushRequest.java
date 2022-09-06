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
public class PackagePushRequest extends SObject {
	public static SObjectType$<PackagePushRequest> SObjectType;
	public static SObjectFields$<PackagePushRequest> Fields;

	public Integer DurationSeconds;
	public Datetime EndTime;
	public Id Id;
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
