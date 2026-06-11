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
public class CaseMilestone extends SObject {
	public static SObjectType$<CaseMilestone> SObjectType;
	public static SObjectFields$<CaseMilestone> Fields;

	public Decimal ActualElapsedTimeInDays;
	public Decimal ActualElapsedTimeInHrs;
	public Integer ActualElapsedTimeInMins;
	public Id BusinessHoursId;
	public BusinessHours BusinessHours;
	public Id CaseId;
	public Case Case;
	public Datetime CompletionDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal ElapsedTimeInDays;
	public Decimal ElapsedTimeInHrs;
	public Integer ElapsedTimeInMins;
	public Id Id;
	public Boolean IsCompleted;
	public Boolean IsDeleted;
	public Boolean IsViolated;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MilestoneTypeId;
	public MilestoneType MilestoneType;
	public Datetime StartDate;
	public Decimal StoppedTimeInDays;
	public Decimal StoppedTimeInHrs;
	public Integer StoppedTimeInMins;
	public Datetime SystemModstamp;
	public Datetime TargetDate;
	public Decimal TargetResponseInDays;
	public Decimal TargetResponseInHrs;
	public Integer TargetResponseInMins;
	public Decimal TimeRemainingInDays;
	public String TimeRemainingInHrs;
	public String TimeRemainingInMins;
	public Decimal TimeSinceTargetInDays;
	public String TimeSinceTargetInHrs;
	public String TimeSinceTargetInMins;

	public CaseMilestone clone$() {throw new java.lang.UnsupportedOperationException();}
	public CaseMilestone clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CaseMilestone clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CaseMilestone clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CaseMilestone clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
