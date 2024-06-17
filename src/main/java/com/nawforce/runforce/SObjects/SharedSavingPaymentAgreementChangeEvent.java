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
public class SharedSavingPaymentAgreementChangeEvent extends SObject {
	public static SObjectType$<SharedSavingPaymentAgreementChangeEvent> SObjectType;
	public static SObjectFields$<SharedSavingPaymentAgreementChangeEvent> Fields;

	public Datetime BenchmarkEndDateTime;
	public Datetime BenchmarkStartDateTime;
	public Decimal BenchmarkedExpenditureAmount;
	public Object ChangeEventHeader;
	public Id ContractPaymentAgreementId;
	public ContractPaymentAgreement ContractPaymentAgreement;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Decimal ForecastedExpenditureAmount;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LossPlanDescription;
	public String Name;
	public String ProfitPlanDescription;
	public Decimal QualifyingProfitPercentage;
	public String ReplayId;

	public SharedSavingPaymentAgreementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SharedSavingPaymentAgreementChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SharedSavingPaymentAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SharedSavingPaymentAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SharedSavingPaymentAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
