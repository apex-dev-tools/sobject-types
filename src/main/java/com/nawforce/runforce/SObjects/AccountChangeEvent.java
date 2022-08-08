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
public class AccountChangeEvent extends SObject {
	public static SObjectType$<AccountChangeEvent> SObjectType;
	public static SObjectFields$<AccountChangeEvent> Fields;

	public com.nawforce.runforce.System.String AccountNumber;
	public com.nawforce.runforce.System.String AccountSource;
	public Decimal AnnualRevenue;
	public Address BillingAddress;
	public com.nawforce.runforce.System.String BillingCity;
	public com.nawforce.runforce.System.String BillingCountry;
	public com.nawforce.runforce.System.String BillingCountryCode;
	public com.nawforce.runforce.System.String BillingGeocodeAccuracy;
	public Decimal BillingLatitude;
	public Decimal BillingLongitude;
	public com.nawforce.runforce.System.String BillingPostalCode;
	public com.nawforce.runforce.System.String BillingState;
	public com.nawforce.runforce.System.String BillingStateCode;
	public com.nawforce.runforce.System.String BillingStreet;
	public Object ChangeEventHeader;
	public com.nawforce.runforce.System.String CleanStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Id DandbCompanyId;
	public DandBCompany DandbCompany;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String DunsNumber;
	public com.nawforce.runforce.System.String Fax;
	public com.nawforce.runforce.System.String FirstName;
	public Id Id;
	public com.nawforce.runforce.System.String Industry;
	public com.nawforce.runforce.System.String Jigsaw;
	public com.nawforce.runforce.System.String JigsawCompanyId;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LastName;
	public com.nawforce.runforce.System.String NaicsCode;
	public com.nawforce.runforce.System.String NaicsDesc;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer NumberOfEmployees;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id OwnerId;
	public User Owner;
	public com.nawforce.runforce.System.String Ownership;
	public Id ParentId;
	public Account Parent;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.String Rating;
	public com.nawforce.runforce.System.String ReplayId;
	public com.nawforce.runforce.System.String Salutation;
	public Address ShippingAddress;
	public com.nawforce.runforce.System.String ShippingCity;
	public com.nawforce.runforce.System.String ShippingCountry;
	public com.nawforce.runforce.System.String ShippingCountryCode;
	public com.nawforce.runforce.System.String ShippingGeocodeAccuracy;
	public Decimal ShippingLatitude;
	public Decimal ShippingLongitude;
	public com.nawforce.runforce.System.String ShippingPostalCode;
	public com.nawforce.runforce.System.String ShippingState;
	public com.nawforce.runforce.System.String ShippingStateCode;
	public com.nawforce.runforce.System.String ShippingStreet;
	public com.nawforce.runforce.System.String Sic;
	public com.nawforce.runforce.System.String SicDesc;
	public com.nawforce.runforce.System.String Site;
	public com.nawforce.runforce.System.String TickerSymbol;
	public com.nawforce.runforce.System.String Tradestyle;
	public com.nawforce.runforce.System.String Type;
	public com.nawforce.runforce.System.String Website;
	public com.nawforce.runforce.System.String YearStarted;

	public AccountChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AccountChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AccountChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AccountChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AccountChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
