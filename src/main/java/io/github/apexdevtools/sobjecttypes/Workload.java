/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class Workload extends SObject {
	public static SObjectType$<Workload> SObjectType;
	public static SObjectFields$<Workload> Fields;

	public Decimal AhtOutlierSensitivity;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Datetime EndDateTime;
	public String FeatureType;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsOmni;
	public Boolean IsOutlierDetectionEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal MaxPercentageOfAhtOutliers;
	public Decimal MaxPercentageOfVolumeOutliers;
	public String Name;
	public Integer NumberOfAhtOutliers;
	public Integer NumberOfVolumeOutliers;
	public Id OwnerId;
	public Name Owner;
	public Datetime StartDateTime;
	public Datetime SystemModstamp;
	public String TimeZone;
	public Decimal VolumeOutlierSensitivity;
	public String WorkloadSource;
	public String WorkloadType;

	public WorkloadShare[] Shares;
	public WorkloadUnit[] WorkloadUnits;

	public Workload clone$() {throw new java.lang.UnsupportedOperationException();}
	public Workload clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Workload clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Workload clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Workload clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
