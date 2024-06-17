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
public class LoanApplicantDeclarationChangeEvent extends SObject {
	public static SObjectType$<LoanApplicantDeclarationChangeEvent> SObjectType;
	public static SObjectFields$<LoanApplicantDeclarationChangeEvent> Fields;

	public String BankruptcyType;
	public Decimal BorrowedAmount;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DeclarationExtIdentifier;
	public Boolean HasBorrowedMoney;
	public Boolean HasDeclaredBankruptcy;
	public Boolean HasDeedSurrender;
	public Boolean HasOutstandingJudgement;
	public Boolean HasOwnershipInterest;
	public Boolean HasPastShortSale;
	public Boolean HasPropertyForeclosed;
	public Boolean HasUndisclAddlCreditApp;
	public Boolean HasUndisclAddlPropApp;
	public Id Id;
	public Boolean IsCoSignerUndisclDebt;
	public Boolean IsPartyToLawsuit;
	public Boolean IsPresentlyDelinquent;
	public Boolean IsPrimaryResidence;
	public Boolean IsRelatedToSeller;
	public Boolean IsSubjectToPriorityLien;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoanApplicantId;
	public LoanApplicant LoanApplicant;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String PriorPropertyTitleType;
	public String PriorPropertyUsageType;
	public String ReplayId;

	public LoanApplicantDeclarationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantDeclarationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantDeclarationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantDeclarationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantDeclarationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
