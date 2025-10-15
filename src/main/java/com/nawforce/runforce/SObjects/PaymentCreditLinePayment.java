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
public class PaymentCreditLinePayment extends SObject {
	public static SObjectType$<PaymentCreditLinePayment> SObjectType;
	public static SObjectFields$<PaymentCreditLinePayment> Fields;

	public Decimal Amount;
	public Datetime AppliedDate;
	public Id AssociatedAccountId;
	public Account AssociatedAccount;
	public Id AssociatedLineId;
	public PaymentCreditLinePayment AssociatedLine;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Boolean HasBeenUnapplied;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id PaymentCreditId;
	public PaymentCredit PaymentCredit;
	public String PaymentCreditLinePaymentNumber;
	public Id PaymentId;
	public Payment Payment;
	public Datetime SystemModstamp;
	public String Type;
	public Datetime UnappliedDate;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public PaymentCreditLinePayment[] PaymentCreditLinePayments;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public PaymentCreditLinePayment clone$() {throw new java.lang.UnsupportedOperationException();}
	public PaymentCreditLinePayment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PaymentCreditLinePayment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PaymentCreditLinePayment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PaymentCreditLinePayment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
