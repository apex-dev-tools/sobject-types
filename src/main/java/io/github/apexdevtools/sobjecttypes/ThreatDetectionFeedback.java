/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ThreatDetectionFeedbackFeed[] Feeds;
	public NetworkActivityAudit[] ParentEntities;
	public GeneratedDocument[] GeneratedDocRefObjects;

	public ThreatDetectionFeedback clone$() {throw new java.lang.UnsupportedOperationException();}
	public ThreatDetectionFeedback clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ThreatDetectionFeedback clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ThreatDetectionFeedback clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ThreatDetectionFeedback clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
