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
public class LoanApplicationLiabilityChangeEvent extends SObject {
	public static SObjectType$<LoanApplicationLiabilityChangeEvent> SObjectType;
	public static SObjectFields$<LoanApplicationLiabilityChangeEvent> Fields;

	public String AccountNumber;
	public String AccountType;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CreditLimitAmount;
	public String CreditorName;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsJointLiability;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LiabilityClass;
	public String LiabilityExtIdentifier;
	public Id LoanApplicationAssetId;
	public LoanApplicationAsset LoanApplicationAsset;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public String LoanType;
	public Decimal MonthlyPaymentAmount;
	public String Name;
	public String OtherLiabilityType;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Boolean ShouldBePaidInFull;
	public Decimal UnpaidBalanceAmount;

	public LoanApplicationLiabilityChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationLiabilityChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationLiabilityChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationLiabilityChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationLiabilityChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
