/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PaymentCreditTransaction extends SObject {
	public static SObjectType$<PaymentCreditTransaction> SObjectType;
	public static SObjectFields$<PaymentCreditTransaction> Fields;

	public Decimal Amount;
	public Id AssociatedAccountId;
	public Account AssociatedAccount;
	public String ClientContext;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ExternalReference;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id PaymentCreditId;
	public PaymentCredit PaymentCredit;
	public String PaymentCreditTransactionNumber;
	public String ProcessingMode;
	public String Status;
	public Datetime SystemModstamp;
	public String TransactionMessage;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public PaymentCreditTransaction clone$() {throw new java.lang.UnsupportedOperationException();}
	public PaymentCreditTransaction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PaymentCreditTransaction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PaymentCreditTransaction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PaymentCreditTransaction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
