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
public class Contact extends SObject {
	public static SObjectType$<Contact> SObjectType;
	public static SObjectFields$<Contact> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public Id AccountId;
	public Account Account;
	public com.nawforce.runforce.System.String AssistantName;
	public com.nawforce.runforce.System.String AssistantPhone;
	public Date Birthdate;
	public com.nawforce.runforce.System.String CleanStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Department;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.Boolean DoNotCall;
	public com.nawforce.runforce.System.String Email;
	public Datetime EmailBouncedDate;
	public com.nawforce.runforce.System.String EmailBouncedReason;
	public com.nawforce.runforce.System.Boolean HasOptedOutOfEmail;
	public com.nawforce.runforce.System.Boolean HasOptedOutOfFax;
	public com.nawforce.runforce.System.String Fax;
	public com.nawforce.runforce.System.String FirstName;
	public com.nawforce.runforce.System.String HomePhone;
	public Id Id;
	public Id IndividualId;
	public Individual Individual;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsEmailBounced;
	public com.nawforce.runforce.System.String Jigsaw;
	public com.nawforce.runforce.System.String JigsawContactId;
	public Date LastActivityDate;
	public Datetime LastCURequestDate;
	public Datetime LastCUUpdateDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LastName;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String LeadSource;
	public Address MailingAddress;
	public com.nawforce.runforce.System.String MailingCity;
	public com.nawforce.runforce.System.String MailingCountry;
	public com.nawforce.runforce.System.String MailingCountryCode;
	public com.nawforce.runforce.System.String MailingGeocodeAccuracy;
	public Decimal MailingLatitude;
	public Decimal MailingLongitude;
	public com.nawforce.runforce.System.String MailingPostalCode;
	public com.nawforce.runforce.System.String MailingState;
	public com.nawforce.runforce.System.String MailingStateCode;
	public com.nawforce.runforce.System.String MailingStreet;
	public Id MasterRecordId;
	public Contact MasterRecord;
	public com.nawforce.runforce.System.String MobilePhone;
	public com.nawforce.runforce.System.String Name;
	public Address OtherAddress;
	public com.nawforce.runforce.System.String OtherCity;
	public com.nawforce.runforce.System.String OtherCountry;
	public com.nawforce.runforce.System.String OtherCountryCode;
	public com.nawforce.runforce.System.String OtherGeocodeAccuracy;
	public Decimal OtherLatitude;
	public Decimal OtherLongitude;
	public com.nawforce.runforce.System.String OtherPhone;
	public com.nawforce.runforce.System.String OtherPostalCode;
	public com.nawforce.runforce.System.String OtherState;
	public com.nawforce.runforce.System.String OtherStateCode;
	public com.nawforce.runforce.System.String OtherStreet;
	public Id OwnerId;
	public User Owner;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.String PhotoUrl;
	public Id ReportsToId;
	public Contact ReportsTo;
	public com.nawforce.runforce.System.String Salutation;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Title;

	public AcceptedEventRelation[] AcceptedEventRelations;
	public AccountContactRole[] AccountContactRoles;
	public ActivityHistory[] ActivityHistories;
	public Asset[] Assets;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AuthorizationFormConsent[] AuthorizationFormConsents;
	public CampaignMember[] CampaignMembers;
	public CaseContactRole[] CaseContactRoles;
	public Case[] Cases;
	public CombinedAttachment[] CombinedAttachments;
	public CommSubscriptionConsent[] CommSubscriptionConsents;
	public ContactCleanInfo[] ContactCleanInfos;
	public ContactRequest[] ContactRequests;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContractContactRole[] ContractContactRoles;
	public Contract[] ContractsSigned;
	public CreditMemo[] CreditMemos;
	public DeclinedEventRelation[] DeclinedEventRelations;
	public DuplicateRecordItem[] DuplicateRecordItems;
	public EmailMessageRelation[] EmailMessageRelations;
	public EmailStatus[] EmailStatuses;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ContactFeed[] Feeds;
	public ContactHistory[] Histories;
	public Invoice[] Invoices;
	public SurveyInvitation[] LeadSurveyInvitations;
	public ListEmailIndividualRecipient[] ListEmailIndividualRecipients;
	public MaintenancePlan[] MaintenancePlans;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public Opportunity[] Opportunities;
	public OpportunityContactRole[] OpportunityContactRoles;
	public OutgoingEmailRelation[] OutgoingEmailRelations;
	public UserEmailPreferredPerson[] PersonRecord;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Quote[] Quotes;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public CollaborationGroupRecord[] RecordAssociatedGroups;
	public WorkFeedbackRequest[] RelatedObjects;
	public ReturnOrder[] ReturnOrders;
	public ServiceAppointment[] ServiceAppointments;
	public ContactShare[] Shares;
	public SurveyInvitation[] SurveyInvitations;
	public SurveySubject[] SurveySubjectEntities;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public UndecidedEventRelation[] UndecidedEventRelations;
	public User[] Users;
	public WorkOrder[] WorkOrders;

	public Contact clone$() {throw new java.lang.UnsupportedOperationException();}
	public Contact clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Contact clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Contact clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Contact clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
