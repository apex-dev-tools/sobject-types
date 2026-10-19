/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class BenefitAssignment extends SObject {
	public static SObjectType$<BenefitAssignment> SObjectType;
	public static SObjectFields$<BenefitAssignment> Fields;

	public String ApprovalStatus;
	public String BenefitAssignmentKeywords;
	public String BenefitAssignmentSummary;
	public Id BenefitId;
	public Benefit Benefit;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndDateTime;
	public Decimal EntitlementAmount;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal MaximumBenefitAmount;
	public Decimal MinimumBenefitAmount;
	public String Name;
	public Date NextPayoutDate;
	public Id OwnerId;
	public Name Owner;
	public String PayoutFrequency;
	public Id ProgramEnrollmentId;
	public ProgramEnrollment ProgramEnrollment;
	public Integer Quantity;
	public Date RecertificationDueDate;
	public Decimal RemainingAmount;
	public Datetime StartDateTime;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal TotalApprovedAmount;
	public Decimal TotalPaidAmount;
	public Id UnitOfMeasureId;
	public UnitOfMeasure UnitOfMeasure;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApplicationFormRelation[] ApplicationFormRelations;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public BenefitAssignmentAsset[] BAABenefitAssignment;
	public BenefitDisbursement[] BenefitDisbursementBenefitAssignments;
	public BenefitScheduleAssignment[] BenefitScheduleAssignmentBenefitAssignment;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public BenefitAssignmentFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public BenefitAssignmentHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public BenefitAssignmentShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public BenefitAssignment clone$() {throw new java.lang.UnsupportedOperationException();}
	public BenefitAssignment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BenefitAssignment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BenefitAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BenefitAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
