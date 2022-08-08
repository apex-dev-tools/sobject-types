/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
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
	public com.nawforce.runforce.System.String BaseCurrencyIsoCode;
	public Decimal ChargeAmount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CreationMode;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Id DestinationEntityId;
	public Name DestinationEntity;
	public Datetime DueDate;
	public Datetime EffectiveDate;
	public com.nawforce.runforce.System.String EventAction;
	public com.nawforce.runforce.System.String EventType;
	public com.nawforce.runforce.System.String FinanceSystemIntegrationMode;
	public com.nawforce.runforce.System.String FinanceSystemIntegrationStatus;
	public com.nawforce.runforce.System.String FinanceSystemName;
	public com.nawforce.runforce.System.String FinanceSystemTransactionNumber;
	public com.nawforce.runforce.System.String FinanceTransactionNumber;
	public Id Id;
	public Decimal ImpactAmount;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LegalEntityId;
	public Name LegalEntity;
	public com.nawforce.runforce.System.String OriginalCreditGlAccountName;
	public com.nawforce.runforce.System.String OriginalCreditGlAccountNumber;
	public com.nawforce.runforce.System.String OriginalDebitGlAccountName;
	public com.nawforce.runforce.System.String OriginalDebitGlAccountNumber;
	public com.nawforce.runforce.System.String OriginalEventAction;
	public com.nawforce.runforce.System.String OriginalEventType;
	public com.nawforce.runforce.System.String OriginalFinanceBookName;
	public com.nawforce.runforce.System.String OriginalFinancePeriodEndDate;
	public com.nawforce.runforce.System.String OriginalFinancePeriodName;
	public com.nawforce.runforce.System.String OriginalFinancePeriodStartDate;
	public com.nawforce.runforce.System.String OriginalFinancePeriodStatus;
	public com.nawforce.runforce.System.String OriginalGlRuleName;
	public com.nawforce.runforce.System.String OriginalGlTreatmentName;
	public com.nawforce.runforce.System.String OriginalReferenceEntityType;
	public Id OwnerId;
	public Name Owner;
	public Id ParentReferenceEntityId;
	public Name ParentReferenceEntity;
	public Id ReferenceEntityId;
	public Name ReferenceEntity;
	public com.nawforce.runforce.System.String ReferenceEntityType;
	public Decimal ResultingBalance;
	public Id SourceEntityId;
	public Name SourceEntity;
	public Decimal Subtotal;
	public Datetime SystemModstamp;
	public Decimal TaxAmount;
	public Decimal TotalAmountWithTax;
	public Datetime TransactionDate;

	public FinanceBalanceSnapshot[] FinanceBalanceSnapshots;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public FinanceTransactionShare[] Shares;

	public FinanceTransaction clone$() {throw new java.lang.UnsupportedOperationException();}
	public FinanceTransaction clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FinanceTransaction clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FinanceTransaction clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FinanceTransaction clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
