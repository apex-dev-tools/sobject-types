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
public class Refund extends SObject {
	public static SObjectType$<Refund> SObjectType;
	public static SObjectFields$<Refund> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal Amount;
	public Decimal Balance;
	public Datetime CancellationDate;
	public Datetime CancellationEffectiveDate;
	public Datetime CancellationGatewayDate;
	public String CancellationGatewayRefNumber;
	public String CancellationGatewayResultCode;
	public String CancellationSfResultCode;
	public String ClientContext;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime Date;
	public Datetime EffectiveDate;
	public String Email;
	public Datetime GatewayDate;
	public String GatewayRefNumber;
	public String GatewayResultCode;
	public String GatewayResultCodeDescription;
	public Id Id;
	public Decimal ImpactAmount;
	public String IpAddress;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MacAddress;
	public Decimal NetApplied;
	public Id PaymentGatewayId;
	public PaymentGateway PaymentGateway;
	public Id PaymentGroupId;
	public PaymentGroup PaymentGroup;
	public Id PaymentMethodId;
	public PaymentMethod PaymentMethod;
	public String Phone;
	public String ProcessingMode;
	public String RefundNumber;
	public String SfResultCode;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal TotalApplied;
	public Decimal TotalUnapplied;
	public String Type;

	public FinanceTransaction[] DestinationFinanceTransactions;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FinanceTransaction[] FinanceTransactions;
	public FinanceTransaction[] ParentFinanceTransactions;
	public PaymentGatewayLog[] PaymentGatewayLogs;
	public RevenueTransactionErrorLog[] PrimaryRevenueTransactionErrorLogs;
	public ProcessException[] ProcessExceptions;
	public RefundLinePayment[] RefundLinePayments;
	public RevenueTransactionErrorLog[] RelatedRevenueTransactionErrorLogs;
	public FinanceTransaction[] SourceFinanceTransactions;

	public Refund clone$() {throw new java.lang.UnsupportedOperationException();}
	public Refund clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Refund clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Refund clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Refund clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
