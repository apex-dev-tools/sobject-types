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
public class StandardCareFeeAgreementChangeEvent extends SObject {
	public static SObjectType$<StandardCareFeeAgreementChangeEvent> SObjectType;
	public static SObjectFields$<StandardCareFeeAgreementChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ContractPaymentAgreementId;
	public ContractPaymentAgreement ContractPaymentAgreement;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Decimal FacilityPrice;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Decimal NonFacilityPrice;
	public String ProcedureCodeDescription;
	public Id ProcedureCodeId;
	public CodeSetBundle ProcedureCode;
	public String ReplayId;
	public String StdCareFeeAgreementKey;

	public StandardCareFeeAgreementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public StandardCareFeeAgreementChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StandardCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StandardCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StandardCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
