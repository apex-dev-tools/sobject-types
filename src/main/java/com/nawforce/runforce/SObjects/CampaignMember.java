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
public class CampaignMember extends SObject {
	public static SObjectType$<CampaignMember> SObjectType;
	public static SObjectFields$<CampaignMember> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public Id CampaignId;
	public Campaign Campaign;
	public String City;
	public String CompanyOrAccount;
	public Id ContactId;
	public Contact Contact;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Boolean DoNotCall;
	public String Email;
	public String Fax;
	public String FirstName;
	public Date FirstRespondedDate;
	public Boolean HasOptedOutOfEmail;
	public Boolean HasOptedOutOfFax;
	public Boolean HasResponded;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public Id LeadId;
	public Lead Lead;
	public Id LeadOrContactId;
	public SObject LeadOrContact;
	public Id LeadOrContactOwnerId;
	public Name LeadOrContactOwner;
	public String LeadSource;
	public String MobilePhone;
	public String Name;
	public String Phone;
	public String PostalCode;
	public String Salutation;
	public String State;
	public String Status;
	public String Street;
	public Datetime SystemModstamp;
	public String Title;
	public String Type;

	public ListEmailIndividualRecipient[] ListEmailIndividualRecipients;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;

	public CampaignMember clone$() {throw new java.lang.UnsupportedOperationException();}
	public CampaignMember clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CampaignMember clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CampaignMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CampaignMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
