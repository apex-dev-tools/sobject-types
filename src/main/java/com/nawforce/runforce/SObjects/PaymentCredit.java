/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PaymentCredit extends SObject {
	public static SObjectType$<PaymentCredit> SObjectType;
	public static SObjectFields$<PaymentCredit> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal Amount;
	public Decimal Balance;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id CreditMemoId;
	public CreditMemo CreditMemo;
	public String CreditType;
	public String CreditTypeCategory;
	public String CurrencyIsoCode;
	public Datetime EffectiveDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal NetApplied;
	public String PaymentCreditNumber;
	public Id PaymentId;
	public Payment Payment;
	public Id ReturnOrderId;
	public ReturnOrder ReturnOrder;
	public Datetime SystemModstamp;
	public Decimal TotalApplied;
	public Decimal TotalCreditPendingTxnAmt;
	public Decimal TotalCreditTxnAmt;
	public Decimal TotalUnapplied;

	public PaymentCreditLinePayment[] PaymentCreditLinePayments;
	public PaymentCreditTransaction[] PaymentCreditTransactions;

	public PaymentCredit clone$() {throw new java.lang.UnsupportedOperationException();}
	public PaymentCredit clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PaymentCredit clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PaymentCredit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PaymentCredit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
