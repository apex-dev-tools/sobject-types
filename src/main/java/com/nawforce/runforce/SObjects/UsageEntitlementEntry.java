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
public class UsageEntitlementEntry extends SObject {
	public static SObjectType$<UsageEntitlementEntry> SObjectType;
	public static SObjectFields$<UsageEntitlementEntry> Fields;

	public Decimal ClosingBalance;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EffectiveEndDateTime;
	public Datetime EffectiveStartDateTime;
	public Id EntitlementBucketId;
	public UsageEntitlementBucket EntitlementBucket;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Decimal OpeningBalance;
	public Id ParentEntitlementBucketId;
	public UsageEntitlementBucket ParentEntitlementBucket;
	public Datetime SystemModstamp;
	public Datetime TransactionDate;
	public Decimal TransactionQuantity;
	public String TransactionReason;
	public String TransactionType;
	public Id TransactionUsageEntitlementId;
	public TransactionUsageEntitlement TransactionUsageEntitlement;
	public Id TransactionalBucketId;
	public UsageEntitlementBucket TransactionalBucket;
	public Id UomId;
	public UnitOfMeasure Uom;
	public Id UsageSummaryId;
	public UsageSummary UsageSummary;

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
	public UsageEntitlementEntryFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public UsageEntitlementEntryHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public UsageEntitlementEntry clone$() {throw new java.lang.UnsupportedOperationException();}
	public UsageEntitlementEntry clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UsageEntitlementEntry clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UsageEntitlementEntry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UsageEntitlementEntry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
