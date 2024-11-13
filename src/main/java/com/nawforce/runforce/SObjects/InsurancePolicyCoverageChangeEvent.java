/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class InsurancePolicyCoverageChangeEvent extends SObject {
	public static SObjectType$<InsurancePolicyCoverageChangeEvent> SObjectType;
	public static SObjectFields$<InsurancePolicyCoverageChangeEvent> Fields;

	public String BenefitPaymentFrequency;
	public String Category;
	public String CategoryCode;
	public String CategoryGroup;
	public String CategoryGroupType;
	public Object ChangeEventHeader;
	public Id ContractGroupPlanId;
	public ContractGroupPlan ContractGroupPlan;
	public String CoverageCode;
	public String CoverageName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DeathBenefitOptionType;
	public Decimal DeductibleAmount;
	public String Description;
	public Decimal Discount;
	public String Division;
	public Datetime EffectiveDate;
	public Datetime ExpirationDate;
	public Id Id;
	public String IncomeOptionType;
	public Id InsurancePolicyAssetId;
	public InsurancePolicyAsset InsurancePolicyAsset;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Id InsurancePolicyParticipantId;
	public InsurancePolicyParticipant InsurancePolicyParticipant;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal LimitAmount;
	public Date LimitDate;
	public Decimal LimitPercentage;
	public String LimitRange;
	public String Name;
	public Decimal PremiumAmount;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Decimal StandardFeeAmount;
	public Decimal StandardPremiumAmount;
	public Decimal StandardTaxAmount;
	public Decimal TermFeeAmount;
	public Decimal TermPremiumAmount;
	public Decimal TermTaxAmount;
	public Decimal TotalStandardAmount;

	public InsurancePolicyCoverageChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyCoverageChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyCoverageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyCoverageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyCoverageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
