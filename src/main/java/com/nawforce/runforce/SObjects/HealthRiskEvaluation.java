/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class HealthRiskEvaluation extends SObject {
	public static SObjectType$<HealthRiskEvaluation> SObjectType;
	public static SObjectFields$<HealthRiskEvaluation> Fields;

	public Id ClinicalEncounterId;
	public ClinicalEncounter ClinicalEncounter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndDateTime;
	public Id EvaluatorId;
	public Name Evaluator;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MethodCodeId;
	public Name MethodCode;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PrimaryHealthConditionId;
	public HealthCondition PrimaryHealthCondition;
	public String RiskMitigationInfo;
	public Datetime StartDateTime;
	public String Status;
	public Id SubjectId;
	public Account Subject;
	public Datetime SystemModstamp;
	public Id TypeCodeId;
	public Name TypeCode;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public HealthRiskEvaluationFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public HealthRiskEvalDetail[] HRED_HealthRiskEvaluation;
	public HealthRiskEvalOutcome[] HREO_HealthRiskEvaluation;
	public HealthRiskEvaluationHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public HealthRiskEvaluationShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public HealthRiskEvaluation clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthRiskEvaluation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthRiskEvaluation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthRiskEvaluation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthRiskEvaluation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
