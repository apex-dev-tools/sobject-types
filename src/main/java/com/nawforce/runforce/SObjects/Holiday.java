/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Holiday extends SObject {
	public static SObjectType$<Holiday> SObjectType;
	public static SObjectFields$<Holiday> Fields;

	public Date ActivityDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.Integer EndTimeInMinutes;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsAllDay;
	public com.nawforce.runforce.System.Boolean IsRecurrence;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer RecurrenceDayOfMonth;
	public com.nawforce.runforce.System.Integer RecurrenceDayOfWeekMask;
	public Date RecurrenceEndDateOnly;
	public com.nawforce.runforce.System.String RecurrenceInstance;
	public com.nawforce.runforce.System.Integer RecurrenceInterval;
	public com.nawforce.runforce.System.String RecurrenceMonthOfYear;
	public Date RecurrenceStartDate;
	public com.nawforce.runforce.System.String RecurrenceType;
	public com.nawforce.runforce.System.Integer StartTimeInMinutes;
	public Datetime SystemModstamp;

	public OperatingHoursHoliday[] OperatingHoursHolidays;

	public Holiday clone$() {throw new java.lang.UnsupportedOperationException();}
	public Holiday clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Holiday clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Holiday clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Holiday clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
