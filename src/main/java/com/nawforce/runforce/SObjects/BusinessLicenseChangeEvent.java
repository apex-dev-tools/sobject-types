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
public class BusinessLicenseChangeEvent extends SObject {
	public static SObjectType$<BusinessLicenseChangeEvent> SObjectType;
	public static SObjectFields$<BusinessLicenseChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id BusinessTypeId;
	public BusinessType BusinessType;
	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Id Id;
	public String Identifier;
	public Boolean IsActive;
	public Boolean IsPrimaryLicense;
	public Date IssueDate;
	public String Issuer;
	public String JurisdictionCountry;
	public String JurisdictionOther;
	public String JurisdictionState;
	public String JurisdictionType;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LicenseClass;
	public String LicenseNumber;
	public String LineOfAuthority;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Datetime PeriodEnd;
	public Datetime PeriodStart;
	public Id RegulatoryAuthorizationTypeId;
	public RegulatoryAuthorizationType RegulatoryAuthorizationType;
	public String ReplayId;
	public String ResidenceStatus;
	public Date SourceSystemUpdateDate;
	public String Status;
	public Id UserId;
	public User User;
	public String VerificationStatus;
	public Date VerifiedDate;

	public BusinessLicenseChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicenseChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicenseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicenseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLicenseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
