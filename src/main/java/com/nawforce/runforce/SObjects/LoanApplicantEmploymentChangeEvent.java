/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LoanApplicantEmploymentChangeEvent extends SObject {
	public static SObjectType$<LoanApplicantEmploymentChangeEvent> SObjectType;
	public static SObjectFields$<LoanApplicantEmploymentChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer CurrentJobAdditionalMonthCount;
	public Integer CurrentJobYearCount;
	public Address EmployerAddress;
	public String EmployerCity;
	public String EmployerCountry;
	public String EmployerCountryCode;
	public String EmployerGeocodeAccuracy;
	public Decimal EmployerLatitude;
	public Decimal EmployerLongitude;
	public String EmployerName;
	public String EmployerPhone;
	public String EmployerPostalCode;
	public String EmployerState;
	public String EmployerStateCode;
	public String EmployerStreet;
	public String EmploymentExtIdentifier;
	public Date EndDate;
	public Id Id;
	public Boolean IsLessThanQuarterShare;
	public Boolean IsRelToTransactionParty;
	public Boolean IsSelfEmployed;
	public String JobTitle;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoanApplicantId;
	public LoanApplicant LoanApplicant;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public Decimal MonthlyBaseIncomeAmount;
	public Decimal MonthlyBonusAmount;
	public Decimal MonthlyCommissionAmount;
	public Decimal MonthlyIncome;
	public Decimal MonthlyMilitaryEntlAmt;
	public Decimal MonthlyOtherIncomeAmount;
	public Decimal MonthlyOvertimeAmount;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Date StartDate;

	public LoanApplicantEmploymentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantEmploymentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantEmploymentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantEmploymentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantEmploymentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
