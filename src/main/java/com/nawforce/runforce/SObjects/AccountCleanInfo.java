/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AccountCleanInfo extends SObject {
	public static SObjectType$<AccountCleanInfo> SObjectType;
	public static SObjectFields$<AccountCleanInfo> Fields;

	public Id AccountId;
	public Account Account;
	public com.nawforce.runforce.System.String AccountSite;
	public Address Address;
	public Decimal AnnualRevenue;
	public com.nawforce.runforce.System.String City;
	public com.nawforce.runforce.System.Boolean CleanedByJob;
	public com.nawforce.runforce.System.Boolean CleanedByUser;
	public com.nawforce.runforce.System.String CompanyName;
	public com.nawforce.runforce.System.String CompanyStatusDataDotCom;
	public com.nawforce.runforce.System.String Country;
	public com.nawforce.runforce.System.String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String DandBCompanyDunsNumber;
	public com.nawforce.runforce.System.String DataDotComId;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String DunsNumber;
	public com.nawforce.runforce.System.Integer DunsRightMatchConfidence;
	public com.nawforce.runforce.System.String DunsRightMatchGrade;
	public com.nawforce.runforce.System.String Fax;
	public com.nawforce.runforce.System.String GeocodeAccuracy;
	public Id Id;
	public com.nawforce.runforce.System.String Industry;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsDifferentAccountSite;
	public com.nawforce.runforce.System.Boolean IsDifferentAnnualRevenue;
	public com.nawforce.runforce.System.Boolean IsDifferentCity;
	public com.nawforce.runforce.System.Boolean IsDifferentCompanyName;
	public com.nawforce.runforce.System.Boolean IsDifferentCountry;
	public com.nawforce.runforce.System.Boolean IsDifferentCountryCode;
	public com.nawforce.runforce.System.Boolean IsDifferentDandBCompanyDunsNumber;
	public com.nawforce.runforce.System.Boolean IsDifferentDescription;
	public com.nawforce.runforce.System.Boolean IsDifferentDunsNumber;
	public com.nawforce.runforce.System.Boolean IsDifferentFax;
	public com.nawforce.runforce.System.Boolean IsDifferentIndustry;
	public com.nawforce.runforce.System.Boolean IsDifferentNaicsCode;
	public com.nawforce.runforce.System.Boolean IsDifferentNaicsDescription;
	public com.nawforce.runforce.System.Boolean IsDifferentNumberOfEmployees;
	public com.nawforce.runforce.System.Boolean IsDifferentOwnership;
	public com.nawforce.runforce.System.Boolean IsDifferentPhone;
	public com.nawforce.runforce.System.Boolean IsDifferentPostalCode;
	public com.nawforce.runforce.System.Boolean IsDifferentSic;
	public com.nawforce.runforce.System.Boolean IsDifferentSicDescription;
	public com.nawforce.runforce.System.Boolean IsDifferentState;
	public com.nawforce.runforce.System.Boolean IsDifferentStateCode;
	public com.nawforce.runforce.System.Boolean IsDifferentStreet;
	public com.nawforce.runforce.System.Boolean IsDifferentTickerSymbol;
	public com.nawforce.runforce.System.Boolean IsDifferentTradestyle;
	public com.nawforce.runforce.System.Boolean IsDifferentWebsite;
	public com.nawforce.runforce.System.Boolean IsDifferentYearStarted;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongAccountSite;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongAddress;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongAnnualRevenue;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongCompanyName;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongDescription;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongDunsNumber;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongFax;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongIndustry;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongNaicsCode;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongNaicsDescription;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongNumberOfEmployees;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongOwnership;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongPhone;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongSic;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongSicDescription;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongTickerSymbol;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongTradestyle;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongWebsite;
	public com.nawforce.runforce.System.Boolean IsFlaggedWrongYearStarted;
	public com.nawforce.runforce.System.Boolean IsInactive;
	public com.nawforce.runforce.System.Boolean IsReviewedAccountSite;
	public com.nawforce.runforce.System.Boolean IsReviewedAddress;
	public com.nawforce.runforce.System.Boolean IsReviewedAnnualRevenue;
	public com.nawforce.runforce.System.Boolean IsReviewedCompanyName;
	public com.nawforce.runforce.System.Boolean IsReviewedDandBCompanyDunsNumber;
	public com.nawforce.runforce.System.Boolean IsReviewedDescription;
	public com.nawforce.runforce.System.Boolean IsReviewedDunsNumber;
	public com.nawforce.runforce.System.Boolean IsReviewedFax;
	public com.nawforce.runforce.System.Boolean IsReviewedIndustry;
	public com.nawforce.runforce.System.Boolean IsReviewedNaicsCode;
	public com.nawforce.runforce.System.Boolean IsReviewedNaicsDescription;
	public com.nawforce.runforce.System.Boolean IsReviewedNumberOfEmployees;
	public com.nawforce.runforce.System.Boolean IsReviewedOwnership;
	public com.nawforce.runforce.System.Boolean IsReviewedPhone;
	public com.nawforce.runforce.System.Boolean IsReviewedSic;
	public com.nawforce.runforce.System.Boolean IsReviewedSicDescription;
	public com.nawforce.runforce.System.Boolean IsReviewedTickerSymbol;
	public com.nawforce.runforce.System.Boolean IsReviewedTradestyle;
	public com.nawforce.runforce.System.Boolean IsReviewedWebsite;
	public com.nawforce.runforce.System.Boolean IsReviewedYearStarted;
	public Datetime LastMatchedDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LastStatusChangedById;
	public User LastStatusChangedBy;
	public Datetime LastStatusChangedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public com.nawforce.runforce.System.String NaicsCode;
	public com.nawforce.runforce.System.String NaicsDescription;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer NumberOfEmployees;
	public com.nawforce.runforce.System.String Ownership;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.String PostalCode;
	public com.nawforce.runforce.System.String Sic;
	public com.nawforce.runforce.System.String SicDescription;
	public com.nawforce.runforce.System.String State;
	public com.nawforce.runforce.System.String StateCode;
	public com.nawforce.runforce.System.String Street;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String TickerSymbol;
	public com.nawforce.runforce.System.String Tradestyle;
	public com.nawforce.runforce.System.String Website;
	public com.nawforce.runforce.System.String YearStarted;

	public AccountCleanInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public AccountCleanInfo clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AccountCleanInfo clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AccountCleanInfo clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AccountCleanInfo clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
