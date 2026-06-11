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
