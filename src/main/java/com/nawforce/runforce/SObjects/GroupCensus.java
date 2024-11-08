/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class GroupCensus extends SObject {
	public static SObjectType$<GroupCensus> SObjectType;
	public static SObjectFields$<GroupCensus> Fields;

	public Id AccountId;
	public Account Account;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EffectiveEndDate;
	public Datetime EffectiveStartDate;
	public String ExternalIdentifier;
	public Integer FullTimeMemberCount;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LeadId;
	public Lead Lead;
	public Integer MbrWithMoreThan1ChldCount;
	public Integer MbrWithMoreThan2ChldCount;
	public Integer MbrWithoutDependentCount;
	public Integer MemberOptOutCount;
	public Integer MemberWithDependentCount;
	public Integer MemberWithOneChildCount;
	public Integer MemberWithSpouseCount;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Integer PartTimeMemberCount;
	public String SourceSystemName;
	public String SourceSystemType;
	public String Status;
	public Datetime SystemModstamp;
	public Integer TotalDependents;
	public Integer TotalMemberPlusDependent;
	public Integer TotalMembers;
	public String Type;
	public String UsageType;

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
	public GroupCensusFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GroupCensusMember[] GroupCensusMembers;
	public GroupCensusHistory[] Histories;
	public InsuranceContract[] InsuranceContracts;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public GroupCensusShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public GroupCensus clone$() {throw new java.lang.UnsupportedOperationException();}
	public GroupCensus clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensus clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensus clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensus clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
