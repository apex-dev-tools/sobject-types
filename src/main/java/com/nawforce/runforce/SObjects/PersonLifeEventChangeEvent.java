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
public class PersonLifeEventChangeEvent extends SObject {
	public static SObjectType$<PersonLifeEventChangeEvent> SObjectType;
	public static SObjectFields$<PersonLifeEventChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Datetime EventDate;
	public String EventDescription;
	public Address EventLocation;
	public String EventLocationCity;
	public String EventLocationCountry;
	public String EventLocationCountryCode;
	public String EventLocationGeocodeAccuracy;
	public Decimal EventLocationLatitude;
	public Decimal EventLocationLongitude;
	public String EventLocationPostalCode;
	public String EventLocationState;
	public String EventLocationStateCode;
	public String EventLocationStreet;
	public String EventType;
	public Datetime ExpirationDate;
	public String ExpirationDescription;
	public Id Id;
	public Boolean IsExpired;
	public Boolean IsTentative;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PrimaryPersonId;
	public Contact PrimaryPerson;
	public Id RelatedPersonId;
	public Contact RelatedPerson;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;

	public PersonLifeEventChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersonLifeEventChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersonLifeEventChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersonLifeEventChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersonLifeEventChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
