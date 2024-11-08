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
public class AssessmentTask extends SObject {
	public static SObjectType$<AssessmentTask> SObjectType;
	public static SObjectFields$<AssessmentTask> Fields;

	public Id AssessmentTaskDefinitionId;
	public AssessmentTaskDefinition AssessmentTaskDefinition;
	public Id AssignedToId;
	public Name AssignedTo;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime EndTime;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ParentId;
	public Visit Parent;
	public Integer SequenceNumber;
	public Datetime StartTime;
	public String Status;
	public Datetime SystemModstamp;
	public Id TaskDefinitionId;
	public SObject TaskDefinition;
	public String TaskType;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AssessmentTaskContentDocument[] AssessmentTaskContentDocuments;
	public AssessmentTaskOrder[] AssessmentTaskOrders;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public OtherComponentTask[] ComponentTasks;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AssessmentTaskFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public AssessmentTaskHistory[] Histories;
	public InspectionAssessmentInd[] InspectionAssessmentIndicators;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AssessmentTaskShare[] Shares;
	public SignatureTask[] SignatureTaskAssessmentTasks;
	public SignatureTaskLineItem[] SignatureTaskLineItemParentValue;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public AssessmentTask clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssessmentTask clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssessmentTask clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssessmentTask clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssessmentTask clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
