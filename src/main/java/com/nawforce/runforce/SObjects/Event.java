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
public class Event extends SObject {
	public static SObjectType$<Event> SObjectType;
	public static SObjectFields$<Event> Fields;

	public Id AccountId;
	public Account Account;
	public Date ActivityDate;
	public Datetime ActivityDateTime;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.Integer DurationInMinutes;
	public Date EndDate;
	public Datetime EndDateTime;
	public com.nawforce.runforce.System.String EventSubtype;
	public com.nawforce.runforce.System.String GroupEventType;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsAllDayEvent;
	public com.nawforce.runforce.System.Boolean IsArchived;
	public com.nawforce.runforce.System.Boolean IsChild;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsGroupEvent;
	public com.nawforce.runforce.System.Boolean IsPrivate;
	public com.nawforce.runforce.System.Boolean IsRecurrence;
	public com.nawforce.runforce.System.Boolean IsRecurrence2;
	public com.nawforce.runforce.System.Boolean IsRecurrence2Exception;
	public com.nawforce.runforce.System.Boolean IsRecurrence2Exclusion;
	public com.nawforce.runforce.System.Boolean IsReminderSet;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String Location;
	public Id OwnerId;
	public Name Owner;
	public Datetime Recurrence2PatternStartDate;
	public com.nawforce.runforce.System.String Recurrence2PatternText;
	public com.nawforce.runforce.System.String Recurrence2PatternTimeZone;
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
	public com.nawforce.runforce.System.String ShowAs;
	public Datetime StartDateTime;
	public com.nawforce.runforce.System.String Subject;
	public Datetime SystemModstamp;
	public Id WhatId;
	public Name What;
	public Id WhoId;
	public Name Who;

	public AcceptedEventRelation[] AcceptedEventRelations;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DeclinedEventRelation[] DeclinedEventRelations;
	public EventRelation[] EventRelations;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public EventFeed[] Feeds;
	public Event[] RecurringEvents;
	public SurveySubject[] SurveySubjectEntities;
	public TopicAssignment[] TopicAssignments;
	public UndecidedEventRelation[] UndecidedEventRelations;

	public Event clone$() {throw new java.lang.UnsupportedOperationException();}
	public Event clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Event clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Event clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Event clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
