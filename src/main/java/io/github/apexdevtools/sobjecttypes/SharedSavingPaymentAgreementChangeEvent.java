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
