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
public class UsageResource extends SObject {
	public static SObjectType$<UsageResource> SObjectType;
	public static SObjectFields$<UsageResource> Fields;

	public String Category;
	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DefaultUnitOfMeasureId;
	public UnitOfMeasure DefaultUnitOfMeasure;
	public String Description;
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
	public String Status;
	public Datetime SystemModstamp;
	public Id TokenResourceId;
	public UsageResource TokenResource;
	public Id UnitOfMeasureClassId;
	public UnitOfMeasureClass UnitOfMeasureClass;
	public Id UsageDefinitionProductId;
	public Product2 UsageDefinitionProduct;
	public Id UsageResourceBillingPolicyId;
	public UsageResourceBillingPolicy UsageResourceBillingPolicy;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public BindingObjUsageRsrcPlcy[] BindingObjUsageRsrcPlcies;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public UsageResourceFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public UsageResourceHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductUsageResource[] ProductUsageResources;
	public RateAdjustmentByAttribute[] RateAdjustmentByAttributes;
	public RateAdjustmentByTier[] RateAdjustmentByTiers;
	public RateCardEntry[] RateCardEntries;
	public RatingFrequencyPolicy[] RatingFrequencyPolicies;
	public UsageResourceShare[] Shares;
	public UsageRatableSummary[] SourceUR_RatableSummaries;
	public OrderItemUsageRsrcGrant[] TokenResources;
	public ProductUsageResource[] TokenResources;
	public TransactionUsageEntitlement[] TokenResources;
	public UsageResource[] TokenResources;
	public TransactionUsageEntitlement[] UR_TransactionUsageEntitlements;
	public UsageSummary[] UR_UsageSummaries;
	public UsageResourcePolicy[] UsageResourcePolicies;
	public UsageEntitlementBucket[] UsageResource_Buckets;
	public UsageRatableSummary[] UsageResource_RatableSummaries;
	public UsageBillingPeriodItem[] UsageResource_UsageBillingPeriodItems;
	public TransactionJournal[] UsageResources;

	public UsageResource clone$() {throw new java.lang.UnsupportedOperationException();}
	public UsageResource clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UsageResource clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UsageResource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UsageResource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
