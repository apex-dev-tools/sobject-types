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
public class DiagnosticSummary extends SObject {
	public static SObjectType$<DiagnosticSummary> SObjectType;
	public static SObjectFields$<DiagnosticSummary> Fields;

	public String AttachmentLanguage;
	public Id AuthenticatorId;
	public Name Authenticator;
	public Id BasedOnId;
	public Name BasedOn;
	public Id CareObservationId;
	public CareObservation CareObservation;
	public String Category;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CodeId;
	public CodeSetBundle Code;
	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id CustodianId;
	public Account Custodian;
	public String Division;
	public Id DocumentFormatCodeId;
	public CodeSet DocumentFormatCode;
	public Id DocumentSecurityCodeId;
	public CodeSetBundle DocumentSecurityCode;
	public String DocumentStage;
	public Id DocumentTypeCodeId;
	public CodeSetBundle DocumentTypeCode;
	public Datetime EffectiveEndDateTime;
	public Datetime EffectiveStartDateTime;
	public Id Id;
	public String ImageComments1;
	public String ImageComments2;
	public String ImageComments3;
	public String ImageComments4;
	public String ImageComments5;
	public String ImageUrl1;
	public String ImageUrl2;
	public String ImageUrl3;
	public String ImageUrl4;
	public String ImageUrl5;
	public Id InterpretedById;
	public CarePerformer InterpretedBy;
	public Boolean IsDeleted;
	public Id IssuedById;
	public CarePerformer IssuedBy;
	public Datetime IssuedDateTime;
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
	public Id ReportAttachmentId;
	public Attachment ReportAttachment;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;
	public String Summary;
	public Id SummaryCodeId;
	public CodeSetBundle SummaryCode;
	public Datetime SystemModstamp;
	public String UsageType;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public ClinicalDetectedIssueDetail[] CDetectedIssueDetailRecords;
	public CareObservation[] CareObs_DerivationSource;
	public ClinicalServiceRequestDetail[] ClinSvcReqDetail_Detail;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DiagnosticSummaryDetail[] DiagSummaryDetailDomain;
	public DiagnosticSummaryDetail[] Diagnostic_Summary_Details;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public DiagnosticSummaryFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public DiagnosticSummaryHistory[] Histories;
	public Identifier[] Identifiers;
	public MedicationStatementDetail[] MedicationStatementDetailRecords;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public PatientImmunization[] PI_DiagnosticSummary;
	public PatientMedicalProcedure[] PMP_ReasonReference;
	public PatientMedicalProcedure[] PMP_Report;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DiagnosticSummaryShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public DiagnosticSummary clone$() {throw new java.lang.UnsupportedOperationException();}
	public DiagnosticSummary clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DiagnosticSummary clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DiagnosticSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DiagnosticSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
