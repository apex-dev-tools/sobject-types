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
public class SchedulingConstraint extends SObject {
	public static SObjectType$<SchedulingConstraint> SObjectType;
	public static SObjectFields$<SchedulingConstraint> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer MaxNonstandardShiftsPerMonth;
	public Integer MaxShiftsPerDay;
	public Integer MaxShiftsPerMonth;
	public Integer MaxShiftsPerWeek;
	public Decimal MaxWorkingHoursPerDay;
	public Decimal MaxWorkingHoursPerMonth;
	public Decimal MaxWorkingHoursPerWeek;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Integer RestTimeMinutes;
	public Datetime SystemModstamp;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ServiceResource[] ServiceResources;
	public ServiceTerritory[] ServiceTerritories;
	public SchedulingConstraintShare[] Shares;

	public SchedulingConstraint clone$() {throw new java.lang.UnsupportedOperationException();}
	public SchedulingConstraint clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SchedulingConstraint clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SchedulingConstraint clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SchedulingConstraint clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
