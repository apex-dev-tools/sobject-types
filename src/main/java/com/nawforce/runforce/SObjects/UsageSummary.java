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
public class UsageSummary extends SObject {
	public static SObjectType$<UsageSummary> SObjectType;
	public static SObjectFields$<UsageSummary> Fields;

	public Id AccountId;
	public Account Account;
	public Id AssetId;
	public Asset Asset;
	public Decimal ConsumptionUnits;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal DebitedUnits;
	public Datetime EndDateTime;
	public Id GrantBindingTargetId;
	public Name GrantBindingTarget;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LiableSummaryId;
	public UsageBillingPeriodItem LiableSummary;
	public String Name;
	public Decimal OverageUnits;
	public Id OwnerId;
	public Name Owner;
	public Id ParentUsageSummaryId;
	public UsageSummary ParentUsageSummary;
	public Id RatableSummaryId;
	public UsageRatableSummary RatableSummary;
	public Datetime StartDateTime;
	public String Status;
	public Datetime SystemModstamp;
	public Id UomId;
	public UnitOfMeasure Uom;
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
	public UsageSummaryHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public UsageSummary[] Parent_UsageSummaries;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public UsageSummaryShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public UsageEntitlementEntry[] US_UsageEntitlementEntry;
	public TransactionJournal[] UsageSummaries;

	public UsageSummary clone$() {throw new java.lang.UnsupportedOperationException();}
	public UsageSummary clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UsageSummary clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UsageSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UsageSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
