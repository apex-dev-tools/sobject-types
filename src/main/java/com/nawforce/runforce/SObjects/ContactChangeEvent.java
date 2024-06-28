/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContactChangeEvent extends SObject {
	public static SObjectType$<ContactChangeEvent> SObjectType;
	public static SObjectFields$<ContactChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String AssistantName;
	public String AssistantPhone;
	public Date Birthdate;
	public Object ChangeEventHeader;
	public String CleanStatus;
	public String ContactSource;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Department;
	public String Description;
	public Boolean DoNotCall;
	public String Division;
	public String Email;
	public Datetime EmailBouncedDate;
	public String EmailBouncedReason;
	public String Fax;
	public String FirstName;
	public Boolean HasOptedOutOfEmail;
	public Boolean HasOptedOutOfFax;
	public String HomePhone;
	public Id Id;
	public Id IndividualId;
	public Individual Individual;
	public Boolean IsPersonAccount;
	public String Jigsaw;
	public String JigsawContactId;
	public Datetime LastCURequestDate;
	public Datetime LastCUUpdateDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public String LeadSource;
	public Address MailingAddress;
	public String MailingCity;
	public String MailingCountry;
	public String MailingCountryCode;
	public String MailingGeocodeAccuracy;
	public Decimal MailingLatitude;
	public Decimal MailingLongitude;
	public String MailingPostalCode;
	public String MailingState;
	public String MailingStateCode;
	public String MailingStreet;
	public String MobilePhone;
	public String Name;
	public Address OtherAddress;
	public String OtherCity;
	public String OtherCountry;
	public String OtherCountryCode;
	public String OtherGeocodeAccuracy;
	public Decimal OtherLatitude;
	public Decimal OtherLongitude;
	public String OtherPhone;
	public String OtherPostalCode;
	public String OtherState;
	public String OtherStateCode;
	public String OtherStreet;
	public Id OwnerId;
	public User Owner;
	public String Phone;
	public String ReplayId;
	public Id ReportsToId;
	public Contact ReportsTo;
	public String Salutation;
	public String Title;

	public ContactChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
