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
public class MedicationStatement extends SObject {
	public static SObjectType$<MedicationStatement> SObjectType;
	public static SObjectFields$<MedicationStatement> Fields;

	public Datetime AssertionDateTime;
	public Id CareObservationId;
	public CareObservation CareObservation;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DeliverySetting;
	public String Division;
	public Datetime EndDateTime;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MedicationCodeId;
	public CodeSetBundle MedicationCode;
	public Id MedicationId;
	public Medication Medication;
	public Id MedicationReasonCodeId;
	public CodeSetBundle MedicationReasonCode;
	public Id MedicationReasonId;
	public Name MedicationReason;
	public Id MedicationRequestId;
	public MedicationRequest MedicationRequest;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ParentMedicationStatementId;
	public MedicationStatement ParentMedicationStatement;
	public Id PatientId;
	public Account Patient;
	public Id ProcedureId;
	public PatientMedicalProcedure Procedure;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Datetime StartDateTime;
	public Id StatementSourceId;
	public Name StatementSource;
	public String Status;
	public Id StatusReasonCodeId;
	public CodeSetBundle StatusReasonCode;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CareObservation[] CareObservation_PartOf;
	public CareRequestDrug[] CareRequestDrugs;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DiagnosticSummary[] DiagnosticSummary_BasedOn;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MedicationStatementFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public MedicationStatementHistory[] Histories;
	public Identifier[] Identifiers;
	public MedReconStmtRecommendation[] MRSRecommendation_Statements;
	public MedicationStatement[] MedStat_ParentMedStatement;
	public MedicationStatementDetail[] MedicationStatementDetailRecords;
	public MedicationStatementDetail[] MedicationStatementDetails;
	public MedicationTherapyStmtReview[] MedicationTherapyStatementReviews;
	public OpenActivity[] OpenActivities;
	public PatientMedicationDosage[] PMDParents;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthorNote[] RecordAuthorNotes;
	public MedicationStatementShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public MedicationStatement clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedicationStatement clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedicationStatement clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedicationStatement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedicationStatement clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
