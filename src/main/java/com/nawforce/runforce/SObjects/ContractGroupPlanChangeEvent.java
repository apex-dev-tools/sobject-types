/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContractGroupPlanChangeEvent extends SObject {
	public static SObjectType$<ContractGroupPlanChangeEvent> SObjectType;
	public static SObjectFields$<ContractGroupPlanChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Object ChangeEventHeader;
	public Id ContractGroupParentPlanId;
	public ContractGroupPlan ContractGroupParentPlan;
	public Id ContractId;
	public Contract Contract;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Datetime EffectiveEndDate;
	public Datetime EffectiveStartDate;
	public String EligibilityCriteria;
	public Date EnrollmentEndDate;
	public String EnrollmentRatingType;
	public Date EnrollmentStartDate;
	public Integer EnrollmentWaitingPeriod;
	public String GroupNumber;
	public Id Id;
	public Boolean IsOptional;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OriginalContractPlanId;
	public ContractGroupPlan OriginalContractPlan;
	public String PlanType;
	public String PricingStructure;
	public Id Product2Id;
	public Product2 Product2;
	public Id ProductCategoryId;
	public ProductCategory ProductCategory;
	public Integer ProductNumber;
	public String ReplayId;
	public String Status;
	public Decimal UnitPrice;
	public String UsageType;

	public ContractGroupPlanChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlanChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContractGroupPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
