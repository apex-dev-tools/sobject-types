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
public class Contact extends SObject {
	public static SObjectType$<Contact> SObjectType;
	public static SObjectFields$<Contact> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public Id AccountId;
	public Account Account;
	public String AssistantName;
	public String AssistantPhone;
	public Date Birthdate;
	public String CleanStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Department;
	public String Description;
	public Boolean DoNotCall;
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
	public Boolean IsDeleted;
	public Boolean IsEmailBounced;
	public String Jigsaw;
	public String JigsawContactId;
	public Date LastActivityDate;
	public Datetime LastCURequestDate;
	public Datetime LastCUUpdateDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
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
	public Id MasterRecordId;
	public Contact MasterRecord;
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
	public String PhotoUrl;
	public Id ReportsToId;
	public Contact ReportsTo;
	public String Salutation;
	public Datetime SystemModstamp;
	public String Title;

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
	public ConversationParticipant[] ConversationParticipants;
	public CreditMemo[] CreditMemos;
	public DeclinedEventRelation[] DeclinedEventRelations;
	public DuplicateRecordItem[] DuplicateRecordItems;
	public EmailMessageRelation[] EmailMessageRelations;
	public EmailStatus[] EmailStatuses;
	public EntitlementContact[] EntitlementContacts;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ContactFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GroupCensusMember[] GroupCensusMembers;
	public ContactHistory[] Histories;
	public Invoice[] Invoices;
	public SurveyInvitation[] LeadSurveyInvitations;
	public ListEmailIndividualRecipient[] ListEmailIndividualRecipients;
	public ListEmail[] ListEmails;
	public MaintenancePlan[] MaintenancePlans;
	public MessagingEndUser[] MessagingEndUsers;
	public MessagingSession[] MessagingSessions;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public Opportunity[] Opportunities;
	public OpportunityContactRole[] OpportunityContactRoles;
	public OutgoingEmailRelation[] OutgoingEmailRelations;
	public NetworkActivityAudit[] ParentEntities;
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
	public ServiceContract[] ServiceContracts;
	public ContactShare[] Shares;
	public SurveyInvitation[] SurveyInvitations;
	public SurveySubject[] SurveySubjectEntities;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public UndecidedEventRelation[] UndecidedEventRelations;
	public User[] Users;
	public WorkOrder[] WorkOrders;

	public Contact clone$() {throw new java.lang.UnsupportedOperationException();}
	public Contact clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Contact clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Contact clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Contact clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
