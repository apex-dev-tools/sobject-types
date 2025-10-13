/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class UsagePrdGrantBindingPolicy extends SObject {
	public static SObjectType$<UsagePrdGrantBindingPolicy> SObjectType;
	public static SObjectFields$<UsagePrdGrantBindingPolicy> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String GrantBindingTargetType;
	public String GrantBindingType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id Product2Id;
	public Product2 Product2;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public UsagePrdGrantBindingPolicyFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public UsagePrdGrantBindingPolicyHistory[] Histories;

	public UsagePrdGrantBindingPolicy clone$() {throw new java.lang.UnsupportedOperationException();}
	public UsagePrdGrantBindingPolicy clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UsagePrdGrantBindingPolicy clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UsagePrdGrantBindingPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UsagePrdGrantBindingPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
