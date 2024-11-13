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
public class MedicationDispense extends SObject {
	public static SObjectType$<MedicationDispense> SObjectType;
	public static SObjectFields$<MedicationDispense> Fields;

	public Id CollectedById;
	public Name CollectedBy;
	public Id ContextId;
	public ClinicalEncounter Context;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DeliveryLocationId;
	public Name DeliveryLocation;
	public Id DispenseTypeCodeId;
	public Name DispenseTypeCode;
	public Datetime DispensedDateTime;
	public String Division;
	public Id HealthcareFacilityId;
	public HealthcareFacility HealthcareFacility;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsSubstituted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MedAdministrationSettingCategory;
	public Id MedicationCodeId;
	public Name MedicationCode;
	public Id MedicationId;
	public Medication Medication;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PatientId;
	public Account Patient;
	public Datetime PreparedDateTime;
	public Id PrimaryDetectedIssueId;
	public ClinicalDetectedIssue PrimaryDetectedIssue;
	public Id PrimaryMedicationRequestId;
	public MedicationRequest PrimaryMedicationRequest;
	public Id PrimaryProcedureId;
	public PatientMedicalProcedure PrimaryProcedure;
	public Decimal Quantity;
	public Id QuantityUnitId;
	public UnitOfMeasure QuantityUnit;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModifiedDateTime;
	public String Status;
	public Id StatusReasonCodeId;
	public Name StatusReasonCode;
	public Id StatusReasonRelatedIssueId;
	public ClinicalDetectedIssue StatusReasonRelatedIssue;
	public Id SubstitutedById;
	public Name SubstitutedBy;
	public String SubstitutionReason;
	public String SubstitutionType;
	public Decimal SupplyDaysCount;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CarePerformer[] CarePerformerParents;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MedicationDispenseFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public MedicationDispenseHistory[] Histories;
	public Identifier[] Identifiers;
	public MedicationStatementDetail[] MedicationStatementDetailRecords;
	public OpenActivity[] OpenActivities;
	public PatientMedicationDosage[] PMDParents;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthorNote[] RecordAuthorNotes;
	public MedicationDispenseShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public MedicationDispense clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedicationDispense clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedicationDispense clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedicationDispense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedicationDispense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
