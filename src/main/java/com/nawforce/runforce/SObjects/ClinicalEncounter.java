/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ClinicalEncounter extends SObject {
	public static SObjectType$<ClinicalEncounter> SObjectType;
	public static SObjectFields$<ClinicalEncounter> Fields;

	public String AdmissionSource;
	public String Category;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DestinationFacilityId;
	public HealthcareFacility DestinationFacility;
	public Id DestinationOrganizationId;
	public Account DestinationOrganization;
	public String DietPreference;
	public Id DischargeDispositionId;
	public CodeSetBundle DischargeDisposition;
	public Decimal Duration;
	public Id DurationUnitId;
	public UnitOfMeasure DurationUnit;
	public Datetime EndDate;
	public Id FacilityId;
	public HealthcareFacility Facility;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PatientId;
	public Account Patient;
	public Id PreAdmissionIdentifierId;
	public ClinicalEncounterIdentifier PreAdmissionIdentifier;
	public Id PreviousFacilityId;
	public HealthcareFacility PreviousFacility;
	public Id PreviousOrganizationId;
	public Account PreviousOrganization;
	public Id PriorityId;
	public CodeSetBundle Priority;
	public Id ReadmissionCodeId;
	public CodeSetBundle ReadmissionCode;
	public Id RelatedClinicalEncounterId;
	public ClinicalEncounter RelatedClinicalEncounter;
	public Id ServiceAppointmentId;
	public ServiceAppointment ServiceAppointment;
	public String ServiceType;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String SpecialCourtesy;
	public Datetime StartDate;
	public String Status;
	public Datetime SystemModstamp;
	public Id TypeId;
	public CodeSetBundle Type;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AllergyIntolerance[] Allergy_Intolerance_ClinicalEncounter;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public ClinicalEncounter[] CE_RelatedClinicalEncounter;
	public CareObservation[] CareObservation_ClinicalEncounter;
	public CareTask[] CareTaskClinicalEncounters;
	public ClinicalAlert[] ClinicalAlert_RelatedEncounter;
	public ClinicalEncounterDiagnosis[] ClinicalEncounterDiagnoses;
	public ClinicalEncounterReason[] ClinicalEncounterReasons;
	public ClinicalEncounterSvcRequest[] ClinicalEncounters;
	public ClinicalEncounterFacility[] Clinical_Encounter_Facility;
	public ClinicalEncounterIdentifier[] Clinical_Encounter_Identifiers;
	public ClinicalEncounterProvider[] Clinical_Encounter_Providers;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DiagnosticSummaryDetail[] DiagSummaryDetailDomain;
	public DiagnosticSummary[] DiagnosticSummary_ClinicalEncounter;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public ClinicalServiceRequest[] Encounters;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ClinicalEncounterFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthCondition[] Health_Condition_ClinicalEncounter;
	public ClinicalEncounterHistory[] Histories;
	public Identifier[] Identifiers;
	public MedicationDispense[] MedicationDispense_Contexts;
	public MedicationRequest[] MedicationRequest_ClinicalEncounter;
	public MedicationStatement[] MedicationStatement_ClinicalEncounter;
	public OpenActivity[] OpenActivities;
	public PatientMedicalProcedure[] PMP_ClinicalEncounter;
	public PatientImmunization[] Patient_Immunization_ClinicalEncounter;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthorNote[] RecordAuthorNotes;
	public ClinicalEncounterShare[] Shares;
	public TrackedCommunication[] TCContextReference;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ClinicalEncounter clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounter clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounter clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalEncounter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
