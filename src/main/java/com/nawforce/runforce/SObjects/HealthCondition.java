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
public class HealthCondition extends SObject {
	public static SObjectType$<HealthCondition> SObjectType;
	public static SObjectFields$<HealthCondition> Fields;

	public Datetime AbatementEndDateTime;
	public Datetime AbatementStartDateTime;
	public Id AssertionSourceId;
	public Name AssertionSource;
	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id ConditionCodeId;
	public CodeSetBundle ConditionCode;
	public String ConditionStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DiagnosticStatus;
	public String Division;
	public String ExtlProblemDefIdentifier;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime OnsetEndDateTime;
	public Datetime OnsetStartDateTime;
	public Id OwnerId;
	public Name Owner;
	public Id PatientId;
	public Account Patient;
	public Id ProblemDefinitionId;
	public ProblemDefinition ProblemDefinition;
	public String ProblemDescription;
	public String ProblemName;
	public Datetime RecordCreationDateTime;
	public Id RecordCreatorId;
	public Name RecordCreator;
	public String Severity;
	public Id SiteId;
	public CodeSetBundle Site;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Id StageId;
	public CodeSetBundle Stage;
	public Datetime SystemModstamp;
	public String Type;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CareDiagnosis[] CDHealthCondition;
	public ClinicalEncounterDiagnosis[] ClinEncDiagnosis;
	public ClinicalEncounterReason[] ClinEncReason_ReasonRef;
	public ClinicalServiceRequestDetail[] ClinSvcReqDetail_Detail;
	public CombinedAttachment[] CombinedAttachments;
	public ClinicalServiceRequest[] Conditions;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public HealthConditionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthConditionDetail[] HealthConditionDetails;
	public HealthConditionHistory[] Histories;
	public Identifier[] Identifiers;
	public MedicationRequest[] MedReq_ReasonReference;
	public MedicationStatement[] MedStatement_MedicationReason;
	public MedicationStatementDetail[] MedicationStatementDetailRecords;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public PatientImmunization[] PI_Health_Conditions;
	public PatientMedicalProcedureDetail[] PMPDetail_DetailRecord;
	public PatientMedicalProcedure[] PMP_ReasonReference;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AuthorNote[] RecordAuthorNotes;
	public HealthConditionShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public HealthCondition clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthCondition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthCondition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthCondition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthCondition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
