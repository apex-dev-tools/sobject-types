/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DatacloudCompany extends SObject {
	public static SObjectType$<DatacloudCompany> SObjectType;
	public static SObjectFields$<DatacloudCompany> Fields;

	public Integer ActiveContacts;
	public Decimal AnnualRevenue;
	public String City;
	public String CompanyId;
	public String Country;
	public String CountryCode;
	public String CurrencyIsoCode;
	public String Description;
	public String DunsNumber;
	public Decimal EmployeeQuantityGrowthRate;
	public String ExternalId;
	public String Fax;
	public Integer FortuneRank;
	public String FullAddress;
	public Id Id;
	public String IncludedInSnP500;
	public String Industry;
	public Boolean IsInCrm;
	public Boolean IsInactive;
	public Boolean IsOwned;
	public String NaicsCode;
	public String NaicsDesc;
	public String Name;
	public Integer NumberOfEmployees;
	public String Ownership;
	public String Phone;
	public Integer PremisesMeasure;
	public String PremisesMeasureReliability;
	public String PremisesMeasureUnit;
	public Integer PriorYearEmployees;
	public Decimal PriorYearRevenue;
	public Decimal SalesTurnoverGrowthRate;
	public String Sic;
	public String SicCodeDesc;
	public String SicDesc;
	public String Site;
	public String State;
	public String StateCode;
	public String Street;
	public String TickerSymbol;
	public String TradeStyle;
	public Datetime UpdatedDate;
	public String Website;
	public String YearStarted;
	public String Zip;

	public DatacloudCompany clone$() {throw new java.lang.UnsupportedOperationException();}
	public DatacloudCompany clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudCompany clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudCompany clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudCompany clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
