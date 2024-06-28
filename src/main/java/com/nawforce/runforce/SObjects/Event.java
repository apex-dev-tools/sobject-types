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
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Integer DurationInMinutes;
	public Date EndDate;
	public Datetime EndDateTime;
	public String EventSubtype;
	public String GroupEventType;
	public Id Id;
	public Boolean IsAllDayEvent;
	public Boolean IsArchived;
	public Boolean IsChild;
	public Boolean IsDeleted;
	public Boolean IsGroupEvent;
	public Boolean IsPrivate;
	public Boolean IsRecurrence;
	public Boolean IsRecurrence2;
	public Boolean IsRecurrence2Exception;
	public Boolean IsRecurrence2Exclusion;
	public Boolean IsReminderSet;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Location;
	public Id OwnerId;
	public Name Owner;
	public Datetime Recurrence2PatternStartDate;
	public String Recurrence2PatternText;
	public String Recurrence2PatternTimeZone;
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
	public Id ServiceAppointmentId;
	public ServiceAppointment ServiceAppointment;
	public String ShowAs;
	public Datetime StartDateTime;
	public String Subject;
	public Datetime SystemModstamp;
	public String Type;
	public Integer WhatCount;
	public Id WhatId;
	public Name What;
	public Integer WhoCount;
	public Id WhoId;
	public Name Who;
	public String[] AcceptedEventInviteeIds;
	public String[] DeclinedEventInviteeIds;
	public String[] EventWhoIds;
	public String[] UndecidedEventInviteeIds;

	public AcceptedEventRelation[] AcceptedEventRelations;
	public ActivityFieldHistory[] ActivityFieldHistories;
	public AssignedResource[] AssignedResourceEvents;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DeclinedEventRelation[] DeclinedEventRelations;
	public EventRelation[] EventRelations;
	public EventWhoRelation[] EventWhoRelations;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public EventFeed[] Feeds;
	public NetworkActivityAudit[] ParentEntities;
	public Event[] RecurringEvents;
	public SurveySubject[] SurveySubjectEntities;
	public TopicAssignment[] TopicAssignments;
	public UndecidedEventRelation[] UndecidedEventRelations;
	public VideoCall[] VideoCallActivities;

	public Event clone$() {throw new java.lang.UnsupportedOperationException();}
	public Event clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Event clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Event clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Event clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
