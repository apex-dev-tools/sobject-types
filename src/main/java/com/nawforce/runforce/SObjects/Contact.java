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
	public Boolean HasPrivacyHold;
	public String HomePhone;
	public Id Id;
	public Id IndividualId;
	public Individual Individual;
	public Boolean IsDeleted;
	public Boolean IsEmailBounced;
	public Boolean IsPersonAccount;
	public Boolean IsPriorityRecord;
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
	public AccountContactRelation[] AccountContactRelations;
	public AccountContactRole[] AccountContactRoles;
	public Accreditation[] Accreditations;
	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AssetContactParticipant[] AssetContactParticipantContact;
	public Asset[] Assets;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AuthorNote[] AuthorNotes;
	public AuthorizationFormConsent[] AuthorizationFormConsents;
	public Award[] Awards;
	public BoardCertification[] BoardCertifications;
	public Applicant[] BusinessContactApplicants;
	public BusinessLicense[] BusinessLicenses;
	public ClaimParticipant[] CPContacts;
	public CampaignMember[] CampaignMembers;
	public CarePerformer[] CarePerfPersonEntities;
	public CareProviderAdverseAction[] CareProviderAdverseActions;
	public CareTaskDetail[] CareTaskDetailDetailRecord;
	public CareTask[] CareTaskOwnedBy;
	public CareTask[] CareTaskRequestedBy;
	public CareProgramProvider[] Care_Program_Providers;
	public CaseContactRole[] CaseContactRoles;
	public CaseParticipant[] CaseParticipants;
	public Case[] Cases;
	public CombinedAttachment[] CombinedAttachments;
	public CommSubscriptionConsent[] CommSubscriptionConsents;
	public ComplaintParticipant[] ComplaintParticipants;
	public LoyaltyPgmGroupMbrRlnsp[] Con_LoyaltyPgmGroupMbrRlnsps;
	public Applicant[] ContactApplicants;
	public ContactCleanInfo[] ContactCleanInfos;
	public ContactEncounterParticipant[] ContactEncounterParticipants;
	public PartyProfile[] ContactPartyProfiles;
	public ContactRequest[] ContactRequests;
	public ContactProfile[] Contacts;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContractContactRole[] ContractContactRoles;
	public Contract[] ContractsSigned;
	public ConversationParticipant[] ConversationParticipants;
	public CreditMemo[] CreditMemos;
	public DiagnosticSummary[] DSumAuthenticatorDomain;
	public DeclinedEventRelation[] DeclinedEventRelations;
	public DistributorAuthorization[] DistributorAuthorizations;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public DocumentChecklistItem[] DocumentChecklistWho;
	public DocumentRecipient[] DocumentRecipients;
	public DuplicateRecordItem[] DuplicateRecordItems;
	public EmailMessageRelation[] EmailMessageRelations;
	public EmailStatus[] EmailStatuses;
	public EmssnRdctnCommitment[] EmissionsReductionCommitments;
	public EngagementInteraction[] EngagementInitiatingAttendee;
	public EngagementTopic[] EngagementRelatedPerson;
	public EntitlementContact[] EntitlementContacts;
	public EventRelation[] EventRelations;
	public EventWhoRelation[] EventWhoRelations;
	public Event[] Events;
	public EngagementAttendee[] ExternalAttendees;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ContactFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public FulfillmentOrder[] FulfillmentOrders;
	public GenericVisitTaskContext[] GVTaskContexts;
	public CareRequest[] GeneralPractitionerCareRequests;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GroupCensusMember[] GroupCensusMembers;
	public HealthcarePractitionerFacility[] HealthcarePractitionerFacilities;
	public HealthcareProviderNpi[] HealthcareProviderNpis;
	public HealthcareProviderSpecialty[] HealthcareProviderSpecialties;
	public HealthcareProviderTaxonomy[] HealthcareProviderTaxonomies;
	public HealthcareProvider[] HealthcareProviders;
	public HealthcareProvider[] HealthcareProvidersReferredBy;
	public HealthcareFacilityNetwork[] Healthcare_Facility_Networks;
	public ContactHistory[] Histories;
	public Identifier[] Identifiers;
	public IdentityDocument[] IdentityDocumentDetails;
	public IndividualApplication[] IndividualApplicationContact;
	public PersonLanguage[] IndividualDefinitions;
	public InfoAuthorizationRequest[] InfoAuthRequestConsenters;
	public InfoAuthorizationRequest[] InfoAuthRequestPertainsTo;
	public InfoAuthorizationRequest[] InfoAuthRequestRequesters;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public InsuranceProfile[] InsuranceProfiles;
	public Invoice[] Invoices;
	public SurveyInvitation[] LeadSurveyInvitations;
	public ListEmailIndividualRecipient[] ListEmailIndividualRecipients;
	public ListEmail[] ListEmails;
	public LoanApplicant[] LoanApplicants;
	public MaintenancePlan[] MaintenancePlans;
	public MedicationTherapyReview[] MedTherapyReview_Surrogates;
	public MedicationDispense[] MedicationDispense_CollectedBy;
	public MessagingEndUser[] MessagingEndUsers;
	public MessagingSession[] MessagingSessions;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public Opportunity[] Opportunities;
	public OpportunityContactRole[] OpportunityContactRoles;
	public OutgoingEmailRelation[] OutgoingEmailRelations;
	public NetworkActivityAudit[] ParentEntities;
	public GameParticipant[] Participants;
	public PartyExpense[] PartyExpenseParty;
	public PartyExpense[] PartyExpensePayee;
	public PartyExpense[] PartyExpensePayer;
	public PartyFinancialAsset[] PartyFinAssetParty;
	public PartyIncome[] PartyIncomes;
	public PendingOrderSummary[] PendingOrderSummaries;
	public PersonDisability[] PersonDisabilities;
	public PersonEducation[] PersonEducations;
	public PersonEmployment[] PersonEmploymentDetails;
	public PersonExamination[] PersonExamContact;
	public PersonLifeEvent[] PersonLifeEvents;
	public PersonName[] PersonNamesParents;
	public UserEmailPreferredPerson[] PersonRecord;
	public SocialPersona[] Personas;
	public SocialPost[] Posts;
	public InsurancePolicyParticipant[] PrimaryParticipants;
	public PrivacyHold[] PrivacyHoldReferences;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Quote[] Quotes;
	public ProducerCommission[] ProducerCommissions;
	public Producer[] ProducersContact;
	public PublicApplicationParticipant[] PublicApplicationParticipants;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public CollaborationGroupRecord[] RecordAssociatedGroups;
	public WorkFeedbackRequest[] RelatedObjects;
	public InsurancePolicyParticipant[] RelatedParticipants;
	public VideoCallParticipant[] RelatedPersons;
	public VoiceCall[] RelatedRecords;
	public CareRequest[] RequestingPractitionerCareRequests;
	public ReturnOrder[] ReturnOrders;
	public ServiceAppointment[] ServiceAppointments;
	public ServiceContract[] ServiceContracts;
	public CareRequest[] ServicingPractitionerCareRequests;
	public ContactShare[] Shares;
	public SurveyInvitation[] SurveyInvitations;
	public SurveySubject[] SurveySubjectEntities;
	public IndividualApplication[] SubmittedByContact_IndividualApplications;
	public TrackedCommunication[] TCCommunicatorReference;
	public TrainingCourseParticipant[] TCPContact;
	public TrackedCommunication[] TCRequesterReference;
	public TrackedCommunication[] TCSubject;
	public TaskRelation[] TaskRelations;
	public TaskWhoRelation[] TaskWhoRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public UndecidedEventRelation[] UndecidedEventRelations;
	public UserDefinedLabelAssignment[] UserDefinedLabelAssignments;
	public User[] Users;
	public VideoCall[] VideoRelatedRecords;
	public Visit[] VisitContact;
	public VisitedParty[] VisitedParties;
	public Visitor[] Visitors;
	public Voucher[] VoucherContact;
	public WaitlistParticipant[] WaitlistParticipants;
	public WorkOrder[] WorkOrders;

	public Contact clone$() {throw new java.lang.UnsupportedOperationException();}
	public Contact clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Contact clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Contact clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Contact clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
