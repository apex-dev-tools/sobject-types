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
public class ContractPaymentAgreementChangeEvent extends SObject {
	public static SObjectType$<ContractPaymentAgreementChangeEvent> SObjectType;
	public static SObjectFields$<ContractPaymentAgreementChangeEvent> Fields;

	public String AgreementType;
	public Object ChangeEventHeader;
	public Id ContractId;
	public Contract Contract;
	public String ContractPaymentAgreementKey;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public String EligibleProcedureCodeList;
	public Datetime EndDateTime;
	public Id FeeScheduleDefinitionId;
	public FeeScheduleDefinition FeeScheduleDefinition;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LineofBusiness;
	public String Name;
	public String ReplayId;
	public Decimal StandardFeeCalculationPercentage;
	public Datetime StartDateTime;
	public String Status;

	public ContractPaymentAgreementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContractPaymentAgreementChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContractPaymentAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContractPaymentAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContractPaymentAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
