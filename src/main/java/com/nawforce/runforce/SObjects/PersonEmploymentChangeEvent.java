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
public class PersonEmploymentChangeEvent extends SObject {
	public static SObjectType$<PersonEmploymentChangeEvent> SObjectType;
	public static SObjectFields$<PersonEmploymentChangeEvent> Fields;

	public Decimal AnnualIncome;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
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
	public Date EndDate;
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

	public PersonEmploymentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersonEmploymentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersonEmploymentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersonEmploymentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersonEmploymentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
