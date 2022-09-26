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
public class ThreatDetectionFeedback extends SObject {
	public static SObjectType$<ThreatDetectionFeedback> SObjectType;
	public static SObjectFields$<ThreatDetectionFeedback> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Response;
	public Datetime SystemModstamp;
	public Id ThreatDetectionEventId;
	public Name ThreatDetectionEvent;
	public String ThreatDetectionFeedbackNumber;
	public Id UserId;
	public User User;
	public String Username;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ThreatDetectionFeedbackFeed[] Feeds;
	public NetworkActivityAudit[] ParentEntities;

	public ThreatDetectionFeedback clone$() {throw new java.lang.UnsupportedOperationException();}
	public ThreatDetectionFeedback clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ThreatDetectionFeedback clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ThreatDetectionFeedback clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ThreatDetectionFeedback clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
