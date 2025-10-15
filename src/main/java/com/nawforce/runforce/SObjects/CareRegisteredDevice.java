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
public class CareRegisteredDevice extends SObject {
	public static SObjectType$<CareRegisteredDevice> SObjectType;
	public static SObjectFields$<CareRegisteredDevice> Fields;

	public Id CareProgramEnrolleeId;
	public CareProgramEnrollee CareProgramEnrollee;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DeviceId;
	public Asset Device;
	public Id DeviceTypeId;
	public CodeSet DeviceType;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String NameType;
	public Id PatientId;
	public Account Patient;
	public Datetime RegistrationDate;
	public String SafetyInformation;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;
	public String SupportContactDetail;
	public Datetime SystemModstamp;
	public String UniqueDeviceId1;
	public String UniqueDeviceId1Issuer;
	public String UniqueDeviceId2;
	public String UniqueDeviceId2Issuer;
	public String UniqueDeviceId3;
	public String UniqueDeviceId3Issuer;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CarePerformer[] CarePerformerParents;
	public CareTaskDetail[] CareTaskDetailDetailRecord;
	public CareTask[] CareTaskOwnedBy;
	public CareTask[] CareTaskRequestedBy;
	public ClinicalServiceRequestDetail[] ClinSvcReqDetail_Detail;
	public ClinicalAlert[] ClinicalAlert_RaisedBy;
	public ClinicalDetectedIssue[] ClinicalDetectedIssue_Identifiers;
	public ClinicalServiceRequest[] ClinicalServRequestPerformer;
	public ClinicalServiceRequest[] ClinicalServRequestRequester;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DataUsePurpose[] DataUsePurposes;
	public DiagnosticSummaryDetail[] DiagSummaryDetailDomain;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CareRegisteredDeviceFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthRiskEvaluation[] HRE_Evaluator;
	public CareRegisteredDeviceHistory[] Histories;
	public Identifier[] Identifiers;
	public MedicationRequest[] MedRequestsPerformer;
	public MedicationRequest[] MedRequestsRequester;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public PatientMedicalProcedureDetail[] PMPDetail_DetailRecord;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthorNote[] RecordAuthorNotes;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CareRegisteredDevice clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareRegisteredDevice clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareRegisteredDevice clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareRegisteredDevice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareRegisteredDevice clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
