/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class InsurancePolicySurchargeChangeEvent extends SObject {
	public static SObjectType$<InsurancePolicySurchargeChangeEvent> SObjectType;
	public static SObjectFields$<InsurancePolicySurchargeChangeEvent> Fields;

	public String ApplicableObjectType;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Id InsurancePolicyAssetId;
	public InsurancePolicyAsset InsurancePolicyAsset;
	public Id InsurancePolicyCoverageId;
	public InsurancePolicyCoverage InsurancePolicyCoverage;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Id InsurancePolicyParticipantId;
	public InsurancePolicyParticipant InsurancePolicyParticipant;
	public Id InsurancePolicyTransactionId;
	public InsurancePolicyTransaction InsurancePolicyTransaction;
	public Boolean IsProrationAllowed;
	public Boolean IsRefundAllowed;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OriginalSurchargeId;
	public InsurancePolicySurcharge OriginalSurcharge;
	public Id ParentSurchargeId;
	public InsurancePolicySurcharge ParentSurcharge;
	public Id PriorSurchargeId;
	public InsurancePolicySurcharge PriorSurcharge;
	public Id ProductSellingModelId;
	public ProductSellingModel ProductSellingModel;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Decimal SurchargeAmount;
	public Decimal TermSurchargeAmount;
	public String Type;

	public InsurancePolicySurchargeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicySurchargeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicySurchargeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicySurchargeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicySurchargeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
