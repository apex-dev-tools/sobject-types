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
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.Integer DurationInMinutes;
	public com.nawforce.runforce.System.String GroupEventType;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsAllDayEvent;
	public com.nawforce.runforce.System.Boolean IsChild;
	public com.nawforce.runforce.System.Boolean IsGroupEvent;
	public com.nawforce.runforce.System.Boolean IsPrivate;
	public com.nawforce.runforce.System.Boolean IsRecurrence;
	public com.nawforce.runforce.System.Boolean IsRecurrence2Exclusion;
	public com.nawforce.runforce.System.Boolean IsReminderSet;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String Location;
	public Id OwnerId;
	public User Owner;
	public com.nawforce.runforce.System.String Recurrence2PatternText;
	public com.nawforce.runforce.System.String Recurrence2PatternVersion;
	public Id RecurrenceActivityId;
	public Event RecurrenceActivity;
	public com.nawforce.runforce.System.Integer RecurrenceDayOfMonth;
	public com.nawforce.runforce.System.Integer RecurrenceDayOfWeekMask;
	public Date RecurrenceEndDateOnly;
	public com.nawforce.runforce.System.String RecurrenceInstance;
	public com.nawforce.runforce.System.Integer RecurrenceInterval;
	public com.nawforce.runforce.System.String RecurrenceMonthOfYear;
	public Datetime RecurrenceStartDateTime;
	public com.nawforce.runforce.System.String RecurrenceTimeZoneSidKey;
	public com.nawforce.runforce.System.String RecurrenceType;
	public Datetime ReminderDateTime;
	public com.nawforce.runforce.System.String ReplayId;
	public com.nawforce.runforce.System.String ShowAs;
	public com.nawforce.runforce.System.String Subject;
	public Id WhatId;
	public SObject What;
	public Id WhoId;
	public SObject Who;

	public EventChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EventChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EventChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EventChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EventChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
