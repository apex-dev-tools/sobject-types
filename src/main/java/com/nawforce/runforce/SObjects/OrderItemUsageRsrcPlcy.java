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
public class OrderItemUsageRsrcPlcy extends SObject {
	public static SObjectType$<OrderItemUsageRsrcPlcy> SObjectType;
	public static SObjectFields$<OrderItemUsageRsrcPlcy> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Division;
	public String DrawdownOrder;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OrderItemId;
	public OrderItem OrderItem;
	public Id ProductUsageResourcePolicyId;
	public ProductUsageResourcePolicy ProductUsageResourcePolicy;
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
	public OrderItemUsageRsrcPlcyFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public OrderItemUsageRsrcPlcyHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public OrderItemUsageRsrcPlcy clone$() {throw new java.lang.UnsupportedOperationException();}
	public OrderItemUsageRsrcPlcy clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OrderItemUsageRsrcPlcy clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OrderItemUsageRsrcPlcy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OrderItemUsageRsrcPlcy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
