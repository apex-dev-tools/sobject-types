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
public class Contract extends SObject {
	public static SObjectType$<Contract> SObjectType;
	public static SObjectFields$<Contract> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public Id AccountId;
	public Account Account;
	public Id ActivatedById;
	public User ActivatedBy;
	public Datetime ActivatedDate;
	public Address BillingAddress;
	public com.nawforce.runforce.System.String BillingCity;
	public com.nawforce.runforce.System.String BillingCountry;
	public com.nawforce.runforce.System.String BillingCountryCode;
	public com.nawforce.runforce.System.String BillingGeocodeAccuracy;
	public Decimal BillingLatitude;
	public Decimal BillingLongitude;
	public com.nawforce.runforce.System.String BillingPostalCode;
	public com.nawforce.runforce.System.String BillingState;
	public com.nawforce.runforce.System.String BillingStateCode;
	public com.nawforce.runforce.System.String BillingStreet;
	public Date CompanySignedDate;
	public Id CompanySignedId;
	public User CompanySigned;
	public com.nawforce.runforce.System.String ContractNumber;
	public com.nawforce.runforce.System.Integer ContractTerm;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Date CustomerSignedDate;
	public Id CustomerSignedId;
	public Contact CustomerSigned;
	public com.nawforce.runforce.System.String CustomerSignedTitle;
	public com.nawforce.runforce.System.String Description;
	public Date EndDate;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Date LastActivityDate;
	public Datetime LastApprovedDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String OwnerExpirationNotice;
	public Id OwnerId;
	public User Owner;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public com.nawforce.runforce.System.String SpecialTerms;
	public Date StartDate;
	public com.nawforce.runforce.System.String Status;
	public com.nawforce.runforce.System.String StatusCode;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public Approval[] Approvals;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContractContactRole[] ContractContactRoles;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ContractFeed[] Feeds;
	public ContractHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public Order[] Orders;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Quote[] Quotes;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public CollaborationGroupRecord[] RecordAssociatedGroups;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public Contract clone$() {throw new java.lang.UnsupportedOperationException();}
	public Contract clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Contract clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Contract clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Contract clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
