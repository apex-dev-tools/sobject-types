/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LeadChangeEvent extends SObject {
	public static SObjectType$<LeadChangeEvent> SObjectType;
	public static SObjectFields$<LeadChangeEvent> Fields;

	public Address Address;
	public Decimal AnnualRevenue;
	public Object ChangeEventHeader;
	public String City;
	public String CleanStatus;
	public String Company;
	public String CompanyDunsNumber;
	public Id ConvertedAccountId;
	public Account ConvertedAccount;
	public Id ConvertedContactId;
	public Contact ConvertedContact;
	public Date ConvertedDate;
	public Id ConvertedOpportunityId;
	public Opportunity ConvertedOpportunity;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DandbCompanyId;
	public DandBCompany DandbCompany;
	public String Description;
	public Boolean DoNotCall;
	public String Email;
	public Datetime EmailBouncedDate;
	public String EmailBouncedReason;
	public String Fax;
	public String FirstName;
	public String GeocodeAccuracy;
	public Boolean HasOptedOutOfEmail;
	public Boolean HasOptedOutOfFax;
	public Id Id;
	public Id IndividualId;
	public Individual Individual;
	public String Industry;
	public Boolean IsConverted;
	public Boolean IsUnreadByOwner;
	public String Jigsaw;
	public String JigsawContactId;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public Date LastTransferDate;
	public Decimal Latitude;
	public String LeadSource;
	public Decimal Longitude;
	public String MobilePhone;
	public String Name;
	public Integer NumberOfEmployees;
	public Id OwnerId;
	public User Owner;
	public String Phone;
	public String PostalCode;
	public String Rating;
	public String ReplayId;
	public String Salutation;
	public String State;
	public String StateCode;
	public String Status;
	public String Street;
	public String Title;
	public String Website;

	public LeadChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LeadChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LeadChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LeadChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LeadChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
