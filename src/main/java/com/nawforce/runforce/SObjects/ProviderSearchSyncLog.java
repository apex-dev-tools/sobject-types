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
public class ProviderSearchSyncLog extends SObject {
	public static SObjectType$<ProviderSearchSyncLog> SObjectType;
	public static SObjectFields$<ProviderSearchSyncLog> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FacilityId;
	public Account Facility;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastSync;
	public Datetime LastViewedDate;
	public String Message;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ProviderId;
	public HealthcareProvider Provider;
	public String ProviderName;
	public String SyncStatus;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProviderSearchSyncLogFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProviderSearchSyncLogHistory[] Histories;
	public ProviderSearchSyncLogShare[] Shares;

	public ProviderSearchSyncLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProviderSearchSyncLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProviderSearchSyncLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProviderSearchSyncLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProviderSearchSyncLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
