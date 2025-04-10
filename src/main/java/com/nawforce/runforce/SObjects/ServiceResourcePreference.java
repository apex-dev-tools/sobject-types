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
public class ServiceResourcePreference extends SObject {
	public static SObjectType$<ServiceResourcePreference> SObjectType;
	public static SObjectFields$<ServiceResourcePreference> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id OwnerId;
	public Name Owner;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public Date StartDate;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ServiceResourcePreferenceFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ServiceResourcePreferenceHistory[] Histories;
	public NetworkActivityAudit[] ParentEntities;
	public ServiceResourcePreferenceShare[] Shares;

	public ServiceResourcePreference clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceResourcePreference clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResourcePreference clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResourcePreference clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResourcePreference clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
