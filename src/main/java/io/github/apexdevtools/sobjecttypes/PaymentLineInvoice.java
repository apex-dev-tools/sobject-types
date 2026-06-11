/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PaymentLineInvoice extends SObject {
	public static SObjectType$<PaymentLineInvoice> SObjectType;
	public static SObjectFields$<PaymentLineInvoice> Fields;

	public Decimal Amount;
	public Datetime AppliedDate;
	public Id AssociatedAccountId;
	public Account AssociatedAccount;
	public Id AssociatedPaymentLineId;
	public PaymentLineInvoice AssociatedPaymentLine;
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
	public Id InvoiceId;
	public Invoice Invoice;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal PaymentBalance;
	public Id PaymentId;
	public Payment Payment;
	public String PaymentLineInvoiceNumber;
	public Datetime SystemModstamp;
	public String Type;
	public Datetime UnappliedDate;

	public PaymentLineInvoice[] AssociatedPaymentLines;
	public FinanceTransaction[] DestinationFinanceTransactions;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FinanceTransaction[] FinanceTransactions;
	public FinanceTransaction[] ParentFinanceTransactions;
	public RevenueTransactionErrorLog[] PrimaryRevenueTransactionErrorLogs;
	public RevenueTransactionErrorLog[] RelatedRevenueTransactionErrorLogs;
	public FinanceTransaction[] SourceFinanceTransactions;

	public PaymentLineInvoice clone$() {throw new java.lang.UnsupportedOperationException();}
	public PaymentLineInvoice clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PaymentLineInvoice clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PaymentLineInvoice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PaymentLineInvoice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
