/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class BindingObjUsageRsrcPlcy extends SObject {
	public static SObjectType$<BindingObjUsageRsrcPlcy> SObjectType;
	public static SObjectFields$<BindingObjUsageRsrcPlcy> Fields;

	public Id BindingObjectId;
	public Name BindingObject;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DrawdownOrder;
	public Datetime EffectiveEndDate;
	public Datetime EffectiveStartDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id RatingFrequencyPolicyId;
	public RatingFrequencyPolicy RatingFrequencyPolicy;
	public Datetime SystemModstamp;
	public Id UsageAggregationPolicyId;
	public UsageResourceBillingPolicy UsageAggregationPolicy;
	public Id UsageCommitmentPolicyId;
	public UsageCommitmentPolicy UsageCommitmentPolicy;
	public Id UsageOveragePolicyId;
	public UsageOveragePolicy UsageOveragePolicy;
	public Id UsageResourceId;
	public UsageResource UsageResource;

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
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public BindingObjUsageRsrcPlcyFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public BindingObjUsageRsrcPlcyHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public BindingObjUsageRsrcPlcyShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public BindingObjUsageRsrcPlcy clone$() {throw new java.lang.UnsupportedOperationException();}
	public BindingObjUsageRsrcPlcy clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BindingObjUsageRsrcPlcy clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BindingObjUsageRsrcPlcy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BindingObjUsageRsrcPlcy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
