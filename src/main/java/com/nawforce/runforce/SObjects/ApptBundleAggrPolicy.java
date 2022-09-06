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
public class ApptBundleAggrPolicy extends SObject {
	public static SObjectType$<ApptBundleAggrPolicy> SObjectType;
	public static SObjectFields$<ApptBundleAggrPolicy> Fields;

	public String AggregationAction;
	public String AggregationFieldType;
	public Integer AggregationOrder;
	public String BundleFieldName;
	public String BundleMemberAddiFieldName;
	public String BundleMemberFieldName;
	public Id BundlePolicyId;
	public ApptBundlePolicy BundlePolicy;
	public String ConstantValue;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DateValue;
	public Boolean DoesAllowDuplicateStrings;
	public String DownscaleSortDirection;
	public Id FilterCriteriaId;
	public RecordsetFilterCriteria FilterCriteria;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer MaxBundleDuration;
	public String Name;
	public Boolean ShouldUpdateOnCreationOnly;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public ApptBundleAggrDurDnscale[] ApptBundleAggrDurDnscales;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ApptBundleAggrPolicyFeed[] Feeds;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ApptBundleAggrPolicy clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApptBundleAggrPolicy clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApptBundleAggrPolicy clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApptBundleAggrPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApptBundleAggrPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
