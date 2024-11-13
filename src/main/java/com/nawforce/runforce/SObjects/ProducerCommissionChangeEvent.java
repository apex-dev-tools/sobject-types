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
public class ProducerCommissionChangeEvent extends SObject {
	public static SObjectType$<ProducerCommissionChangeEvent> SObjectType;
	public static SObjectFields$<ProducerCommissionChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Decimal CommissionAmount;
	public Decimal CommissionableAmount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id InsurancePolicyAssetId;
	public InsurancePolicyAsset InsurancePolicyAsset;
	public Id InsurancePolicyCoverageId;
	public InsurancePolicyCoverage InsurancePolicyCoverage;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Id InsurancePolicyTransactionId;
	public InsurancePolicyTransaction InsurancePolicyTransaction;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal MaxCommissionAmount;
	public Decimal MinCommissionAmount;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentProducerCommissionId;
	public ProducerCommission ParentProducerCommission;
	public Datetime PaymentDatetime;
	public Id ProcessingProducerId;
	public Producer ProcessingProducer;
	public Id ProducerId;
	public SObject Producer;
	public String ProducerProductionCode;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;
	public String Type;

	public ProducerCommissionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProducerCommissionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProducerCommissionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProducerCommissionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProducerCommissionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
