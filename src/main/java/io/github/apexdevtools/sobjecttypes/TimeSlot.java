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
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public TimeSlotHistory[] Histories;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;

	public TimeSlot clone$() {throw new java.lang.UnsupportedOperationException();}
	public TimeSlot clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TimeSlot clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TimeSlot clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TimeSlot clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
