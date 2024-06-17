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
public class BundledCareFeeAgreementChangeEvent extends SObject {
	public static SObjectType$<BundledCareFeeAgreementChangeEvent> SObjectType;
	public static SObjectFields$<BundledCareFeeAgreementChangeEvent> Fields;

	public Decimal BasicTierPrice;
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
	public Decimal MidTierPrice;
	public String Name;
	public Decimal PremiumTierPrice;
	public Id ProcedureBundleCodeId;
	public CodeSetBundle ProcedureBundleCode;
	public String ProcedureBundleDescription;
	public String ProcedureBundleItemList;
	public String ReplayId;

	public BundledCareFeeAgreementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BundledCareFeeAgreementChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BundledCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BundledCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BundledCareFeeAgreementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
