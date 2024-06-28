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
public class LoanApplicationAssetChangeEvent extends SObject {
	public static SObjectType$<LoanApplicationAssetChangeEvent> SObjectType;
	public static SObjectFields$<LoanApplicationAssetChangeEvent> Fields;

	public String AccountNumber;
	public String AccountType;
	public String AssetClass;
	public String AssetExtIdentifier;
	public String AssetType;
	public Decimal CashOrMarketValue;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DispositionType;
	public String FinancialInstitutionName;
	public Decimal GrossMonthlyRentalIncome;
	public Id Id;
	public Boolean IsJointAsset;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoanApplicationId;
	public ResidentialLoanApplication LoanApplication;
	public String Name;
	public Decimal NetMonthlyRentalIncome;
	public Id OwnerId;
	public User Owner;
	public Decimal PresentMarketValue;
	public Address RealEstateAddress;
	public String RealEstateCity;
	public String RealEstateCountry;
	public String RealEstateCountryCode;
	public String RealEstateGeocodeAccuracy;
	public Decimal RealEstateLatitude;
	public Decimal RealEstateLongitude;
	public Decimal RealEstateMonthlyExpense;
	public String RealEstatePostalCode;
	public String RealEstateState;
	public String RealEstateStateCode;
	public String RealEstateStreet;
	public String ReplayId;

	public LoanApplicationAssetChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationAssetChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationAssetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationAssetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicationAssetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
