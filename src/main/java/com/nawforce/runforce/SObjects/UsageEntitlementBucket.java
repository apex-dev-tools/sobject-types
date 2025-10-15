/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class UsageEntitlementBucket extends SObject {
	public static SObjectType$<UsageEntitlementBucket> SObjectType;
	public static SObjectFields$<UsageEntitlementBucket> Fields;

	public Decimal BucketBalance;
	public Id BucketBalanceUomId;
	public UnitOfMeasure BucketBalanceUom;
	public Integer CompletedRollovers;
	public Decimal ConsumedEntitlement;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EffectiveEndDateTime;
	public Datetime EffectiveStartDateTime;
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
	public Id ParentId;
	public Name Parent;
	public Datetime SystemModstamp;
	public Decimal TotalAsOfBalance;
	public Decimal TotalConsumedEntitlement;
	public Id TransactionUsageEntitlementId;
	public TransactionUsageEntitlement TransactionUsageEntitlement;
	public Id UsageResourceId;
	public UsageResource UsageResource;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public UsageBillingPeriodItem[] Bucket_UsageBillingPeriodItems;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public UsageEntitlementEntry[] EB_UsageEntitlementEntries;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public UsageEntitlementBucketFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public UsageEntitlementBucketHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public UsageEntitlementEntry[] PEB_UsageEntitlementEntry;
	public UsageEntitlementBucket[] Parent_Buckets;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public UsageEntitlementBucketShare[] Shares;
	public UsageEntitlementEntry[] TB_UsageEntitlementEntries;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public UsageRatableSummary[] UEB_RatableSummaries;
	public UsageSummary[] UEB_UsageSummaries;

	public UsageEntitlementBucket clone$() {throw new java.lang.UnsupportedOperationException();}
	public UsageEntitlementBucket clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UsageEntitlementBucket clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UsageEntitlementBucket clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UsageEntitlementBucket clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
