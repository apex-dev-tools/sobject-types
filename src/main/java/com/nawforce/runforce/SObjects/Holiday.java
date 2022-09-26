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
public class Holiday extends SObject {
	public static SObjectType$<Holiday> SObjectType;
	public static SObjectFields$<Holiday> Fields;

	public Date ActivityDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Integer EndTimeInMinutes;
	public Id Id;
	public Boolean IsAllDay;
	public Boolean IsRecurrence;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Date NextOccurrenceDate;
	public Integer RecurrenceDayOfMonth;
	public Integer RecurrenceDayOfWeekMask;
	public Date RecurrenceEndDateOnly;
	public String RecurrenceInstance;
	public Integer RecurrenceInterval;
	public String RecurrenceMonthOfYear;
	public Date RecurrenceStartDate;
	public String RecurrenceType;
	public Integer StartTimeInMinutes;
	public Datetime SystemModstamp;

	public OperatingHoursHoliday[] OperatingHoursHolidays;

	public Holiday clone$() {throw new java.lang.UnsupportedOperationException();}
	public Holiday clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Holiday clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Holiday clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Holiday clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
