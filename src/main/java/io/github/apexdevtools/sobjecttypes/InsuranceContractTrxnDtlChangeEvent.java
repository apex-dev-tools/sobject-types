/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.eventbus.ChangeEventHeader;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class InsuranceContractTrxnDtlChangeEvent extends SObject {
	public static SObjectType$<InsuranceContractTrxnDtlChangeEvent> SObjectType;
	public static SObjectFields$<InsuranceContractTrxnDtlChangeEvent> Fields;

	public Decimal Amount;
	public ChangeEventHeader ChangeEventHeader;
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
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ParentContractTrxnDetailId;
	public InsuranceContractTrxnDtl ParentContractTrxnDetail;
	public String ReplayId;
	public Decimal Tax;

	public InsuranceContractTrxnDtlChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractTrxnDtlChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractTrxnDtlChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractTrxnDtlChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractTrxnDtlChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
