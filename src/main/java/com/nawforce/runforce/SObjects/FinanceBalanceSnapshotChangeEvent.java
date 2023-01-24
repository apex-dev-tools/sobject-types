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
public class FinanceBalanceSnapshotChangeEvent extends SObject {
	public static SObjectType$<FinanceBalanceSnapshotChangeEvent> SObjectType;
	public static SObjectFields$<FinanceBalanceSnapshotChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal AdjustmentAmount;
	public Decimal Balance;
	public Decimal BaseCurrencyAmount;
	public Decimal BaseCurrencyBalance;
	public Date BaseCurrencyFxDate;
	public Decimal BaseCurrencyFxRate;
	public String BaseCurrencyIsoCode;
	public Object ChangeEventHeader;
	public Decimal ChargeAmount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime DueDate;
	public Datetime EffectiveDate;
	public String EventType;
	public String FinanceBalanceSnapshotNumber;
	public String FinanceSystemIntegrationMode;
	public String FinanceSystemIntegrationStatus;
	public String FinanceSystemName;
	public String FinanceSystemTransactionNumber;
	public Id FinanceTransactionId;
	public FinanceTransaction FinanceTransaction;
	public Id Id;
	public Decimal ImpactAmount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LegalEntityId;
	public LegalEntity LegalEntity;
	public String OriginalEventType;
	public String OriginalReferenceEntityType;
	public Id OwnerId;
	public User Owner;
	public Id ReferenceEntityId;
	public SObject ReferenceEntity;
	public String ReferenceEntityType;
	public String ReplayId;
	public Decimal Subtotal;
	public Decimal TaxAmount;
	public Decimal TotalAmountWithTax;
	public Datetime TransactionDate;

	public FinanceBalanceSnapshotChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FinanceBalanceSnapshotChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FinanceBalanceSnapshotChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FinanceBalanceSnapshotChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FinanceBalanceSnapshotChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
