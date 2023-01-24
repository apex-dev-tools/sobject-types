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
public class CommSubscriptionConsent extends SObject {
	public static SObjectType$<CommSubscriptionConsent> SObjectType;
	public static SObjectFields$<CommSubscriptionConsent> Fields;

	public Id BusinessBrandId;
	public BusinessBrand BusinessBrand;
	public Id CommSubscriptionChannelTypeId;
	public CommSubscriptionChannelType CommSubscriptionChannelType;
	public Datetime ConsentCapturedDateTime;
	public String ConsentCapturedSource;
	public Id ConsentGiverId;
	public Name ConsentGiver;
	public Id ContactPointId;
	public Name ContactPoint;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataUsePurposeId;
	public DataUsePurpose DataUsePurpose;
	public Date EffectiveFromDate;
	public Date EffectiveToDate;
	public Id EngagementChannelTypeId;
	public EngagementChannelType EngagementChannelType;
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
	public Id PartyId;
	public Individual Party;
	public Id PartyRoleId;
	public Name PartyRole;
	public String PrivacyConsentStatus;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public CommSubscriptionTiming[] CommSubscriptionTimings;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CommSubscriptionConsentFeed[] Feeds;
	public CommSubscriptionConsentHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CommSubscriptionConsentShare[] Shares;
	public Task[] Tasks;

	public CommSubscriptionConsent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionConsent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionConsent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionConsent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CommSubscriptionConsent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
