/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WorkforceCapacity extends SObject {
	public static SObjectType$<WorkforceCapacity> SObjectType;
	public static SObjectFields$<WorkforceCapacity> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Datetime EndDateTime;
	public String FeatureType;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsOmni;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String PlanType;
	public Datetime StartDateTime;
	public Datetime SystemModstamp;
	public String TimeZone;
	public Id WorkloadId;
	public Workload Workload;

	public WorkforceCapacityShare[] Shares;
	public WorkforceCapacityUnit[] WorkforceCapacityUnits;

	public WorkforceCapacity clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkforceCapacity clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkforceCapacity clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkforceCapacity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkforceCapacity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
