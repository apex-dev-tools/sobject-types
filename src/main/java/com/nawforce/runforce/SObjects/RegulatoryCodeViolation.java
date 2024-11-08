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
public class RegulatoryCodeViolation extends SObject {
	public static SObjectType$<RegulatoryCodeViolation> SObjectType;
	public static SObjectFields$<RegulatoryCodeViolation> Fields;

	public Datetime ComplianceDueDate;
	public String CorrectiveActionDescription;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime DateCreated;
	public Datetime DateResolved;
	public Integer DaysOpen;
	public String Description;
	public Id Id;
	public Id InspectionAssmntIndId;
	public InspectionAssessmentInd InspectionAssmntInd;
	public Id InspectionId;
	public Visit Inspection;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String Priority;
	public Integer RecurrenceCount;
	public Id RegulatoryCodeId;
	public RegulatoryCode RegulatoryCode;
	public String ResolutionNotes;
	public Id ResponseContextId;
	public Name ResponseContext;
	public Id ResponseId;
	public InspectionAssessmentInd Response;
	public String Status;
	public Datetime SystemModstamp;
	public Id ViolationTypeId;
	public ViolationType ViolationType;

	public ActionPlan[] ActionPlans;
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
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public RegulatoryCodeViolationFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public RegulatoryCodeViolationHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RegulatoryCodeViolation[] RegCodeResponseContext;
	public ViolationEnforcementAction[] RegCodeViolationEnforcementAction;
	public RegulatoryTrxnFee[] RegulatoryTrxnFees;
	public RegulatoryCodeViolationShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public RegulatoryCodeViolation clone$() {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryCodeViolation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryCodeViolation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryCodeViolation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryCodeViolation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
