/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class HealthcareProvider extends SObject {
	public static SObjectType$<HealthcareProvider> SObjectType;
	public static SObjectFields$<HealthcareProvider> Fields;

	public Id AccountId;
	public Account Account;
	public String CaqhIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EffectiveFrom;
	public Date EffectiveTo;
	public String EhrSystem;
	public Boolean HasCarrierContract;
	public Id Id;
	public Date InitialStartDate;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsNotSearchable;
	public Boolean IsPrivacyLawEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String OperatingCountryCode;
	public Id OwnerId;
	public Name Owner;
	public Id PractitionerId;
	public Contact Practitioner;
	public String ProfessionalTitle;
	public String ProviderClass;
	public Id ProviderPhotoId;
	public ContentDocument ProviderPhoto;
	public String ProviderType;
	public Id ReferredByContactId;
	public Contact ReferredByContact;
	public Id RelatedUserId;
	public User RelatedUser;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Date SourceSystemModifiedDate;
	public String Status;
	public Datetime SystemModstamp;
	public Date TerminationDate;
	public String TerminationReason;
	public Integer TotalLicensedBeds;

	public Accreditation[] Accreditations;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AllergyIntolerance[] AllergyIntolAsserterRecorderEntities;
	public AllergyIntolerance[] AllergyIntol_AssertionSource;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public PatientMedicalProcedure[] AsserterRecEntities;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AuthorNote[] AuthorNotes;
	public BoardCertification[] BoardCertifications;
	public BusinessLicense[] BusinessLicenses;
	public ClinicalDetectedIssueDetail[] CDetectedIssueDetailRecords;
	public ClinicalDetectedIssueDetail[] CDetectedIssueMitigationAuthor;
	public ClinicalEncounterProvider[] CEP_Practitioners;
	public CareObservation[] CareObservers;
	public CarePerformer[] CarePerfPersonEntities;
	public CareProgramTeamMember[] CareProgramTeamMembers;
	public CareProviderAdverseAction[] CareProviderAdverseActions;
	public CareRequestDrug[] CareRequestDrugs;
	public CareRequestReviewer[] CareRequestReviewers;
	public CareTask[] CareTaskBeneficiaries;
	public CareTaskDetail[] CareTaskDetailDetailRecord;
	public CareTask[] CareTaskRequestedBy;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests_Prescriber;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests_Provider;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests_Requester;
	public ClinicalAlert[] ClinicalAlertSubjects;
	public ClinicalAlert[] ClinicalAlert_RaisedBy;
	public ClinicalDetectedIssue[] ClinicalDetectedIssue_Identifiers;
	public ClinicalServiceRequest[] ClinicalServRequestPerformer;
	public ClinicalServiceRequest[] ClinicalServRequestRequester;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DiagnosticSummary[] DSumAuthenticatorDomain;
	public DiagnosticSummaryDetail[] DiagSummaryDetailDomain;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public HealthcareProviderFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthRiskEvaluation[] HRE_Evaluator;
	public HealthCondition[] HealthCondAsserterRecorderEntities;
	public HealthCondition[] HealthCondAssertionSrc;
	public HealthcareFacility[] HealthcareFacilityProviders;
	public HealthcarePractitionerFacility[] HealthcarePractitionerFacilities;
	public HealthcareProviderService[] HealthcareProviderGroup;
	public HealthcareProviderTaxonomy[] HealthcareProviderTaxonomies_HealthcareProvider;
	public CarePgmProvHealthcareProvider[] HealthcareProviders;
	public HealthcareFacilityNetwork[] Healthcare_Facility_Networks;
	public HealthcareProviderHistory[] Histories;
	public HlthCareProvTreatedCondition[] HlthCareProvTreatedCondition_HealthcareProviders;
	public InsurancePolicy[] IPInsurancePolicy;
	public Identifier[] Identifiers;
	public MedicationAdministrationDtl[] MedAdminDtl_DetailRecord;
	public MedicationRequest[] MedReqSecondarySourceEntities;
	public MedicationRequest[] MedRequestsPerformer;
	public MedicationRequest[] MedRequestsRequester;
	public MedicationStatement[] MedStatementSourceEntities;
	public MedicationTherapyReview[] MedTherapyReview_Surrogates;
	public MedicationDispense[] MedicationDispense_CollectedBy;
	public MedicationDispense[] MedicationDispense_SubstitutedBy;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public PatientMedicalProcedure[] PMP_AssertionSource;
	public PersonEducation[] PersonEducations;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CareProviderSearchableField[] ProviderCareProviderSearchableField;
	public CareRequestExtension[] ProviderCareRequestExtensions;
	public ProviderNetworkContract[] ProviderNetworkContracts;
	public ProviderSearchSyncLog[] Provider_Search_Sync_Logs;
	public CareRequestExtension[] RequestingProviderCareRequestExtensions;
	public CareRequestExtension[] ServicingProviderCareRequestExtensions;
	public CareRequestItem[] ServicingProviderCareRequestItems;
	public HealthcareProviderShare[] Shares;
	public Specimen[] SpecimenCollector;
	public TrackedCommunicationDetail[] TCDetail_Detail;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public HealthcareProvider clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProvider clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProvider clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProvider clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProvider clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
