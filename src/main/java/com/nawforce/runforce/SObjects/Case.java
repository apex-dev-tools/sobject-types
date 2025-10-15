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
public class Case extends SObject {
	public static SObjectType$<Case> SObjectType;
	public static SObjectFields$<Case> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public Id AccountId;
	public Account Account;
	public Id AssetId;
	public Asset Asset;
	public Id AssetWarrantyId;
	public AssetWarranty AssetWarranty;
	public Id BusinessHoursId;
	public BusinessHours BusinessHours;
	public String CaseNumber;
	public Datetime ClosedDate;
	public String Comments;
	public String ContactEmail;
	public String ContactFax;
	public Id ContactId;
	public Contact Contact;
	public String ContactMobile;
	public String ContactPhone;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Id Id;
	public Boolean IsClosed;
	public Boolean IsClosedOnCreate;
	public Boolean IsDeleted;
	public Boolean IsEscalated;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MasterRecordId;
	public Case MasterRecord;
	public String Origin;
	public Id OwnerId;
	public Name Owner;
	public Id ParentId;
	public Case Parent;
	public String Priority;
	public String Reason;
	public Id SourceId;
	public Name Source;
	public String Status;
	public String Subject;
	public String SuppliedCompany;
	public String SuppliedEmail;
	public String SuppliedName;
	public String SuppliedPhone;
	public Datetime SystemModstamp;
	public String Type;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApplicationCase[] ApplicationCases;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CaseArticle[] CaseArticles;
	public BusinessLicenseApplication[] BusinessLicenseApplicationCase;
	public CareBarrier[] CareBarriers;
	public CareDiagnosis[] CareDiagnoses;
	public CareObservation[] CareObservationCases;
	public CareRequestItem[] CareRequestItems;
	public CareRequestReviewer[] CareRequestReviewers;
	public CareRequest[] CareRequests;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests;
	public CareRequestExtension[] CaseCareRequestExtensions;
	public CaseComment[] CaseComments;
	public CaseContactRole[] CaseContactRoles;
	public CaseExternalDocument[] CaseExternalDocuments;
	public CaseGatewayRequest[] CaseGatewayRequests;
	public CaseMilestone[] CaseMilestones;
	public CaseParticipant[] CaseParticipantCase;
	public CaseRelatedIssue[] CaseRelatedIssues;
	public LoyaltyProgramMemberCase[] CaseRelatedLoyaltyProgramMembers;
	public CaseSolution[] CaseSolutions;
	public Case[] Cases;
	public ChangeRequestRelatedIssue[] ChangeRequestRelatedIssues;
	public Claim[] Claims;
	public ClinicalEncounter[] ClinicalEncounterCases;
	public CombinedAttachment[] CombinedAttachments;
	public ComplaintCase[] ComplaintCaseCase;
	public ContactEncounterParticipant[] ContactEncounterParticipantCases;
	public ContactRequest[] ContactRequests;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public Visit[] Contexts;
	public DiagnosticSummary[] DiagnosticSummaryCases;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] EmailMessages;
	public EmailMessage[] Emails;
	public EngagementTopic[] EngagementInitiatedTopic;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CaseFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthCondition[] Health_Condition_Case;
	public CaseHistory[] Histories;
	public IndividualApplication[] IndividualApplicationCase;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public ListEmail[] ListEmails;
	public MedicationAdministration[] MA_Case;
	public MedicationRequest[] MedReq_Case;
	public MedicationStatement[] MedStatement_Case;
	public MessagingSession[] MessagingSessions;
	public NetworkUserHistoryRecent[] NetworkUserHistoryRecentToRecord;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public SocialPost[] Posts;
	public ProcessException[] ProcessExceptions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductRequestLineItem[] ProductRequestLineItems;
	public ProductRequest[] ProductRequests;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public CollaborationGroupRecord[] RecordAssociatedGroups;
	public AuthorNote[] RecordAuthorNotes;
	public RegulatoryCodeViolation[] RegCodeResponseContext;
	public VoiceCall[] RelatedRecords;
	public ReturnOrder[] ReturnOrders;
	public ServiceAppointment[] ServiceAppointments;
	public CaseShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
	public Specimen[] SpecimenCases;
	public SwarmMember[] SwarmMembers;
	public Swarm[] Swarms;
	public TrackedCommunicationDetail[] TCDetail_Detail;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public CaseTeamMember[] TeamMembers;
	public CaseTeamTemplateRecord[] TeamTemplateRecords;
	public TopicAssignment[] TopicAssignments;
	public UserDefinedLabelAssignment[] UserDefinedLabelAssignments;
	public VideoCall[] VideoRelatedRecords;
	public WorkOrder[] WorkOrders;

	public Case clone$() {throw new java.lang.UnsupportedOperationException();}
	public Case clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Case clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Case clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Case clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
