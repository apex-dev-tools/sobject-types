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
public class ProgramEnrollment extends SObject {
	public static SObjectType$<ProgramEnrollment> SObjectType;
	public static SObjectFields$<ProgramEnrollment> Fields;

	public Id AccountId;
	public Account Account;
	public Date ApplicationDate;
	public Id CareProgramEnrolleeId;
	public CareProgramEnrollee CareProgramEnrollee;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal CurrentMonthDisbCount;
	public Decimal CurrentYearDisbCount;
	public Date EligibilityLastVerifiedDate;
	public Date EndDate;
	public String EnrolleeRole;
	public Id Id;
	public Id IndividualApplicationId;
	public IndividualApplication IndividualApplication;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Decimal PreviousMonthDisbCount;
	public Decimal PreviousYearDisbCount;
	public Id ProgramId;
	public Program Program;
	public Id Scope3EmssnSrcId;
	public Scope3EmssnSrc Scope3EmssnSrc;
	public Integer SessionsAbsentCount;
	public Decimal SessionsAttendanceRate;
	public Integer SessionsAttendedCount;
	public Date StartDate;
	public String Status;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public Id SupplierId;
	public Supplier Supplier;
	public Datetime SystemModstamp;
	public Id VehicleAssetEmssnSrcId;
	public VehicleAssetEmssnSrc VehicleAssetEmssnSrc;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApplicationFormRelation[] ApplicationFormRelations;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public BenefitAssignment[] BenefitAssignmentPE;
	public BenefitDisbursement[] BenefitDisbursementPE;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProgramEnrollmentFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProgramEnrollmentHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public IndicatorAssignment[] ProgramEnrollmentIndicatorAssignment;
	public ProgramEnrollmentShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ProgramEnrollment clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProgramEnrollment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProgramEnrollment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProgramEnrollment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProgramEnrollment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
