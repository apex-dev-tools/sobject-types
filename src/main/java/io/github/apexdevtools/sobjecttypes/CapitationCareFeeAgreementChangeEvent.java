/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CapitationCareFeeAgreementChangeEvent extends SObject {
	public static SObjectType$<CapitationCareFeeAgreementChangeEvent> SObjectType;
	public static SObjectFields$<CapitationCareFeeAgreementChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ContractPaymentAgreementId;
	public ContractPaymentAgreement ContractPaymentAgreement;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer MemberAgeRangeLowerLimit;
	public Integer MemberAgeRangeUpperLimit;
	public Decimal MonthlyBalanceFee;
	public Decimal MonthlyFee;
	public Decimal MonthlyWithheldPercentage;
	public String Name;
	public String ReplayId;

	public CapitationCareFeeAgreementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CapitationCareFeeAgreementChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CapitationCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CapitationCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CapitationCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
