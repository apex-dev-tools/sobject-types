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
public class CareProgram extends SObject {
	public static SObjectType$<CareProgram> SObjectType;
	public static SObjectFields$<CareProgram> Fields;

	public Decimal BudgetAmount;
	public String Category;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer CurrentEnrolleeCount;
	public String Description;
	public Date EndDate;
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
	public Id ParentProgramId;
	public CareProgram ParentProgram;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Id SponsorId;
	public Account Sponsor;
	public Date StartDate;
	public String Status;
	public Datetime SystemModstamp;
	public Integer TargetEnrolleeCount;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CareProgramEligibilityRule[] CProgram_Eligibility_Rules;
	public CareProgramCampaign[] CareProgramCampaigns;
	public CareProgramDetail[] CareProgramDetails;
	public CareProgramEnrollee[] CareProgramEnrollees;
	public CareProgramGoal[] CareProgramGoals;
	public CareProgramProduct[] CareProgramProducts;
	public CareProgramTeamMember[] CareProgramTeamMembers;
	public CareBenefitVerifyRequest[] Care_Benefit_Verify_Requests_CareProgram;
	public CareProgram[] Care_Programs;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DataUsePurpose[] DataUsePurposes;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CareProgramFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CareProgramHistory[] Histories;
	public Identifier[] Identifiers;
	public ManagedCareProgramPrfm[] ManagedCareProgramPrfm_CareProgram;
	public MedicationTherapyReview[] MedTherapyReview_CarePrograms;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CareProgramShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CareProgram clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareProgram clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareProgram clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareProgram clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareProgram clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
