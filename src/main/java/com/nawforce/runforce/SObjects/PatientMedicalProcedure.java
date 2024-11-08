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
public class PatientMedicalProcedure extends SObject {
	public static SObjectType$<PatientMedicalProcedure> SObjectType;
	public static SObjectFields$<PatientMedicalProcedure> Fields;

	public Id AssertionSourceId;
	public Name AssertionSource;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CodeId;
	public CodeSetBundle Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public String DurationTimeString;
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
	public String Outcome;
	public Id OwnerId;
	public Name Owner;
	public Id PatientId;
	public Account Patient;
	public Id PerformedAgeRangeUnitId;
	public UnitOfMeasure PerformedAgeRangeUnit;
	public Decimal PerformedAtAge;
	public Decimal PerformedAtAgeLowerLimit;
	public Id PerformedAtAgeUnitId;
	public UnitOfMeasure PerformedAtAgeUnit;
	public Decimal PerformedAtAgeUpperLimit;
	public Id ReasonCodeId;
	public CodeSetBundle ReasonCode;
	public Id ReasonReferenceId;
	public Name ReasonReference;
	public Id RecordCreatorId;
	public Name RecordCreator;
	public Id ReportId;
	public DiagnosticSummary Report;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Datetime StartDate;
	public String Status;
	public Id StatusReasonCodeId;
	public CodeSetBundle StatusReasonCode;
	public Datetime SystemModstamp;
	public Id TypeId;
	public CodeSetBundle Type;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CareObservation[] CareObservation_PartOf;
	public CarePerformer[] CarePerformerParents;
	public ClinicalEncounterDiagnosis[] ClinEncDiagnosis;
	public ClinicalEncounterReason[] ClinEncReason_ReasonRef;
	public ClinicalAlert[] ClinicalAlertSubjects;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PatientMedicalProcedureFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PatientMedicalProcedureHistory[] Histories;
	public Identifier[] Identifiers;
	public MedicationStatement[] MedStatement_Procedure;
	public PatientMedicalProcedureDetail[] Medical_Procedure_Detail;
	public MedicationStatementDetail[] MedicationStatementDetailRecords;
	public OpenActivity[] OpenActivities;
	public PatientMedicalProcedureDetail[] PMPDetail_DetailRecord;
	public PatientMedicalProcedure[] PMP_ReasonReference;
	public MedicationDispense[] PatientMedicalProcedure_PrimaryProcedure;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthorNote[] RecordAuthorNotes;
	public PatientMedicalProcedureShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public PatientMedicalProcedure clone$() {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicalProcedure clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicalProcedure clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicalProcedure clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PatientMedicalProcedure clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
