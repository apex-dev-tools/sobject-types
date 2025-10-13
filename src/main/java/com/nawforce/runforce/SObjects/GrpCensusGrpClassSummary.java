/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class GrpCensusGrpClassSummary extends SObject {
	public static SObjectType$<GrpCensusGrpClassSummary> SObjectType;
	public static SObjectFields$<GrpCensusGrpClassSummary> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer FullTimeMemberCount;
	public Id GroupCensusId;
	public GroupCensus GroupCensus;
	public Id GroupClassId;
	public GroupClass GroupClass;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer MbrWithMoreThan1ChldCount;
	public Integer MbrWithMoreThan2ChldCount;
	public Integer MbrWithoutDependentCount;
	public Integer MemberOptOutCount;
	public Integer MemberWithDependentCount;
	public Integer MemberWithOneChildCount;
	public Integer MemberWithSpouseCount;
	public String Name;
	public Integer PartTimeMemberCount;
	public Datetime SystemModstamp;
	public Integer TotalDependents;
	public Integer TotalMemberPlusDependent;
	public Integer TotalMembers;

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
	public GrpCensusGrpClassSummaryFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GrpCensusGrpClassSummaryHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public GrpCensusGrpClassSummary clone$() {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusGrpClassSummary clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusGrpClassSummary clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusGrpClassSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusGrpClassSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
