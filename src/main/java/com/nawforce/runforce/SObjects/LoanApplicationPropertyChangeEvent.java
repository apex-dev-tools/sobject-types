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
public class LoanApplicationPropertyChangeEvent extends SObject {
	public static SObjectType$<LoanApplicationPropertyChangeEvent> SObjectType;
	public static SObjectFields$<LoanApplicationPropertyChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal ExpMonthlyRentalIncome;
	public Decimal ExpNetMonthlyRentalInc;
	public Id Id;
	public Boolean IsManufacturedHome;
	public Boolean IsMixedUseProperty;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public String LoanPurposeType;
	public String Name;
	public Address PropertyAddress;
	public String PropertyCity;
	public String PropertyCountry;
	public String PropertyCountryCode;
	public String PropertyExtIdentifier;
	public String PropertyGeocodeAccuracy;
	public Decimal PropertyLatitude;
	public Decimal PropertyLongitude;
	public String PropertyPostalCode;
	public String PropertyState;
	public String PropertyStateCode;
	public String PropertyStreet;
	public String PropertyUseType;
	public Decimal PropertyValue;
	public String ReplayId;
	public Decimal RequestedLoanAmount;
	public Integer UnitsFinancedCount;

	public LoanApplicationPropertyChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationPropertyChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationPropertyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationPropertyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationPropertyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
