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
public class FinanceTransaction extends SObject {
	public static SObjectType$<FinanceTransaction> SObjectType;
	public static SObjectFields$<FinanceTransaction> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal AdjustmentAmount;
	public Decimal BaseCurrencyAmount;
	public Decimal BaseCurrencyBalance;
	public Date BaseCurrencyFxDate;
	public Decimal BaseCurrencyFxRate;
	public String BaseCurrencyIsoCode;
	public Decimal ChargeAmount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CreationMode;
	public String CurrencyIsoCode;
	public Id DestinationEntityId;
	public Name DestinationEntity;
	public Datetime DueDate;
	public Datetime EffectiveDate;
	public String EventAction;
	public String EventType;
	public String FinanceSystemIntegrationMode;
	public String FinanceSystemIntegrationStatus;
	public String FinanceSystemName;
	public String FinanceSystemTransactionNumber;
	public String FinanceTransactionNumber;
	public Id Id;
	public Decimal ImpactAmount;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LegalEntityId;
	public LegalEntity LegalEntity;
	public String OriginalCreditGlAccountName;
	public String OriginalCreditGlAccountNumber;
	public String OriginalDebitGlAccountName;
	public String OriginalDebitGlAccountNumber;
	public String OriginalEventAction;
	public String OriginalEventType;
	public String OriginalFinanceBookName;
	public String OriginalFinancePeriodEndDate;
	public String OriginalFinancePeriodName;
	public String OriginalFinancePeriodStartDate;
	public String OriginalFinancePeriodStatus;
	public String OriginalGlRuleName;
	public String OriginalGlTreatmentName;
	public String OriginalReferenceEntityType;
	public Id OwnerId;
	public Name Owner;
	public Id ParentReferenceEntityId;
	public Name ParentReferenceEntity;
	public Id ReferenceEntityId;
	public Name ReferenceEntity;
	public String ReferenceEntityType;
	public Decimal ResultingBalance;
	public Id SourceEntityId;
	public Name SourceEntity;
	public Decimal Subtotal;
	public Datetime SystemModstamp;
	public Decimal TaxAmount;
	public Decimal TotalAmountWithTax;
	public Datetime TransactionDate;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public FinanceTransactionShare[] Shares;

	public FinanceTransaction clone$() {throw new java.lang.UnsupportedOperationException();}
	public FinanceTransaction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FinanceTransaction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FinanceTransaction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FinanceTransaction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
