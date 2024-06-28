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
public class ClinicalServiceRequest extends SObject {
	public static SObjectType$<ClinicalServiceRequest> SObjectType;
	public static SObjectFields$<ClinicalServiceRequest> Fields;

	public Id BodySiteId;
	public CodeSetBundle BodySite;
	public Id CategoryId;
	public CodeSetBundle Category;
	public Id ConditionId;
	public HealthCondition Condition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime DateSigned;
	public Id DiagnosticReportId;
	public ClinicalEncounterDiagnosis DiagnosticReport;
	public String Division;
	public Id EncounterId;
	public ClinicalEncounter Encounter;
	public Datetime EndDate;
	public Id FacilityCodeId;
	public CodeSetBundle FacilityCode;
	public Id FacilityId;
	public HealthcareFacility Facility;
	public Boolean HasPrerequisites;
	public Id Id;
	public Boolean IsAccepted;
	public Boolean IsDeleted;
	public Boolean IsIgnored;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id ObservationId;
	public CareObservation Observation;
	public Id OriginalRequestId;
	public ClinicalServiceRequest OriginalRequest;
	public Id OwnerId;
	public Name Owner;
	public Id PatientId;
	public Account Patient;
	public String PatientInstruction;
	public Id PerformerId;
	public Name Performer;
	public Id PerformerTypeId;
	public CodeSetBundle PerformerType;
	public Id PrerequisiteCodeId;
	public CodeSetBundle PrerequisiteCode;
	public String Priority;
	public Decimal QuantityDenominator;
	public Decimal QuantityNumerator;
	public Id QuantityNumeratorUnitId;
	public UnitOfMeasure QuantityNumeratorUnit;
	public String QuantityType;
	public Id ReasonCodeId;
	public CodeSetBundle ReasonCode;
	public Id RequestCodeId;
	public CodeSetBundle RequestCode;
	public Id RequesterId;
	public Name Requester;
	public Id ServiceRequestGroupIdentifierId;
	public Identifier ServiceRequestGroupIdentifier;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Datetime StartDate;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CareObservation[] CareObservation_BasedOn;
	public CareTaskDetail[] CareTaskDetailDetailRecord;
	public ClinicalServiceRequestDetail[] ClinSvcReqDetail_Detail;
	public ClinicalServiceRequest[] ClinSvcReq_OriginalReq;
	public CareProgramEnrollee[] ClinicalServiceRequestCareProgramEnrollee;
	public CareRequestItem[] ClinicalServiceRequestCareRequestItems;
	public ClinicalEncounterSvcRequest[] ClinicalServiceRequests_Fk;
	public ClinicalServiceRequestDetail[] Clinical_Service_Request_Details;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DiagnosticSummary[] DiagnosticSummary_BasedOn;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ClinicalServiceRequestFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ClinicalServiceRequestHistory[] Histories;
	public Identifier[] Identifiers;
	public MedicationRequest[] MedReq_ClinSvcReq;
	public MedicationStatementDetail[] MedicationStatementDetailRecords;
	public OpenActivity[] OpenActivities;
	public PatientMedicalProcedureDetail[] PMPDetail_DetailRecord;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public AuthorNote[] RecordAuthorNotes;
	public ServiceAppointment[] ServiceAppointments;
	public ClinicalServiceRequestShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ClinicalServiceRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClinicalServiceRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalServiceRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalServiceRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClinicalServiceRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
