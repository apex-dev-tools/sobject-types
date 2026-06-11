/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class GuestUserAnomalyEventStore extends SObject {
	public static SObjectType$<GuestUserAnomalyEventStore> SObjectType;
	public static SObjectFields$<GuestUserAnomalyEventStore> Fields;

	public Datetime CreatedDate;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public String GuestUserAnomalyEventNumber;
	public Id Id;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LoginKey;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public String RequestedEntities;
	public Decimal Score;
	public String SecurityEventData;
	public String SessionKey;
	public String SoqlCommands;
	public String SourceIp;
	public String Summary;
	public Datetime SystemModstamp;
	public Integer TotalControllerEvents;
	public String UserAgent;
	public Id UserId;
	public User User;
	public String UserType;
	public String Username;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ThreatDetectionFeedback[] Feedbacks;
	public GuestUserAnomalyEventStoreFeed[] Feeds;
	public GeneratedDocument[] GeneratedDocRefObjects;

	public GuestUserAnomalyEventStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public GuestUserAnomalyEventStore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GuestUserAnomalyEventStore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GuestUserAnomalyEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GuestUserAnomalyEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
