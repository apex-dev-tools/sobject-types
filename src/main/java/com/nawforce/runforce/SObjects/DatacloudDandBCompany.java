/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DatacloudDandBCompany extends SObject {
	public static SObjectType$<DatacloudDandBCompany> SObjectType;
	public static SObjectFields$<DatacloudDandBCompany> Fields;

	public String City;
	public String CompanyCurrencyIsoCode;
	public String CompanyId;
	public String Country;
	public String CountryAccessCode;
	public String CountryCode;
	public String CurrencyCode;
	public String CurrencyIsoCode;
	public String Description;
	public String DomesticUltimateBusinessName;
	public String DomesticUltimateDunsNumber;
	public String DunsNumber;
	public Decimal EmployeeQuantityGrowthRate;
	public Decimal EmployeesHere;
	public String EmployeesHereReliability;
	public Decimal EmployeesTotal;
	public String EmployeesTotalReliability;
	public String ExternalId;
	public Integer FamilyMembers;
	public String Fax;
	public String FifthNaics;
	public String FifthNaicsDesc;
	public String FifthSic;
	public String FifthSic8;
	public String FifthSic8Desc;
	public String FifthSicDesc;
	public String FipsMsaCode;
	public String FipsMsaDesc;
	public Integer FortuneRank;
	public String FourthNaics;
	public String FourthNaicsDesc;
	public String FourthSic;
	public String FourthSic8;
	public String FourthSic8Desc;
	public String FourthSicDesc;
	public String FullAddress;
	public String GeoCodeAccuracy;
	public String GlobalUltimateBusinessName;
	public String GlobalUltimateDunsNumber;
	public Decimal GlobalUltimateTotalEmployees;
	public Id Id;
	public String ImportExportAgent;
	public String IncludedInSnP500;
	public String Industry;
	public Boolean IsInCrm;
	public Boolean IsOwned;
	public Boolean IsParent;
	public String Latitude;
	public String LegalStatus;
	public String LocationStatus;
	public String Longitude;
	public String MailingCity;
	public String MailingCountry;
	public String MailingCountryCode;
	public String MailingState;
	public String MailingStateCode;
	public String MailingStreet;
	public String MailingZip;
	public String MarketingPreScreen;
	public String MarketingSegmentationCluster;
	public String MinorityOwned;
	public String Name;
	public String NationalId;
	public String NationalIdType;
	public String OutOfBusiness;
	public String OwnOrRent;
	public String ParentOrHqBusinessName;
	public String ParentOrHqDunsNumber;
	public String Phone;
	public Integer PremisesMeasure;
	public String PremisesMeasureReliability;
	public String PremisesMeasureUnit;
	public String PrimaryNaics;
	public String PrimaryNaicsDesc;
	public String PrimarySic;
	public String PrimarySic8;
	public String PrimarySic8Desc;
	public String PrimarySicDesc;
	public Integer PriorYearEmployees;
	public Decimal PriorYearRevenue;
	public String PublicIndicator;
	public Decimal Revenue;
	public Decimal SalesTurnoverGrowthRate;
	public Decimal SalesVolume;
	public String SalesVolumeReliability;
	public String SecondNaics;
	public String SecondNaicsDesc;
	public String SecondSic;
	public String SecondSic8;
	public String SecondSic8Desc;
	public String SecondSicDesc;
	public String SicCodeDesc;
	public String SixthNaics;
	public String SixthNaicsDesc;
	public String SixthSic;
	public String SixthSic8;
	public String SixthSic8Desc;
	public String SixthSicDesc;
	public String SmallBusiness;
	public String State;
	public String StateCode;
	public String StockExchange;
	public String StockSymbol;
	public String Street;
	public String Subsidiary;
	public String ThirdNaics;
	public String ThirdNaicsDesc;
	public String ThirdSic;
	public String ThirdSic8;
	public String ThirdSic8Desc;
	public String ThirdSicDesc;
	public String TradeStyle1;
	public String TradeStyle2;
	public String TradeStyle3;
	public String TradeStyle4;
	public String TradeStyle5;
	public String URL;
	public String UsTaxId;
	public String WomenOwned;
	public String YearStarted;
	public String Zip;

	public DatacloudDandBCompany clone$() {throw new java.lang.UnsupportedOperationException();}
	public DatacloudDandBCompany clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudDandBCompany clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudDandBCompany clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudDandBCompany clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
