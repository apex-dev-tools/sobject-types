/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ActivityTimingChangeEvent extends SObject {
	public static SObjectType$<ActivityTimingChangeEvent> SObjectType;
	public static SObjectFields$<ActivityTimingChangeEvent> Fields;

	public Decimal ActivityCountPerRepetition;
	public Decimal ActivityDuration;
	public Id ActivityDurationUnitId;
	public UnitOfMeasure ActivityDurationUnit;
	public String ActivityTime;
	public Integer ActivityTimeOffset;
	public Object ChangeEventHeader;
	public Integer CountInPeriod;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer MaxActivityCountPerRepetition;
	public Decimal MaxActivityDuration;
	public Integer MaxCountInPeriod;
	public Decimal MaxRepetitionCycleLength;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Datetime PeriodEndDateTime;
	public Integer PeriodLength;
	public Decimal PeriodLengthLowerLimit;
	public Id PeriodLengthUnitId;
	public UnitOfMeasure PeriodLengthUnit;
	public Decimal PeriodLengthUpperLimit;
	public Datetime PeriodStartDateTime;
	public Decimal RepetitionCycleLength;
	public Id RepetitionCycleUnitId;
	public UnitOfMeasure RepetitionCycleUnit;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Id TimingCodeId;
	public CodeSet TimingCode;
	public String UsageType;
	public Id WeeklyActivityTimeId;
	public OperatingHours WeeklyActivityTime;

	public ActivityTimingChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActivityTimingChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActivityTimingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActivityTimingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActivityTimingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
