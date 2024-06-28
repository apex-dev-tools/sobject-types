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
public class CareProviderSearchableFieldChangeEvent extends SObject {
	public static SObjectType$<CareProviderSearchableFieldChangeEvent> SObjectType;
	public static SObjectFields$<CareProviderSearchableFieldChangeEvent> Fields;

	public String CertificationType;
	public Object ChangeEventHeader;
	public String Condition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EducationType;
	public Address FacilityAddress;
	public String FacilityCity;
	public String FacilityCountry;
	public String FacilityCountryCode;
	public String FacilityGeocodeAccuracy;
	public Id FacilityId;
	public Account Facility;
	public Decimal FacilityLatitude;
	public Decimal FacilityLongitude;
	public String FacilityName;
	public String FacilityPhone;
	public String FacilityPostalCode;
	public String FacilityState;
	public String FacilityStateCode;
	public String FacilityStreet;
	public String GenderRestriction;
	public Id Id;
	public Boolean IsAcceptingNewPatients;
	public Boolean IsHandicapAccess;
	public Boolean IsUpdateNeeded;
	public String LanguagesSpoken;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LicenseJurisdictionCountry;
	public String LicenseJurisdictionRegion;
	public String LicenseJurisdictionState;
	public String LicenseName;
	public String LicenseStatus;
	public String Name;
	public String NationalProviderIdentifier;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id OwnerId;
	public User Owner;
	public String PhotoUrl;
	public String PlanType;
	public String ProviderGender;
	public Id ProviderId;
	public HealthcareProvider Provider;
	public String ProviderName;
	public String ProviderType;
	public String ReplayId;
	public String Service;
	public String ServiceCode;
	public String Specialty;
	public String SubSpecialty;
	public String SyncLogRecord;
	public String UniqueKey;

	public CareProviderSearchableFieldChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareProviderSearchableFieldChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareProviderSearchableFieldChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareProviderSearchableFieldChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareProviderSearchableFieldChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
