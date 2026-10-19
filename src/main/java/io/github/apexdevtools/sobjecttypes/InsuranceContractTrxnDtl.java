/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class InsuranceContractTrxnDtl extends SObject {
	public static SObjectType$<InsuranceContractTrxnDtl> SObjectType;
	public static SObjectFields$<InsuranceContractTrxnDtl> Fields;

	public Decimal Amount;
	public String ChargeType;
	public Id ContractGroupPlanId;
	public ContractGroupPlan ContractGroupPlan;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Decimal Fee;
	public Id GroupClassId;
	public GroupClass GroupClass;
	public Id Id;
	public Id InsuranceContractTrxnId;
	public InsuranceContractTrxn InsuranceContractTrxn;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id ParentContractTrxnDetailId;
	public InsuranceContractTrxnDtl ParentContractTrxnDetail;
	public Datetime SystemModstamp;
	public Decimal Tax;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public InsuranceContractTrxnDtl[] ChildTransactionDetails;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public InsuranceContractTrxnDtlFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public InsuranceContractTrxnDtlHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public InsuranceContractTrxnDtl clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractTrxnDtl clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractTrxnDtl clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractTrxnDtl clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractTrxnDtl clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
