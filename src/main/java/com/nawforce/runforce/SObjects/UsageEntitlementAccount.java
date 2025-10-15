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
public class UsageEntitlementAccount extends SObject {
	public static SObjectType$<UsageEntitlementAccount> SObjectType;
	public static SObjectFields$<UsageEntitlementAccount> Fields;

	public Id AccountId;
	public Account Account;
	public Integer BillDayOfMonth;
	public Datetime BillingPeriodEndDateTime;
	public Datetime BillingPeriodStartDateTime;
	public Integer BillingPeriodTerm;
	public String BillingPeriodUnit;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EffectiveEndDateTime;
	public Datetime EffectiveStartDateTime;
	public Id GrantBindingTargetId;
	public Name GrantBindingTarget;
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
	public Id PricebookEntryId;
	public PricebookEntry PricebookEntry;
	public Id ProductId;
	public Product2 Product;
	public Datetime SystemModstamp;

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
	public UsageEntitlementAccountFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public UsageEntitlementAccountHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public UsageEntitlementBucket[] Parent_Buckets;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public UsageEntitlementAccountShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public UsageRatableSummary[] UEA_RatableSummaries;
	public UsageSummary[] UEA_UsageSummaries;
	public UsageBillingPeriodItem[] UsageEntitlementAccount_UsageBillingPeriodItems;

	public UsageEntitlementAccount clone$() {throw new java.lang.UnsupportedOperationException();}
	public UsageEntitlementAccount clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UsageEntitlementAccount clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UsageEntitlementAccount clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UsageEntitlementAccount clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
