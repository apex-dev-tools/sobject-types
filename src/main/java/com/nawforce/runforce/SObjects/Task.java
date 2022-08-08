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
public class Task extends SObject {
	public static SObjectType$<Task> SObjectType;
	public static SObjectFields$<Task> Fields;

	public com.nawforce.runforce.System.String Type;
	public Id AccountId;
	public Account Account;
	public Date ActivityDate;
	public com.nawforce.runforce.System.String CallDisposition;
	public com.nawforce.runforce.System.Integer CallDurationInSeconds;
	public com.nawforce.runforce.System.String CallObject;
	public com.nawforce.runforce.System.String CallType;
	public Datetime CompletedDateTime;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsArchived;
	public com.nawforce.runforce.System.Boolean IsClosed;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsHighPriority;
	public com.nawforce.runforce.System.Boolean IsRecurrence;
	public com.nawforce.runforce.System.Boolean IsReminderSet;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public Name Owner;
	public com.nawforce.runforce.System.String Priority;
	public Id RecurrenceActivityId;
	public Task RecurrenceActivity;
	public com.nawforce.runforce.System.Integer RecurrenceDayOfMonth;
	public com.nawforce.runforce.System.Integer RecurrenceDayOfWeekMask;
	public Date RecurrenceEndDateOnly;
	public com.nawforce.runforce.System.String RecurrenceInstance;
	public com.nawforce.runforce.System.Integer RecurrenceInterval;
	public com.nawforce.runforce.System.String RecurrenceMonthOfYear;
	public com.nawforce.runforce.System.String RecurrenceRegeneratedType;
	public Date RecurrenceStartDateOnly;
	public com.nawforce.runforce.System.String RecurrenceTimeZoneSidKey;
	public com.nawforce.runforce.System.String RecurrenceType;
	public Datetime ReminderDateTime;
	public com.nawforce.runforce.System.String Status;
	public com.nawforce.runforce.System.String Subject;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String TaskSubtype;
	public Id WhatId;
	public Name What;
	public Id WhoId;
	public Name Who;

	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public TaskFeed[] Feeds;
	public Task[] RecurringTasks;
	public SurveySubject[] SurveySubjectEntities;
	public TopicAssignment[] TopicAssignments;

	public Task clone$() {throw new java.lang.UnsupportedOperationException();}
	public Task clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Task clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Task clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Task clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
