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
public class CategorizedCareFeeAgreementChangeEvent extends SObject {
	public static SObjectType$<CategorizedCareFeeAgreementChangeEvent> SObjectType;
	public static SObjectFields$<CategorizedCareFeeAgreementChangeEvent> Fields;

	public String CategorizedCareFeeAgreeKey;
	public Object ChangeEventHeader;
	public Id ContractPaymentAgreementId;
	public ContractPaymentAgreement ContractPaymentAgreement;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LineofBusiness;
	public String Name;
	public String PricingInformation;
	public String ProcedureCategory;
	public String ReplayId;

	public CategorizedCareFeeAgreementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CategorizedCareFeeAgreementChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CategorizedCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CategorizedCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CategorizedCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
