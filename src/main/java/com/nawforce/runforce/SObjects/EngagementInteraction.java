/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EngagementInteraction extends SObject {
	public static SObjectType$<EngagementInteraction> SObjectType;
	public static SObjectFields$<EngagementInteraction> Fields;

	public Datetime AttendeeVerificationTime;
	public String CommunicationChannel;
	public Id ContextId;
	public Name Context;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Duration;
	public Datetime EndDateTime;
	public String ExternalIdentifier;
	public Id Id;
	public Id InitiatingAttendeeId;
	public Name InitiatingAttendee;
	public Boolean IsAttendeeAuthenticated;
	public Boolean IsAttendeeVerified;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MappedState;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String PhoneNumber;
	public String Reason;
	public String Sentiment;
	public Datetime StartDateTime;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EngagementAttendee[] EngagementAttendees;
	public EngagementTopic[] EngagementTopics;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public EngagementInteractionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public EngagementInteractionHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public EngagementInteractionShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public EngagementInteraction clone$() {throw new java.lang.UnsupportedOperationException();}
	public EngagementInteraction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EngagementInteraction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EngagementInteraction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EngagementInteraction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
