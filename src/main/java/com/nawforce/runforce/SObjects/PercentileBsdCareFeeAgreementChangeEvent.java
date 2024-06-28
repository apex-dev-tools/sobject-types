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
public class PercentileBsdCareFeeAgreementChangeEvent extends SObject {
	public static SObjectType$<PercentileBsdCareFeeAgreementChangeEvent> SObjectType;
	public static SObjectFields$<PercentileBsdCareFeeAgreementChangeEvent> Fields;

	public String BracketInformation;
	public Object ChangeEventHeader;
	public Id ContractPaymentAgreementId;
	public ContractPaymentAgreement ContractPaymentAgreement;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Decimal FifthBracketPrice;
	public Decimal FirstBracketPrice;
	public Decimal FourthBracketPrice;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ProcedureCodeDescription;
	public Id ProcedureCodeId;
	public CodeSetBundle ProcedureCode;
	public Decimal RelativeValueUnit;
	public String ReplayId;
	public Decimal SecondBracketPrice;
	public Decimal StandardPrice;
	public Decimal ThirdBracketPrice;

	public PercentileBsdCareFeeAgreementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PercentileBsdCareFeeAgreementChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PercentileBsdCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PercentileBsdCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PercentileBsdCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
