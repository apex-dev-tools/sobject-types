/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ApptBundleConfig extends SObject {
	public static SObjectType$<ApptBundleConfig> SObjectType;
	public static SObjectFields$<ApptBundleConfig> Fields;

	public String AddToBundleStatuses;
	public String BundleStatusesToPropagate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id CriteriaForAutoUnbundlingId;
	public RecordsetFilterCriteria CriteriaForAutoUnbundling;
	public String CurrencyIsoCode;
	public Boolean DoesAddTravelTime;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MemberStatusesNotToPropagate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String RemoveFromBundleStatuses;
	public String StatusOnRemovalFromBundle;
	public String StatusesNotToUpdateOnUnbundle;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ApptBundleConfigFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ApptBundleConfigHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ApptBundleConfigShare[] Shares;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ApptBundleConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApptBundleConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApptBundleConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApptBundleConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApptBundleConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
