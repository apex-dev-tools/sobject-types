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
public class Task extends SObject {
	public static SObjectType$<Task> SObjectType;
	public static SObjectFields$<Task> Fields;

	public Id AccountId;
	public Account Account;
	public Date ActivityDate;
	public String CallDisposition;
	public Integer CallDurationInSeconds;
	public String CallObject;
	public String CallType;
	public Datetime CompletedDateTime;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsArchived;
	public Boolean IsClosed;
	public Boolean IsDeleted;
	public Boolean IsHighPriority;
	public Boolean IsRecurrence;
	public Boolean IsReminderSet;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public Name Owner;
	public String Priority;
	public Id RecurrenceActivityId;
	public Task RecurrenceActivity;
	public Integer RecurrenceDayOfMonth;
	public Integer RecurrenceDayOfWeekMask;
	public Date RecurrenceEndDateOnly;
	public String RecurrenceInstance;
	public Integer RecurrenceInterval;
	public String RecurrenceMonthOfYear;
	public String RecurrenceRegeneratedType;
	public Date RecurrenceStartDateOnly;
	public String RecurrenceTimeZoneSidKey;
	public String RecurrenceType;
	public Datetime ReminderDateTime;
	public String Status;
	public String Subject;
	public Datetime SystemModstamp;
	public String TaskSubtype;
	public String Type;
	public Id WhatId;
	public Name What;
	public Id WhoId;
	public Name Who;

	public ActivityFieldHistory[] ActivityFieldHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public TaskFeed[] Feeds;
	public NetworkUserHistoryRecent[] NetworkUserHistoryRecentToRecord;
	public NetworkActivityAudit[] ParentEntities;
	public Task[] RecurringTasks;
	public SurveySubject[] SurveySubjectEntities;
	public TopicAssignment[] TopicAssignments;

	public Task clone$() {throw new java.lang.UnsupportedOperationException();}
	public Task clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Task clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Task clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Task clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
