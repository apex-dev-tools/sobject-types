/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PrivacyRTBFRequest extends SObject {
	public static SObjectType$<PrivacyRTBFRequest> SObjectType;
	public static SObjectFields$<PrivacyRTBFRequest> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public String JobRecord;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PolicyNameId;
	public PrivacyPolicyDefinition PolicyName;
	public String Status;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PrivacyRTBFRequestFeed[] Feeds;
	public PrivacyRTBFRequestHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public PrivacyJobSession[] PrivacyRtbfRequestJobSessions;
	public PrivacyRTBFRequestShare[] Shares;
	public Task[] Tasks;

	public PrivacyRTBFRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public PrivacyRTBFRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyRTBFRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyRTBFRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyRTBFRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
