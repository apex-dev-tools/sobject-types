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
public class MedicationRequest extends SObject {
	public static SObjectType$<MedicationRequest> SObjectType;
	public static SObjectFields$<MedicationRequest> Fields;

	public Id AllowedSubstitutionTypeCodeId;
	public CodeSetBundle AllowedSubstitutionTypeCode;
	public Boolean CanSubstitute;
	public Id CaseId;
	public Case Case;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id ClinicalServiceRequestId;
	public ClinicalServiceRequest ClinicalServiceRequest;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal DispenseInterval;
	public Id DispenseIntervalUnitId;
	public UnitOfMeasure DispenseIntervalUnit;
	public Id DispenserId;
	public Account Dispenser;
	public String Division;
	public Id FillDurationUnitId;
	public UnitOfMeasure FillDurationUnit;
	public Id FillQuantityUnitId;
	public UnitOfMeasure FillQuantityUnit;
	public Id Id;
	public Decimal InitialFillDuration;
	public Decimal InitialFillQuantity;
	public Boolean IsDeleted;
	public Boolean IsIgnored;
	public Boolean IsSecondaryInformation;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MedicationAdministrationContextId;
	public CodeSetBundle MedicationAdministrationContext;
	public Id MedicationCodeId;
	public CodeSetBundle MedicationCode;
	public Id MedicationId;
	public Medication Medication;
	public Id MedicationRequestGroupId;
	public Identifier MedicationRequestGroup;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PatientId;
	public Account Patient;
	public Id PerformerId;
	public Name Performer;
	public Id PerformerTypeId;
	public CodeSetBundle PerformerType;
	public Datetime PrescribedDate;
	public Datetime PrescriptionPeriodEnd;
	public Datetime PrescriptionPeriodStart;
	public Id PreviousPrescriptionId;
	public MedicationRequest PreviousPrescription;
	public String Priority;
	public Id ReasonCodeId;
	public CodeSetBundle ReasonCode;
	public Id ReasonReferenceId;
	public Name ReasonReference;
	public Decimal RefillDuration;
	public Decimal RefillQuantity;
	public Integer RefillsAllowed;
	public Id RelatedRequestId;
	public MedicationRequest RelatedRequest;
	public Id RequesterId;
	public Name Requester;
	public Id SecondarySourceId;
	public Name SecondarySource;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public Id StatusReasonCodeId;
	public CodeSetBundle StatusReasonCode;
	public Id SubstitutionReasonCodeId;
	public CodeSetBundle SubstitutionReasonCode;
	public Datetime SystemModstamp;
	public String TherapyDuration;
	public String Type;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CareObservation[] CareObservation_BasedOn;
	public CareRequestDrug[] CareRequestDrugs;
	public CareTaskDetail[] CareTaskDetailDetailRecord;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests_AuthorizedPrescription;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests_OriginalPrescription;
	public ClinicalServiceRequestDetail[] ClinSvcReqDetail_Detail;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MedicationRequestFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public MedicationRequestHistory[] Histories;
	public Identifier[] Identifiers;
	public MedicationAdministration[] MA_MedicationRequest;
	public MedicationAdministrationDtl[] MedAdminDtl_DetailRecord;
	public MedicationRequest[] MedReq_PrevPrescription;
	public MedicationRequest[] MedReq_RelatedReq;
	public MedicationStatement[] MedStatement_MedReq;
	public MedicationDispense[] MedicationDispense_Requests;
	public MedicationStatementDetail[] MedicationStatementDetailRecords;
	public OpenActivity[] OpenActivities;
	public PatientMedicationDosage[] PMDParents;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthorNote[] RecordAuthorNotes;
	public MedicationRequestShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public MedicationRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedicationRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedicationRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedicationRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedicationRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
