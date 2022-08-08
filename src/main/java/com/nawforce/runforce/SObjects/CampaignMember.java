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
public class CampaignMember extends SObject {
	public static SObjectType$<CampaignMember> SObjectType;
	public static SObjectFields$<CampaignMember> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public Id CampaignId;
	public Campaign Campaign;
	public com.nawforce.runforce.System.String City;
	public com.nawforce.runforce.System.String CompanyOrAccount;
	public Id ContactId;
	public Contact Contact;
	public com.nawforce.runforce.System.String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.Boolean DoNotCall;
	public com.nawforce.runforce.System.String Email;
	public com.nawforce.runforce.System.String Fax;
	public com.nawforce.runforce.System.String FirstName;
	public Date FirstRespondedDate;
	public com.nawforce.runforce.System.Boolean HasOptedOutOfEmail;
	public com.nawforce.runforce.System.Boolean HasOptedOutOfFax;
	public com.nawforce.runforce.System.Boolean HasResponded;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LastName;
	public Id LeadId;
	public Lead Lead;
	public Id LeadOrContactId;
	public SObject LeadOrContact;
	public Id LeadOrContactOwnerId;
	public Name LeadOrContactOwner;
	public com.nawforce.runforce.System.String LeadSource;
	public com.nawforce.runforce.System.String MobilePhone;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.String PostalCode;
	public com.nawforce.runforce.System.String Salutation;
	public com.nawforce.runforce.System.String State;
	public com.nawforce.runforce.System.String Status;
	public com.nawforce.runforce.System.String Street;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Title;
	public com.nawforce.runforce.System.String Type;

	public ListEmailIndividualRecipient[] ListEmailIndividualRecipients;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;

	public CampaignMember clone$() {throw new java.lang.UnsupportedOperationException();}
	public CampaignMember clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CampaignMember clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CampaignMember clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CampaignMember clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
