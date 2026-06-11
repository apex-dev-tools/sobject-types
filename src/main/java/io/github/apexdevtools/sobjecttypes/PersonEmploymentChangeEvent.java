/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PersonEmploymentChangeEvent extends SObject {
	public static SObjectType$<PersonEmploymentChangeEvent> SObjectType;
	public static SObjectFields$<PersonEmploymentChangeEvent> Fields;

	public Decimal AnnualIncome;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Address EmployerAddress;
	public String EmployerCity;
	public String EmployerCountry;
	public String EmployerCountryCode;
	public String EmployerGeocodeAccuracy;
	public Decimal EmployerLatitude;
	public Decimal EmployerLongitude;
	public String EmployerPhone;
	public String EmployerPostalCode;
	public String EmployerState;
	public String EmployerStateCode;
	public String EmployerStreet;
	public String EmploymentStatus;
	public String EmploymentType;
	public Date EndDate;
	public Id HealthcareProviderId;
	public HealthcareProvider HealthcareProvider;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Occupation;
	public Id OwnerId;
	public User Owner;
	public String Position;
	public Id RelatedPersonId;
	public SObject RelatedPerson;
	public String ReplayId;
	public Date StartDate;
	public Date VerificationDate;
	public String VerificationStatus;

	public PersonEmploymentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersonEmploymentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersonEmploymentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersonEmploymentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersonEmploymentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
