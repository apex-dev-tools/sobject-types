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
public class DocumentChecklistItem extends SObject {
	public static SObjectType$<DocumentChecklistItem> SObjectType;
	public static SObjectFields$<DocumentChecklistItem> Fields;

	public Id AccountId;
	public Account Account;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DocumentCategoryId;
	public DocumentCategory DocumentCategory;
	public Id Id;
	public String Instruction;
	public Boolean IsAccepted;
	public Boolean IsDeleted;
	public Boolean IsFrozen;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ParentRecordId;
	public Name ParentRecord;
	public Id ReceivedDocumentId;
	public ReceivedDocument ReceivedDocument;
	public String Status;
	public Datetime SystemModstamp;
	public String TransformationInfo;
	public Id UploadedById;
	public User UploadedBy;
	public Id WhoId;
	public Name Who;

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
	public DocumentChecklistItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public DocumentChecklistItemHistory[] Histories;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DocumentChecklistItemShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public DocumentChecklistItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public DocumentChecklistItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DocumentChecklistItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DocumentChecklistItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DocumentChecklistItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
