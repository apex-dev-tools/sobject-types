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
public class InsurancePolicyTransactionChangeEvent extends SObject {
	public static SObjectType$<InsurancePolicyTransactionChangeEvent> SObjectType;
	public static SObjectFields$<InsurancePolicyTransactionChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Id InsurancePolicyId;
	public InsurancePolicy InsurancePolicy;
	public Id InsurancePolicyVersionId;
	public InsurancePolicy InsurancePolicyVersion;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ParentTransactionId;
	public InsurancePolicyTransaction ParentTransaction;
	public String ReplayId;
	public String Status;
	public Decimal TotalTransactionAmount;
	public Decimal TransactionAmount;
	public Datetime TransactionEffectiveDate;
	public Decimal TransactionFeeAmount;
	public String TransactionNumber;
	public Datetime TransactionPostedDate;
	public Decimal TransactionTaxAmount;
	public String Type;

	public InsurancePolicyTransactionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyTransactionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyTransactionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyTransactionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsurancePolicyTransactionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
