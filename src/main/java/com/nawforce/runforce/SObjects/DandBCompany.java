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
public class DandBCompany extends SObject {
	public static SObjectType$<DandBCompany> SObjectType;
	public static SObjectFields$<DandBCompany> Fields;

	public Address Address;
	public com.nawforce.runforce.System.String City;
	public com.nawforce.runforce.System.String CompanyCurrencyIsoCode;
	public com.nawforce.runforce.System.String Country;
	public com.nawforce.runforce.System.String CountryAccessCode;
	public com.nawforce.runforce.System.String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyCode;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String DomesticUltimateBusinessName;
	public com.nawforce.runforce.System.String DomesticUltimateDunsNumber;
	public com.nawforce.runforce.System.String DunsNumber;
	public Decimal EmployeeQuantityGrowthRate;
	public Decimal EmployeesHere;
	public com.nawforce.runforce.System.String EmployeesHereReliability;
	public Decimal EmployeesTotal;
	public com.nawforce.runforce.System.String EmployeesTotalReliability;
	public com.nawforce.runforce.System.Integer FamilyMembers;
	public com.nawforce.runforce.System.String Fax;
	public com.nawforce.runforce.System.String FifthNaics;
	public com.nawforce.runforce.System.String FifthNaicsDesc;
	public com.nawforce.runforce.System.String FifthSic;
	public com.nawforce.runforce.System.String FifthSic8;
	public com.nawforce.runforce.System.String FifthSic8Desc;
	public com.nawforce.runforce.System.String FifthSicDesc;
	public com.nawforce.runforce.System.String FipsMsaCode;
	public com.nawforce.runforce.System.String FipsMsaDesc;
	public com.nawforce.runforce.System.Integer FortuneRank;
	public com.nawforce.runforce.System.String FourthNaics;
	public com.nawforce.runforce.System.String FourthNaicsDesc;
	public com.nawforce.runforce.System.String FourthSic;
	public com.nawforce.runforce.System.String FourthSic8;
	public com.nawforce.runforce.System.String FourthSic8Desc;
	public com.nawforce.runforce.System.String FourthSicDesc;
	public com.nawforce.runforce.System.String GeoCodeAccuracy;
	public com.nawforce.runforce.System.String GeocodeAccuracyStandard;
	public com.nawforce.runforce.System.String GlobalUltimateBusinessName;
	public com.nawforce.runforce.System.String GlobalUltimateDunsNumber;
	public Decimal GlobalUltimateTotalEmployees;
	public Id Id;
	public com.nawforce.runforce.System.String ImportExportAgent;
	public com.nawforce.runforce.System.String IncludedInSnP500;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String Latitude;
	public com.nawforce.runforce.System.String LegalStatus;
	public com.nawforce.runforce.System.String LocationStatus;
	public com.nawforce.runforce.System.String Longitude;
	public Address MailingAddress;
	public com.nawforce.runforce.System.String MailingCity;
	public com.nawforce.runforce.System.String MailingCountry;
	public com.nawforce.runforce.System.String MailingCountryCode;
	public com.nawforce.runforce.System.String MailingGeocodeAccuracy;
	public com.nawforce.runforce.System.String MailingPostalCode;
	public com.nawforce.runforce.System.String MailingState;
	public com.nawforce.runforce.System.String MailingStateCode;
	public com.nawforce.runforce.System.String MailingStreet;
	public com.nawforce.runforce.System.String MarketingPreScreen;
	public com.nawforce.runforce.System.String MarketingSegmentationCluster;
	public com.nawforce.runforce.System.String MinorityOwned;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String NationalId;
	public com.nawforce.runforce.System.String NationalIdType;
	public com.nawforce.runforce.System.String OutOfBusiness;
	public com.nawforce.runforce.System.String OwnOrRent;
	public com.nawforce.runforce.System.String ParentOrHqBusinessName;
	public com.nawforce.runforce.System.String ParentOrHqDunsNumber;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.String PostalCode;
	public com.nawforce.runforce.System.Integer PremisesMeasure;
	public com.nawforce.runforce.System.String PremisesMeasureReliability;
	public com.nawforce.runforce.System.String PremisesMeasureUnit;
	public com.nawforce.runforce.System.String PrimaryNaics;
	public com.nawforce.runforce.System.String PrimaryNaicsDesc;
	public com.nawforce.runforce.System.String PrimarySic;
	public com.nawforce.runforce.System.String PrimarySic8;
	public com.nawforce.runforce.System.String PrimarySic8Desc;
	public com.nawforce.runforce.System.String PrimarySicDesc;
	public com.nawforce.runforce.System.Integer PriorYearEmployees;
	public Decimal PriorYearRevenue;
	public com.nawforce.runforce.System.String PublicIndicator;
	public Decimal SalesTurnoverGrowthRate;
	public Decimal SalesVolume;
	public com.nawforce.runforce.System.String SalesVolumeReliability;
	public com.nawforce.runforce.System.String SecondNaics;
	public com.nawforce.runforce.System.String SecondNaicsDesc;
	public com.nawforce.runforce.System.String SecondSic;
	public com.nawforce.runforce.System.String SecondSic8;
	public com.nawforce.runforce.System.String SecondSic8Desc;
	public com.nawforce.runforce.System.String SecondSicDesc;
	public com.nawforce.runforce.System.String SixthNaics;
	public com.nawforce.runforce.System.String SixthNaicsDesc;
	public com.nawforce.runforce.System.String SixthSic;
	public com.nawforce.runforce.System.String SixthSic8;
	public com.nawforce.runforce.System.String SixthSic8Desc;
	public com.nawforce.runforce.System.String SixthSicDesc;
	public com.nawforce.runforce.System.String SmallBusiness;
	public com.nawforce.runforce.System.String State;
	public com.nawforce.runforce.System.String StateCode;
	public com.nawforce.runforce.System.String StockExchange;
	public com.nawforce.runforce.System.String StockSymbol;
	public com.nawforce.runforce.System.String Street;
	public com.nawforce.runforce.System.String Subsidiary;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String ThirdNaics;
	public com.nawforce.runforce.System.String ThirdNaicsDesc;
	public com.nawforce.runforce.System.String ThirdSic;
	public com.nawforce.runforce.System.String ThirdSic8;
	public com.nawforce.runforce.System.String ThirdSic8Desc;
	public com.nawforce.runforce.System.String ThirdSicDesc;
	public com.nawforce.runforce.System.String TradeStyle1;
	public com.nawforce.runforce.System.String TradeStyle2;
	public com.nawforce.runforce.System.String TradeStyle3;
	public com.nawforce.runforce.System.String TradeStyle4;
	public com.nawforce.runforce.System.String TradeStyle5;
	public com.nawforce.runforce.System.String URL;
	public com.nawforce.runforce.System.String UsTaxId;
	public com.nawforce.runforce.System.String WomenOwned;
	public com.nawforce.runforce.System.String YearStarted;

	public Account[] Accounts;
	public Lead[] Leads;

	public DandBCompany clone$() {throw new java.lang.UnsupportedOperationException();}
	public DandBCompany clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DandBCompany clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DandBCompany clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DandBCompany clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
