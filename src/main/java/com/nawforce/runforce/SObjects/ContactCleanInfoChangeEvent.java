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
public class ContactCleanInfoChangeEvent extends SObject {
	public static SObjectType$<ContactCleanInfoChangeEvent> SObjectType;
	public static SObjectFields$<ContactCleanInfoChangeEvent> Fields;

	public Address Address;
	public Object ChangeEventHeader;
	public String City;
	public Boolean CleanedByJob;
	public Boolean CleanedByUser;
	public Id ContactId;
	public Contact Contact;
	public String ContactStatusDataDotCom;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataDotComId;
	public String Division;
	public String Email;
	public String FirstName;
	public String GeocodeAccuracy;
	public Id Id;
	public Boolean IsDifferentCity;
	public Boolean IsDifferentCountry;
	public Boolean IsDifferentCountryCode;
	public Boolean IsDifferentEmail;
	public Boolean IsDifferentFirstName;
	public Boolean IsDifferentLastName;
	public Boolean IsDifferentPhone;
	public Boolean IsDifferentPostalCode;
	public Boolean IsDifferentState;
	public Boolean IsDifferentStateCode;
	public Boolean IsDifferentStreet;
	public Boolean IsDifferentTitle;
	public Boolean IsFlaggedWrongAddress;
	public Boolean IsFlaggedWrongEmail;
	public Boolean IsFlaggedWrongName;
	public Boolean IsFlaggedWrongPhone;
	public Boolean IsFlaggedWrongTitle;
	public Boolean IsInactive;
	public Boolean IsReviewedAddress;
	public Boolean IsReviewedEmail;
	public Boolean IsReviewedName;
	public Boolean IsReviewedPhone;
	public Boolean IsReviewedTitle;
	public Datetime LastMatchedDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public Id LastStatusChangedById;
	public User LastStatusChangedBy;
	public Datetime LastStatusChangedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public String Name;
	public String Phone;
	public String PostalCode;
	public String ReplayId;
	public String State;
	public String StateCode;
	public String Street;
	public String Title;

	public ContactCleanInfoChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactCleanInfoChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactCleanInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactCleanInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactCleanInfoChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
