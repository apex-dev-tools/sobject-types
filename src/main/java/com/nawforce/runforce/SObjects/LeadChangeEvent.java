/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LeadChangeEvent extends SObject {
	public static SObjectType$<LeadChangeEvent> SObjectType;
	public static SObjectFields$<LeadChangeEvent> Fields;

	public Address Address;
	public Decimal AnnualRevenue;
	public Object ChangeEventHeader;
	public com.nawforce.runforce.System.String City;
	public com.nawforce.runforce.System.String CleanStatus;
	public com.nawforce.runforce.System.String Company;
	public com.nawforce.runforce.System.String CompanyDunsNumber;
	public Id ConvertedAccountId;
	public Account ConvertedAccount;
	public Id ConvertedContactId;
	public Contact ConvertedContact;
	public Date ConvertedDate;
	public Id ConvertedOpportunityId;
	public Opportunity ConvertedOpportunity;
	public com.nawforce.runforce.System.String Country;
	public com.nawforce.runforce.System.String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Id DandbCompanyId;
	public DandBCompany DandbCompany;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String Email;
	public Datetime EmailBouncedDate;
	public com.nawforce.runforce.System.String EmailBouncedReason;
	public com.nawforce.runforce.System.String Fax;
	public com.nawforce.runforce.System.String FirstName;
	public com.nawforce.runforce.System.String GeocodeAccuracy;
	public Id Id;
	public Id IndividualId;
	public Individual Individual;
	public com.nawforce.runforce.System.String Industry;
	public com.nawforce.runforce.System.Boolean IsConverted;
	public com.nawforce.runforce.System.Boolean IsUnreadByOwner;
	public com.nawforce.runforce.System.String Jigsaw;
	public com.nawforce.runforce.System.String JigsawContactId;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LastName;
	public Decimal Latitude;
	public com.nawforce.runforce.System.String LeadSource;
	public Decimal Longitude;
	public com.nawforce.runforce.System.String MobilePhone;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer NumberOfEmployees;
	public Id OwnerId;
	public User Owner;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.String PostalCode;
	public com.nawforce.runforce.System.String Rating;
	public com.nawforce.runforce.System.String ReplayId;
	public com.nawforce.runforce.System.String Salutation;
	public com.nawforce.runforce.System.String State;
	public com.nawforce.runforce.System.String StateCode;
	public com.nawforce.runforce.System.String Status;
	public com.nawforce.runforce.System.String Street;
	public com.nawforce.runforce.System.String Title;
	public com.nawforce.runforce.System.String Website;

	public LeadChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LeadChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LeadChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LeadChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LeadChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
