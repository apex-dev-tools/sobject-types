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
public class InfoAuthorizationRequest extends SObject {
	public static SObjectType$<InfoAuthorizationRequest> SObjectType;
	public static SObjectFields$<InfoAuthorizationRequest> Fields;

	public String CommunicationType;
	public Id ConsenterId;
	public Name Consenter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DataUsePurposeId;
	public DataUsePurpose DataUsePurpose;
	public Datetime ExpirationDateTime;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Locale;
	public Id MultipartyInfoAuthRequestId;
	public MultipartyInfoAuthRequest MultipartyInfoAuthRequest;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PertainsToId;
	public Name PertainsTo;
	public Datetime RequestedDateTime;
	public Id RequesterId;
	public Name Requester;
	public String ResponseStatus;
	public Id SourceRecordId;
	public SObject SourceRecord;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public InfoAuthorizationRequestFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordInfoAuthRequests;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public InfoAuthorizationRequestHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public InfoAuthRequestForm[] RequestFormAuthRequests;
	public InfoAuthorizationRequestShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public InfoAuthorizationRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthorizationRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthorizationRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthorizationRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InfoAuthorizationRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
