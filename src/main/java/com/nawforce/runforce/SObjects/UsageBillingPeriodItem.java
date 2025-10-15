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
public class UsageBillingPeriodItem extends SObject {
	public static SObjectType$<UsageBillingPeriodItem> SObjectType;
	public static SObjectFields$<UsageBillingPeriodItem> Fields;

	public Id AccountId;
	public Account Account;
	public Id AssetId;
	public Asset Asset;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndDateTime;
	public String ErrorCode;
	public String ErrorDescription;
	public Id GrantBindingTargetId;
	public Name GrantBindingTarget;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal OverageAmount;
	public Decimal OverageAmountDerived;
	public Decimal OverageQuantity;
	public Id OwnerId;
	public Name Owner;
	public Datetime StartDateTime;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal TotalUsedQuantity;
	public Id UoMId;
	public UnitOfMeasure UoM;
	public String UsageBillingPeriodItemNum;
	public Id UsageEntitlementAccountId;
	public UsageEntitlementAccount UsageEntitlementAccount;
	public Id UsageEntitlementBucketId;
	public UsageEntitlementBucket UsageEntitlementBucket;
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
	public UsageBillingPeriodItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public UsageBillingPeriodItemHistory[] Histories;
	public UsageSummary[] LS_UsageSummaries;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public UsageBillingPeriodItemShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public UsageBillingPeriodItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public UsageBillingPeriodItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UsageBillingPeriodItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UsageBillingPeriodItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UsageBillingPeriodItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
