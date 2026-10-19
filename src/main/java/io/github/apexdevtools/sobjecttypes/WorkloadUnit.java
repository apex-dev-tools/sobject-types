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
public class WorkloadUnit extends SObject {
	public static SObjectType$<WorkloadUnit> SObjectType;
	public static SObjectFields$<WorkloadUnit> Fields;

	public Decimal AverageHandleTime;
	public String Channel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CustomWorkType;
	public Datetime DateTime;
	public String FeatureType;
	public Id Id;
	public Decimal IntradayAht;
	public Boolean IsDeleted;
	public Boolean IsOmni;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MeasureUnit;
	public String Region;
	public String SkillSet;
	public Datetime SystemModstamp;
	public Integer TotalCount;
	public Id WorkDemographicId;
	public WorkDemographic WorkDemographic;
	public Id WorkloadId;
	public Workload Workload;
	public String WorkloadType;

	public WorkloadUnit clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkloadUnit clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkloadUnit clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkloadUnit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkloadUnit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
