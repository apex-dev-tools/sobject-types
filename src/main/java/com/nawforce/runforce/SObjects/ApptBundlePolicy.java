/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ApptBundlePolicy extends SObject {
	public static SObjectType$<ApptBundlePolicy> SObjectType;
	public static SObjectFields$<ApptBundlePolicy> Fields;

	public String BundleEndTimeFieldName;
	public String BundleStartTimeFieldName;
	public Boolean CanAllowSchleDepndInBundle;
	public Integer ConstantTimeValue;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FilterCriteriaId;
	public RecordsetFilterCriteria FilterCriteria;
	public Id Id;
	public Boolean IsAutomaticBundling;
	public Boolean IsDeleted;
	public Boolean IsManualBundling;
	public Boolean IsTimeCalcByBundleDurationFld;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer LimitAmountOfBundleMembers;
	public Integer LimitDurationOfBundle;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Integer Priority;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public ApptBundleAggrPolicy[] ApptBundleAggrPolicies;
	public ApptBundlePolicySvcTerr[] ApptBundlePolicySvcTerrs;
	public ApptBundlePropagatePolicy[] ApptBundlePropagatePolicies;
	public ApptBundleRestrictPolicy[] ApptBundleRestrictPolicies;
	public ApptBundleSortPolicy[] ApptBundleSortPolicies;
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
	public ApptBundlePolicyFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ApptBundlePolicyShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ApptBundlePolicy clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApptBundlePolicy clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApptBundlePolicy clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApptBundlePolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApptBundlePolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
