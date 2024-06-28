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
public class BusinessLicenseApplicationChangeEvent extends SObject {
	public static SObjectType$<BusinessLicenseApplicationChangeEvent> SObjectType;
	public static SObjectFields$<BusinessLicenseApplicationChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal AmountPaid;
	public Id ApplicantId;
	public Contact Applicant;
	public Id ApplicationCaseId;
	public Case ApplicationCase;
	public String ApplicationCategory;
	public String ApplicationType;
	public Datetime AppliedDate;
	public Datetime ApprovedDate;
	public Id BusinessTypeId;
	public BusinessType BusinessType;
	public String Category;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LicensePermitNameId;
	public BusinessLicense LicensePermitName;
	public Id LicenseTypeId;
	public RegulatoryAuthorizationType LicenseType;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Datetime PaymentDate;
	public Id PrimaryOwnerId;
	public Contact PrimaryOwner;
	public String ReplayId;
	public Datetime RequirementsCompleteDate;
	public Id SavedApplicationRefId;
	public PreliminaryApplicationRef SavedApplicationRef;
	public Address SiteAddress;
	public String SiteCity;
	public String SiteCountry;
	public String SiteCountryCode;
	public String SiteGeocodeAccuracy;
	public Decimal SiteLatitude;
	public Decimal SiteLongitude;
	public String SitePostalCode;
	public String SiteState;
	public String SiteStateCode;
	public String SiteStreet;
	public String Status;
	public Boolean WasReturned;

	public BusinessLicenseApplicationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicenseApplicationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicenseApplicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicenseApplicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicenseApplicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
