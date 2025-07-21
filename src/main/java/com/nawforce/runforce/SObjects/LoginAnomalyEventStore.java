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
public class LoginAnomalyEventStore extends SObject {
	public static SObjectType$<LoginAnomalyEventStore> SObjectType;
	public static SObjectFields$<LoginAnomalyEventStore> Fields;

	public Datetime CreatedDate;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public Decimal FeatureContribution;
	public String FeatureName;
	public Decimal FeatureValue;
	public Id Id;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LoginAnomalyEventNumber;
	public String LoginKey;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public Decimal Score;
	public String SecurityEventData;
	public String SessionKey;
	public String SourceIp;
	public String Summary;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;
	public String Username;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ThreatDetectionFeedback[] Feedbacks;
	public LoginAnomalyEventStoreFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;

	public LoginAnomalyEventStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoginAnomalyEventStore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoginAnomalyEventStore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoginAnomalyEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoginAnomalyEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
