/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LoanApplicantAddressChangeEvent extends SObject {
	public static SObjectType$<LoanApplicantAddressChangeEvent> SObjectType;
	public static SObjectFields$<LoanApplicantAddressChangeEvent> Fields;

	public String AddressExtIdentifier;
	public String AddressOwnership;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoanApplicantId;
	public LoanApplicant LoanApplicant;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public Decimal MonthlyRentPayment;
	public String Name;
	public String ReplayId;
	public Integer ResidenceAdditionalMonthCount;
	public Address ResidenceAddress;
	public String ResidenceCity;
	public String ResidenceCountry;
	public String ResidenceCountryCode;
	public String ResidenceGeocodeAccuracy;
	public Decimal ResidenceLatitude;
	public Decimal ResidenceLongitude;
	public String ResidencePostalCode;
	public String ResidenceState;
	public String ResidenceStateCode;
	public String ResidenceStreet;
	public Integer ResidenceYearCount;
	public String ResidencyType;

	public LoanApplicantAddressChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantAddressChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantAddressChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantAddressChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantAddressChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
