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
public class Program extends SObject {
	public static SObjectType$<Program> SObjectType;
	public static SObjectFields$<Program> Fields;

	public Id ActionPlanTemplateId;
	public ActionPlanTemplate ActionPlanTemplate;
	public Decimal ActiveEnrolleeCount;
	public String AdditionalContext;
	public Integer ApplicationAppealLimit;
	public String BusinessSector;
	public String City;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal CurrentMonthDisbCount;
	public Decimal CurrentYearDisbCount;
	public String DefaultImageComment;
	public String DefaultImageUrl;
	public String EffectiveYear;
	public Date EndDate;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsRegulatoryProgram;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ParentProgramId;
	public Program ParentProgram;
	public Decimal PreviousMonthDisbCount;
	public Decimal PreviousYearDisbCount;
	public String ProgramDeliveryType;
	public Id ProgramManagerId;
	public User ProgramManager;
	public String ProgramType;
	public String RegulatoryProgramName;
	public String ShortForm;
	public String Stakeholder;
	public Date StartDate;
	public String Status;
	public String Summary;
	public Datetime SystemModstamp;
	public Decimal TotalEnrolleeCount;
	public String UsageType;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApplicationFormRelation[] ApplicationFormRelations;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CareProgramAssistance[] CPAProgram;
	public Program[] ChildPrograms;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProgramFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProgramHistory[] Histories;
	public IndicatorAssignment[] IndicatorAssignments;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public OutcomeActivity[] OutcomeActivities;
	public ProgramEnrlEligibilityCrit[] PEEC_Program;
	public ProgramInitiative[] PIPrograms;
	public ProgramRecommendationRule[] PRRProgram;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProgramEnrollment[] ProgramEnrollments;
	public PreliminaryApplicationRef[] Program_PreliminaryApplicationRefs;
	public Benefit[] Programs;
	public ApplicationForm[] ReferenceApplicationForms;
	public ProgramShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public Program clone$() {throw new java.lang.UnsupportedOperationException();}
	public Program clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Program clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Program clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Program clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
