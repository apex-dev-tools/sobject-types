/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MessagingSession extends SObject {
	public static SObjectType$<MessagingSession> SObjectType;
	public static SObjectFields$<MessagingSession> Fields;

	public Datetime AcceptTime;
	public Integer AgentMessageCount;
	public String AgentType;
	public Id CaseId;
	public Case Case;
	public String ChannelEndUserFormula;
	public String ChannelGroup;
	public String ChannelIntent;
	public String ChannelKey;
	public String ChannelLocale;
	public String ChannelName;
	public String ChannelType;
	public Id ConversationId;
	public Conversation Conversation;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndTime;
	public Id EndUserAccountId;
	public Account EndUserAccount;
	public Id EndUserContactId;
	public Contact EndUserContact;
	public String EndUserLanguage;
	public Integer EndUserMessageCount;
	public String EndedByType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LeadId;
	public Lead Lead;
	public Id MessagingChannelId;
	public MessagingChannel MessagingChannel;
	public Id MessagingEndUserId;
	public MessagingEndUser MessagingEndUser;
	public String Name;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public String Origin;
	public Id OwnerId;
	public Name Owner;
	public String PreviewDetails;
	public String SessionKey;
	public Datetime StartTime;
	public String Status;
	public Datetime SystemModstamp;
	public Id TargetUserId;
	public User TargetUser;

	public AttachedContentDocument[] AttachedContentDocuments;
	public Case[] Cases;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ConversationEntry[] ConversationEntries;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EngagementAttendee[] EngagementAttendees;
	public EngagementTopic[] EngagementTopics;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MessagingSessionFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public MessagingSessionHistory[] Histories;
	public MessagingSessionMetrics[] MessagingSessionMetricsAgg;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public MessagingSessionShare[] Shares;

	public MessagingSession clone$() {throw new java.lang.UnsupportedOperationException();}
	public MessagingSession clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MessagingSession clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MessagingSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MessagingSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
