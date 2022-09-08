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
public class PartnerFundClaim extends SObject {
	public static SObjectType$<PartnerFundClaim> SObjectType;
	public static SObjectFields$<PartnerFundClaim> Fields;

	public Id AllocationId;
	public PartnerFundAllocation Allocation;
	public Decimal Amount;
	public Id BudgetId;
	public PartnerMarketingBudget Budget;
	public Id ChannelPartnerId;
	public Account ChannelPartner;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public Id RequestId;
	public PartnerFundRequest Request;
	public String Status;
	public Datetime SystemModstamp;
	public String Title;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PartnerFundClaimFeed[] Feeds;
	public PartnerFundClaimHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PartnerFundClaimShare[] Shares;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public PartnerFundClaim clone$() {throw new java.lang.UnsupportedOperationException();}
	public PartnerFundClaim clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PartnerFundClaim clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PartnerFundClaim clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PartnerFundClaim clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
