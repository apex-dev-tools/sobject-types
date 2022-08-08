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
public class DatacloudCompany extends SObject {
	public static SObjectType$<DatacloudCompany> SObjectType;
	public static SObjectFields$<DatacloudCompany> Fields;

	public com.nawforce.runforce.System.Integer ActiveContacts;
	public Decimal AnnualRevenue;
	public com.nawforce.runforce.System.String City;
	public com.nawforce.runforce.System.String CompanyId;
	public com.nawforce.runforce.System.String Country;
	public com.nawforce.runforce.System.String CountryCode;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String DunsNumber;
	public Decimal EmployeeQuantityGrowthRate;
	public com.nawforce.runforce.System.String ExternalId;
	public com.nawforce.runforce.System.String Fax;
	public com.nawforce.runforce.System.Integer FortuneRank;
	public com.nawforce.runforce.System.String FullAddress;
	public Id Id;
	public com.nawforce.runforce.System.String IncludedInSnP500;
	public com.nawforce.runforce.System.String Industry;
	public com.nawforce.runforce.System.Boolean IsInCrm;
	public com.nawforce.runforce.System.Boolean IsInactive;
	public com.nawforce.runforce.System.Boolean IsOwned;
	public com.nawforce.runforce.System.String NaicsCode;
	public com.nawforce.runforce.System.String NaicsDesc;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer NumberOfEmployees;
	public com.nawforce.runforce.System.String Ownership;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.Integer PremisesMeasure;
	public com.nawforce.runforce.System.String PremisesMeasureReliability;
	public com.nawforce.runforce.System.String PremisesMeasureUnit;
	public com.nawforce.runforce.System.Integer PriorYearEmployees;
	public Decimal PriorYearRevenue;
	public Decimal SalesTurnoverGrowthRate;
	public com.nawforce.runforce.System.String Sic;
	public com.nawforce.runforce.System.String SicCodeDesc;
	public com.nawforce.runforce.System.String SicDesc;
	public com.nawforce.runforce.System.String Site;
	public com.nawforce.runforce.System.String State;
	public com.nawforce.runforce.System.String StateCode;
	public com.nawforce.runforce.System.String Street;
	public com.nawforce.runforce.System.String TickerSymbol;
	public com.nawforce.runforce.System.String TradeStyle;
	public Datetime UpdatedDate;
	public com.nawforce.runforce.System.String Website;
	public com.nawforce.runforce.System.String YearStarted;
	public com.nawforce.runforce.System.String Zip;

	public DatacloudCompany clone$() {throw new java.lang.UnsupportedOperationException();}
	public DatacloudCompany clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudCompany clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudCompany clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DatacloudCompany clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
