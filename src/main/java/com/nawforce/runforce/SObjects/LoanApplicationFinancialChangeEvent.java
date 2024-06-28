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
public class LoanApplicationFinancialChangeEvent extends SObject {
	public static SObjectType$<LoanApplicationFinancialChangeEvent> SObjectType;
	public static SObjectFields$<LoanApplicationFinancialChangeEvent> Fields;

	public Decimal BorrowerClosingCostAmt;
	public Object ChangeEventHeader;
	public String CounselingAgencyName;
	public String CounselingAgencyProvName;
	public String CounselingComplBorrName;
	public Datetime CounselingCompletionDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CreditFromSeller;
	public String CurrencyIsoCode;
	public Decimal DiscountPointCostAmount;
	public String EdCompletedBorrowerName;
	public Decimal EstFirstMortgagePmtAmt;
	public Decimal EstHomeownersInsPmtAmt;
	public Decimal EstMortgageInsPmtAmt;
	public Decimal EstOtherDuesPaymentAmt;
	public Decimal EstOtherPaymentAmt;
	public Decimal EstPropertyTaxesPmtAmt;
	public Decimal EstSubordinateLienPmtAmt;
	public Decimal EstSuppPropertyInsPmtAmt;
	public Decimal FinancedMortgageInsAmt;
	public String FinancialExtIdentifier;
	public Boolean HasCompletedCounseling;
	public Boolean HasHoEducation;
	public Datetime HoEducationCompletedDate;
	public String HoEducationFormat;
	public String HousingCounselingFormat;
	public String HudApprAgencyIdentifier;
	public String HudApprovedProvIdentifier;
	public Id Id;
	public Decimal LandAcquiredSeparatelyAmount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public Decimal LoanExclFinMortInsAmt;
	public String Name;
	public Decimal OtherCredit;
	public Decimal OtherNewMortgageLoanAmt;
	public Decimal OutstandingLoanAmount;
	public Decimal PurchasePriceAmount;
	public Decimal RemodelAndRepairsAmount;
	public String ReplayId;
	public Decimal TotalDebtPaidOffAmount;

	public LoanApplicationFinancialChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationFinancialChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationFinancialChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationFinancialChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationFinancialChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
