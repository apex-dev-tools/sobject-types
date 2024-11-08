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
public class AssessmentIndicatorDefinition extends SObject {
	public static SObjectType$<AssessmentIndicatorDefinition> SObjectType;
	public static SObjectFields$<AssessmentIndicatorDefinition> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataType;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;

	public ActionPlanTmplItmAssessmentInd[] ActionPlanTmpItmAssessmentInds;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public ViolationTypeAssessmentInd[] AssessmentIndViolationType;
	public AssessmentIndDefinedValue[] AssessmentIndicatorDefinitionValues;
	public AssessmentTaskIndDefinition[] AssessmentTaskIndDefs;
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
	public AssessmentIndicatorDefinitionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public AssessmentIndicatorDefinitionHistory[] Histories;
	public InspectionAssessmentInd[] InspectionAssessmentIndicators;
	public GnrcVstKeyPerformanceInd[] KPIAssessmentIndicatorDefinitions;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RegulatoryCodeAssessmentInd[] RegulatoryCodeAssessmentInds;
	public AssessmentIndicatorDefinitionShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public AssessmentIndicatorDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssessmentIndicatorDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssessmentIndicatorDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssessmentIndicatorDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssessmentIndicatorDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
