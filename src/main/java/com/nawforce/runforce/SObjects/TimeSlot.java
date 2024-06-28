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
public class TimeSlot extends SObject {
	public static SObjectType$<TimeSlot> SObjectType;
	public static SObjectFields$<TimeSlot> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DayOfWeek;
	public Time EndTime;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer MaxAppointments;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id RecordsetFilterCriteriaId;
	public RecordsetFilterCriteria RecordsetFilterCriteria;
	public Time StartTime;
	public Datetime SystemModstamp;
	public String TimeSlotNumber;
	public String Type;
	public Id WorkTypeGroupId;
	public WorkTypeGroup WorkTypeGroup;

	public AppointmentTopicTimeSlot[] AppointmentTopicTimeSlots;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;

	public TimeSlot clone$() {throw new java.lang.UnsupportedOperationException();}
	public TimeSlot clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TimeSlot clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TimeSlot clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TimeSlot clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
