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
public class EngagementSignal extends SObject {
	public static SObjectType$<EngagementSignal> SObjectType;
	public static SObjectFields$<EngagementSignal> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String Status;
	public Datetime SystemModstamp;

	public AttachedContentDocument[] AttachedContentDocuments;
	public AttribModelStage[] AttribModelStages;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EngagementSignalMetric[] EngagementSignalMetrics;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public EngagementSignalFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public EngagementSignalHistory[] Histories;

	public EngagementSignal clone$() {throw new java.lang.UnsupportedOperationException();}
	public EngagementSignal clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EngagementSignal clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EngagementSignal clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EngagementSignal clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
