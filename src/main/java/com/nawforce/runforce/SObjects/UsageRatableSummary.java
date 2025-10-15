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
public class UsageRatableSummary extends SObject {
	public static SObjectType$<UsageRatableSummary> SObjectType;
	public static SObjectFields$<UsageRatableSummary> Fields;

	public Id AccountId;
	public Account Account;
	public Id AssetId;
	public Asset Asset;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
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
	public String Name;
	public Decimal NetUnitRate;
	public Id NetUnitRateUomId;
	public UnitOfMeasure NetUnitRateUom;
	public Decimal OverageQuantity;
	public Id OverageQuantityUomId;
	public UnitOfMeasure OverageQuantityUom;
	public Id OwnerId;
	public Name Owner;
	public Datetime RatingDecisionDateTime;
	public String RatingExecutionIdentifier;
	public Id RatingRequestId;
	public RatingRequest RatingRequest;
	public Id SourceUsageResourceId;
	public UsageResource SourceUsageResource;
	public Datetime StartDateTime;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal TierQuantity;
	public Id TierQuantityUomId;
	public UnitOfMeasure TierQuantityUom;
	public Decimal TotalAmount;
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
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public UsageRatableSummaryHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public UsageSummary[] RS_UsageSummaries;
	public UsageRatableSummaryShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public UsageRatableSumCmtAssetRt[] UsageRatableSumCmtAssetRates;

	public UsageRatableSummary clone$() {throw new java.lang.UnsupportedOperationException();}
	public UsageRatableSummary clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UsageRatableSummary clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UsageRatableSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UsageRatableSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
