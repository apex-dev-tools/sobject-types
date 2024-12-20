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
public class EventChangeEvent extends SObject {
	public static SObjectType$<EventChangeEvent> SObjectType;
	public static SObjectFields$<EventChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Date ActivityDate;
	public Datetime ActivityDateTime;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Integer DurationInMinutes;
	public String GroupEventType;
	public Id Id;
	public Boolean IsAllDayEvent;
	public Boolean IsChild;
	public Boolean IsGroupEvent;
	public Boolean IsPrivate;
	public Boolean IsRecurrence;
	public Boolean IsRecurrence2Exclusion;
	public Boolean IsReminderSet;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Location;
	public Id OwnerId;
	public User Owner;
	public String Recurrence2PatternText;
	public String Recurrence2PatternVersion;
	public Id RecurrenceActivityId;
	public Event RecurrenceActivity;
	public Integer RecurrenceDayOfMonth;
	public Integer RecurrenceDayOfWeekMask;
	public Date RecurrenceEndDateOnly;
	public String RecurrenceInstance;
	public Integer RecurrenceInterval;
	public String RecurrenceMonthOfYear;
	public Datetime RecurrenceStartDateTime;
	public String RecurrenceTimeZoneSidKey;
	public String RecurrenceType;
	public Datetime ReminderDateTime;
	public String ReplayId;
	public Id ServiceAppointmentId;
	public ServiceAppointment ServiceAppointment;
	public String ShowAs;
	public String Subject;
	public String Type;
	public Integer WhatCount;
	public Id WhatId;
	public SObject What;
	public Integer WhoCount;
	public Id WhoId;
	public SObject Who;

	public EventChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EventChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EventChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EventChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EventChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
