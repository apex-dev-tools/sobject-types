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
public class TimeSlotChangeEvent extends SObject {
	public static SObjectType$<TimeSlotChangeEvent> SObjectType;
	public static SObjectFields$<TimeSlotChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DayOfWeek;
	public Time EndTime;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer MaxAppointments;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id RecordsetFilterCriteriaId;
	public RecordsetFilterCriteria RecordsetFilterCriteria;
	public String ReplayId;
	public Time StartTime;
	public String TimeSlotNumber;
	public String Type;
	public Id WorkTypeGroupId;
	public WorkTypeGroup WorkTypeGroup;

	public TimeSlotChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public TimeSlotChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TimeSlotChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TimeSlotChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TimeSlotChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
