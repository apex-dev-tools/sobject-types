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
public class ResidentialLoanApplicationChangeEvent extends SObject {
	public static SObjectType$<ResidentialLoanApplicationChangeEvent> SObjectType;
	public static SObjectFields$<ResidentialLoanApplicationChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal AmortizationTerm;
	public String AmortizationType;
	public String ApplicationExtIdentifier;
	public Decimal BalloonTermMonths;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EstateHoldType;
	public Boolean HasOtherLoanFeature;
	public Boolean HasPrepaymentPenalty;
	public Id Id;
	public Decimal ImprovementCost;
	public Decimal InitialBuydownRate;
	public Decimal IntOnlyTermMonthCount;
	public Decimal InterestRate;
	public Boolean IsBalloon;
	public Boolean IsBorrowerCommPropState;
	public Boolean IsConstructionConversion;
	public Boolean IsContractConversion;
	public Boolean IsEnergyRelImprovement;
	public Boolean IsInterestOnly;
	public Boolean IsNegativeAmortization;
	public Boolean IsPropertyCommPropState;
	public Boolean IsRenovation;
	public Boolean IsSingleClosing;
	public Boolean IsSubjectToPriorityLien;
	public Boolean IsTempIntRateBuydown;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LeaseHoldExpirationDate;
	public String LoanPurpose;
	public Datetime LotAcquiredDate;
	public Decimal LotOriginalCost;
	public Decimal MonthsBeforeFirstAdj;
	public Decimal MonthsBetweenAdjustments;
	public String MortgageLienType;
	public String MortgageProgramType;
	public String Name;
	public String NativeLandTenure;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public String OtherAmortizationType;
	public String OtherLoanFeature;
	public String OtherLoanPurpose;
	public String OtherMortgageProgramType;
	public String OtherRefinanceProgType;
	public Id OwnerId;
	public User Owner;
	public Decimal PrepayPenaltyTermMonth;
	public String ProjectType;
	public String RefinanceProgramType;
	public String RefinanceType;
	public String ReplayId;
	public String Status;
	public String TitleType;
	public Decimal TotalFinLiabilityMonthlyAmt;
	public Decimal TotalFinancialAssetAmount;
	public Decimal TotalOtherAssetAmount;
	public Decimal TotalOtherFinLiabilityMonthlyAmt;
	public String TrustTitleType;

	public ResidentialLoanApplicationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ResidentialLoanApplicationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ResidentialLoanApplicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ResidentialLoanApplicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ResidentialLoanApplicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
