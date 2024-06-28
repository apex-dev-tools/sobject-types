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
public class AccountChangeEvent extends SObject {
	public static SObjectType$<AccountChangeEvent> SObjectType;
	public static SObjectFields$<AccountChangeEvent> Fields;

	public String AccountNumber;
	public String AccountSource;
	public Decimal AnnualRevenue;
	public Address BillingAddress;
	public String BillingCity;
	public String BillingCountry;
	public String BillingCountryCode;
	public String BillingGeocodeAccuracy;
	public Decimal BillingLatitude;
	public Decimal BillingLongitude;
	public String BillingPostalCode;
	public String BillingState;
	public String BillingStateCode;
	public String BillingStreet;
	public Object ChangeEventHeader;
	public String CleanStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DandbCompanyId;
	public DandBCompany DandbCompany;
	public String Description;
	public String Division;
	public String DunsNumber;
	public Datetime EffectiveDate;
	public Datetime EndDate;
	public String Fax;
	public String FirstName;
	public Id Id;
	public String Industry;
	public Boolean IsExcludedFromRealign;
	public Boolean IsActive;
	public Boolean IsPriorityRecord;
	public String Jigsaw;
	public String JigsawCompanyId;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public String NaicsCode;
	public String NaicsDesc;
	public String Name;
	public Integer NumberOfEmployees;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id OwnerId;
	public User Owner;
	public String Ownership;
	public Id ParentId;
	public Account Parent;
	public String PersonAssistantName;
	public String PersonAssistantPhone;
	public Date PersonBirthdate;
	public Id PersonContactId;
	public Contact PersonContact;
	public Datetime PersonDeceasedDate;
	public String PersonDepartment;
	public String PersonEmail;
	public Datetime PersonEmailBouncedDate;
	public String PersonEmailBouncedReason;
	public String PersonGender;
	public String PersonHomePhone;
	public Id PersonIndividualId;
	public Individual PersonIndividual;
	public Datetime PersonLastCURequestDate;
	public Datetime PersonLastCUUpdateDate;
	public String PersonLeadSource;
	public Address PersonMailingAddress;
	public String PersonMailingCity;
	public String PersonMailingCountry;
	public String PersonMailingCountryCode;
	public String PersonMailingGeocodeAccuracy;
	public Decimal PersonMailingLatitude;
	public Decimal PersonMailingLongitude;
	public String PersonMailingPostalCode;
	public String PersonMailingState;
	public String PersonMailingStateCode;
	public String PersonMailingStreet;
	public String PersonMaritalStatus;
	public String PersonMobilePhone;
	public Address PersonOtherAddress;
	public String PersonOtherCity;
	public String PersonOtherCountry;
	public String PersonOtherCountryCode;
	public String PersonOtherGeocodeAccuracy;
	public Decimal PersonOtherLatitude;
	public Decimal PersonOtherLongitude;
	public String PersonOtherPhone;
	public String PersonOtherPostalCode;
	public String PersonOtherState;
	public String PersonOtherStateCode;
	public String PersonOtherStreet;
	public Integer PersonSequenceInMultipleBirth;
	public String PersonTitle;
	public String Phone;
	public String Rating;
	public Id RecordTypeId;
	public RecordType RecordType;
	public String ReplayId;
	public String Salutation;
	public Address ShippingAddress;
	public String ShippingCity;
	public String ShippingCountry;
	public String ShippingCountryCode;
	public String ShippingGeocodeAccuracy;
	public Decimal ShippingLatitude;
	public Decimal ShippingLongitude;
	public String ShippingPostalCode;
	public String ShippingState;
	public String ShippingStateCode;
	public String ShippingStreet;
	public String Sic;
	public String SicDesc;
	public String Site;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModifiedDate;
	public String TickerSymbol;
	public String Tradestyle;
	public String Type;
	public String Website;
	public String YearStarted;

	public AccountChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AccountChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AccountChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AccountChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AccountChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
