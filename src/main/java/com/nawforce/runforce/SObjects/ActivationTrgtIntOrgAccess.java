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
public class ActivationTrgtIntOrgAccess extends SObject {
	public static SObjectType$<ActivationTrgtIntOrgAccess> SObjectType;
	public static SObjectFields$<ActivationTrgtIntOrgAccess> Fields;

	public Id ActivationTargetId;
	public ActivationTarget ActivationTarget;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataChangeStatus;
	public Id Id;
	public Boolean IsDeleted;
	public Datetime LastDataChangeStatusDateTime;
	public String LastDataChangeStatusErrorCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ActivationTrgtIntOrgAccessFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ActivationTrgtIntOrgAccessHistory[] Histories;
	public ActivationTrgtIntOrgAccessShare[] Shares;

	public ActivationTrgtIntOrgAccess clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActivationTrgtIntOrgAccess clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActivationTrgtIntOrgAccess clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActivationTrgtIntOrgAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActivationTrgtIntOrgAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
