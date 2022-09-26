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
public class PartnerMarketingBudget extends SObject {
	public static SObjectType$<PartnerMarketingBudget> SObjectType;
	public static SObjectFields$<PartnerMarketingBudget> Fields;

	public Decimal Amount;
	public Id ChannelPartnerId;
	public Account ChannelPartner;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsIgnoreValidation;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public Date StartDate;
	public Datetime SystemModstamp;
	public String Title;
	public Decimal TotalAllocatedAmount;
	public Decimal TotalApprovedFcs;
	public Decimal TotalApprovedFrs;
	public Decimal TotalReimbursedFcs;
	public String Type;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PartnerMarketingBudgetFeed[] Feeds;
	public PartnerMarketingBudgetHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public PartnerFundAllocation[] PartnerFundAllocations;
	public PartnerFundClaim[] PartnerFundClaims;
	public PartnerFundRequest[] PartnerFundRequests;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PartnerMarketingBudgetShare[] Shares;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public PartnerMarketingBudget clone$() {throw new java.lang.UnsupportedOperationException();}
	public PartnerMarketingBudget clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PartnerMarketingBudget clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PartnerMarketingBudget clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PartnerMarketingBudget clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
