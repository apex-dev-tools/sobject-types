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
public class PersonEducationChangeEvent extends SObject {
	public static SObjectType$<PersonEducationChangeEvent> SObjectType;
	public static SObjectFields$<PersonEducationChangeEvent> Fields;

	public String CertificateIdentifier;
	public Object ChangeEventHeader;
	public Datetime CompletionDate;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EducationLevel;
	public Datetime GraduationDate;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Id Id;
	public String Identifier;
	public String IdentifierIssuer;
	public Id IndividualId;
	public Individual Individual;
	public Address InstitutionAddress;
	public String InstitutionCity;
	public String InstitutionCountry;
	public String InstitutionCountryCode;
	public String InstitutionGeocodeAccuracy;
	public Decimal InstitutionLatitude;
	public Decimal InstitutionLongitude;
	public String InstitutionPostalCode;
	public String InstitutionState;
	public String InstitutionStateCode;
	public String InstitutionStreet;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ProgramName;
	public String ReplayId;
	public Datetime StartDate;
	public String Status;
	public Id UserId;
	public User User;
	public String VerificationStatus;
	public Datetime VerifiedDate;

	public PersonEducationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersonEducationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersonEducationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersonEducationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersonEducationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
