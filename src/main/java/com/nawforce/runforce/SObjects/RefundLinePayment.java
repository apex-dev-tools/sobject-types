/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class RefundLinePayment extends SObject {
	public static SObjectType$<RefundLinePayment> SObjectType;
	public static SObjectFields$<RefundLinePayment> Fields;

	public Decimal Amount;
	public Datetime AppliedDate;
	public Id AssociatedAccountId;
	public Account AssociatedAccount;
	public Id AssociatedRefundLinePaymentId;
	public RefundLinePayment AssociatedRefundLinePayment;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime Date;
	public Datetime EffectiveDate;
	public Decimal EffectiveImpactAmount;
	public String HasBeenUnapplied;
	public Id Id;
	public Decimal ImpactAmount;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal PaymentBalance;
	public Id PaymentId;
	public Payment Payment;
	public Decimal RefundBalance;
	public Id RefundId;
	public Refund Refund;
	public String RefundLinePaymentNumber;
	public Datetime SystemModstamp;
	public String Type;
	public Datetime UnappliedDate;

	public FinanceTransaction[] DestinationFinanceTransactions;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FinanceTransaction[] FinanceTransactions;
	public FinanceTransaction[] ParentFinanceTransactions;
	public RevenueTransactionErrorLog[] PrimaryRevenueTransactionErrorLogs;
	public RefundLinePayment[] RefundLinePayments;
	public RevenueTransactionErrorLog[] RelatedRevenueTransactionErrorLogs;
	public FinanceTransaction[] SourceFinanceTransactions;

	public RefundLinePayment clone$() {throw new java.lang.UnsupportedOperationException();}
	public RefundLinePayment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RefundLinePayment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RefundLinePayment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RefundLinePayment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
