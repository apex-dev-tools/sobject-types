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
public class CareObservation extends SObject {
	public static SObjectType$<CareObservation> SObjectType;
	public static SObjectFields$<CareObservation> Fields;

	public Id AdditionalCode1Id;
	public CodeSet AdditionalCode1;
	public Id AdditionalCode2Id;
	public CodeSet AdditionalCode2;
	public Id BasedOnId;
	public Name BasedOn;
	public Id BaselineUnitId;
	public UnitOfMeasure BaselineUnit;
	public String BaselineValueText;
	public Id BodySiteId;
	public CodeSetBundle BodySite;
	public String Category;
	public Id CodeId;
	public CodeSet Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DerivationSourceId;
	public Name DerivationSource;
	public Id DeviceId;
	public Asset Device;
	public String Division;
	public Datetime EffectiveDateTime;
	public Id EncounterId;
	public ClinicalEncounter Encounter;
	public Datetime EndDateTime;
	public Id ExpectedValueId;
	public CareMetricTarget ExpectedValue;
	public Boolean HasMetExpectedValue;
	public Id Id;
	public Id IdentifierId;
	public Identifier Identifier;
	public Boolean IsDeleted;
	public Boolean IsMonitoredRemotely;
	public Boolean IsObserved;
	public Boolean IsOutcomePositive;
	public Datetime IssuedDateTime;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal LowerBaselineValue;
	public Id MethodId;
	public CodeSetBundle Method;
	public String Name;
	public Decimal NumericValue;
	public Datetime ObservationEndTime;
	public Datetime ObservationStartTime;
	public String ObservationStatus;
	public Id ObservedSubjectId;
	public Account ObservedSubject;
	public Id ObservedValueCodeId;
	public CodeSetBundle ObservedValueCode;
	public Decimal ObservedValueDenominator;
	public Decimal ObservedValueNumerator;
	public String ObservedValueText;
	public String ObservedValueType;
	public Id ObservedValueUnitId;
	public UnitOfMeasure ObservedValueUnit;
	public Id ObserverId;
	public Name Observer;
	public Id OwnerId;
	public Name Owner;
	public Id PartOfId;
	public Name PartOf;
	public Id PatientSpecimenId;
	public CodeSetBundle PatientSpecimen;
	public String ProcessingResult;
	public Id RelatedObservationId;
	public CareObservation RelatedObservation;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Datetime SystemModstamp;
	public Id UnitOfMeasureId;
	public UnitOfMeasure UnitOfMeasure;
	public Decimal UpperBaselineValue;
	public String ValueInterpretation;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CareObservation[] CareObs_DerivationSource;
	public CareObservation[] CareObservation_RelatedObservation;
	public CarePerformer[] CarePerformerParents;
	public ClinicalEncounterReason[] ClinEncReason_ReasonRef;
	public ClinicalServiceRequestDetail[] ClinSvcReqDetail_Detail;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DiagnosticSummaryDetail[] DiagSummaryDetailDomain;
	public DiagnosticSummary[] DiagnosticSummary_CareObservation;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CareObservationFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CareObservationHistory[] Histories;
	public Identifier[] Identifiers;
	public MedicationRequest[] MedReq_ReasonReference;
	public MedicationStatement[] MedStatement_MedicationReason;
	public MedicationStatementDetail[] MedicationStatementDetailRecords;
	public MedicationStatement[] MedicationStatement_CareObservation;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public ClinicalServiceRequest[] Observations;
	public OpenActivity[] OpenActivities;
	public PatientMedicalProcedureDetail[] PMPDetail_DetailRecord;
	public PatientMedicalProcedure[] PMP_ReasonReference;
	public CareObservationComponent[] ParentCareObservations;
	public PatientHealthReaction[] PatientHealthReactionObservations;
	public PatientImmunization[] Patient_Immunization_Care_Observations;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthorNote[] RecordAuthorNotes;
	public CareObservationShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CareObservation clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareObservation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareObservation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareObservation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareObservation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
