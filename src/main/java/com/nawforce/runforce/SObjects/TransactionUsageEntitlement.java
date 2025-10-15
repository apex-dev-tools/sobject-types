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
public class TransactionUsageEntitlement extends SObject {
	public static SObjectType$<TransactionUsageEntitlement> SObjectType;
	public static SObjectFields$<TransactionUsageEntitlement> Fields;

	public Id AccountId;
	public Account Account;
	public String ActionType;
	public Id AssetId;
	public Asset Asset;
	public String ChargeForOverage;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DrawdownOrder;
	public Datetime EffectiveEndDateTime;
	public Datetime EffectiveStartDateTime;
	public String EntitlementProcessingStatus;
	public Decimal EntitlementQuantity;
	public Id EntitlementUomClassId;
	public UnitOfMeasureClass EntitlementUomClass;
	public Id EntitlementUomId;
	public UnitOfMeasure EntitlementUom;
	public String ExternalOrderItem;
	public Id GrantBindingTargetId;
	public Name GrantBindingTarget;
	public String GrantType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Decimal NetQuantity;
	public Id OrderItemId;
	public Name OrderItem;
	public Id OwnerId;
	public Name Owner;
	public Id PricebookEntryId;
	public PricebookEntry PricebookEntry;
	public Id ProductId;
	public Product2 Product;
	public Id RatingFrequencyPolicyId;
	public RatingFrequencyPolicy RatingFrequencyPolicy;
	public Datetime SystemModstamp;
	public Id TokenResourceId;
	public UsageResource TokenResource;
	public Decimal TransactionQuantity;
	public Id UsageAggregationPolicyId;
	public UsageResourceBillingPolicy UsageAggregationPolicy;
	public Id UsageGrantRefreshPolicyId;
	public UsageGrantRenewalPolicy UsageGrantRefreshPolicy;
	public Id UsageGrantRolloverPolicyId;
	public UsageGrantRolloverPolicy UsageGrantRolloverPolicy;
	public String UsageModelType;
	public Id UsageResourceId;
	public UsageResource UsageResource;
	public Integer ValidityPeriodTerm;
	public String ValidityPeriodUnit;

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
	public TransactionUsageEntitlementFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public TransactionUsageEntitlementHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TransactionUsageEntitlementShare[] Shares;
	public UsageEntitlementEntry[] TUE_UsageEntitlementEntry;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public UsageEntitlementBucket[] TransactionUsageEntitlement_Buckets;

	public TransactionUsageEntitlement clone$() {throw new java.lang.UnsupportedOperationException();}
	public TransactionUsageEntitlement clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TransactionUsageEntitlement clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TransactionUsageEntitlement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TransactionUsageEntitlement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
