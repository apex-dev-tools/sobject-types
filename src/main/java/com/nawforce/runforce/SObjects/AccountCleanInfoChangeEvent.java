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
public class AccountCleanInfoChangeEvent extends SObject {
	public static SObjectType$<AccountCleanInfoChangeEvent> SObjectType;
	public static SObjectFields$<AccountCleanInfoChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String AccountSite;
	public Address Address;
	public Decimal AnnualRevenue;
	public Object ChangeEventHeader;
	public String City;
	public Boolean CleanedByJob;
	public Boolean CleanedByUser;
	public String CompanyName;
	public String CompanyStatusDataDotCom;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DandBCompanyDunsNumber;
	public String DataDotComId;
	public String Description;
	public String Division;
	public String DunsNumber;
	public Integer DunsRightMatchConfidence;
	public String DunsRightMatchGrade;
	public String Fax;
	public String GeocodeAccuracy;
	public Id Id;
	public String Industry;
	public Boolean IsDifferentAccountSite;
	public Boolean IsDifferentAnnualRevenue;
	public Boolean IsDifferentCity;
	public Boolean IsDifferentCompanyName;
	public Boolean IsDifferentCountry;
	public Boolean IsDifferentCountryCode;
	public Boolean IsDifferentDandBCompanyDunsNumber;
	public Boolean IsDifferentDescription;
	public Boolean IsDifferentDunsNumber;
	public Boolean IsDifferentFax;
	public Boolean IsDifferentIndustry;
	public Boolean IsDifferentNaicsCode;
	public Boolean IsDifferentNaicsDescription;
	public Boolean IsDifferentNumberOfEmployees;
	public Boolean IsDifferentOwnership;
	public Boolean IsDifferentPhone;
	public Boolean IsDifferentPostalCode;
	public Boolean IsDifferentSic;
	public Boolean IsDifferentSicDescription;
	public Boolean IsDifferentState;
	public Boolean IsDifferentStateCode;
	public Boolean IsDifferentStreet;
	public Boolean IsDifferentTickerSymbol;
	public Boolean IsDifferentTradestyle;
	public Boolean IsDifferentWebsite;
	public Boolean IsDifferentYearStarted;
	public Boolean IsFlaggedWrongAccountSite;
	public Boolean IsFlaggedWrongAddress;
	public Boolean IsFlaggedWrongAnnualRevenue;
	public Boolean IsFlaggedWrongCompanyName;
	public Boolean IsFlaggedWrongDescription;
	public Boolean IsFlaggedWrongDunsNumber;
	public Boolean IsFlaggedWrongFax;
	public Boolean IsFlaggedWrongIndustry;
	public Boolean IsFlaggedWrongNaicsCode;
	public Boolean IsFlaggedWrongNaicsDescription;
	public Boolean IsFlaggedWrongNumberOfEmployees;
	public Boolean IsFlaggedWrongOwnership;
	public Boolean IsFlaggedWrongPhone;
	public Boolean IsFlaggedWrongSic;
	public Boolean IsFlaggedWrongSicDescription;
	public Boolean IsFlaggedWrongTickerSymbol;
	public Boolean IsFlaggedWrongTradestyle;
	public Boolean IsFlaggedWrongWebsite;
	public Boolean IsFlaggedWrongYearStarted;
	public Boolean IsInactive;
	public Boolean IsReviewedAccountSite;
	public Boolean IsReviewedAddress;
	public Boolean IsReviewedAnnualRevenue;
	public Boolean IsReviewedCompanyName;
	public Boolean IsReviewedDandBCompanyDunsNumber;
	public Boolean IsReviewedDescription;
	public Boolean IsReviewedDunsNumber;
	public Boolean IsReviewedFax;
	public Boolean IsReviewedIndustry;
	public Boolean IsReviewedNaicsCode;
	public Boolean IsReviewedNaicsDescription;
	public Boolean IsReviewedNumberOfEmployees;
	public Boolean IsReviewedOwnership;
	public Boolean IsReviewedPhone;
	public Boolean IsReviewedSic;
	public Boolean IsReviewedSicDescription;
	public Boolean IsReviewedTickerSymbol;
	public Boolean IsReviewedTradestyle;
	public Boolean IsReviewedWebsite;
	public Boolean IsReviewedYearStarted;
	public Datetime LastMatchedDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LastStatusChangedById;
	public User LastStatusChangedBy;
	public Datetime LastStatusChangedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public String NaicsCode;
	public String NaicsDescription;
	public String Name;
	public Integer NumberOfEmployees;
	public String Ownership;
	public String Phone;
	public String PostalCode;
	public String ReplayId;
	public String Sic;
	public String SicDescription;
	public String State;
	public String StateCode;
	public String Street;
	public String TickerSymbol;
	public String Tradestyle;
	public String Website;
	public String YearStarted;

	public AccountCleanInfoChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AccountCleanInfoChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AccountCleanInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AccountCleanInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AccountCleanInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
