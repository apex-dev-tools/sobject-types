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
public class ApiAnomalyEventStore extends SObject {
	public static SObjectType$<ApiAnomalyEventStore> SObjectType;
	public static SObjectFields$<ApiAnomalyEventStore> Fields;

	public String ApiAnomalyEventNumber;
	public Datetime CreatedDate;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public Id Id;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LoginKey;
	public String Operation;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public String QueriedEntities;
	public String RequestIdentifier;
	public Decimal RowsProcessed;
	public Decimal Score;
	public String SecurityEventData;
	public String SessionKey;
	public String SourceIp;
	public String Summary;
	public Datetime SystemModstamp;
	public String Uri;
	public String UserAgent;
	public Id UserId;
	public User User;
	public String Username;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ThreatDetectionFeedback[] Feedbacks;
	public ApiAnomalyEventStoreFeed[] Feeds;

	public ApiAnomalyEventStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApiAnomalyEventStore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApiAnomalyEventStore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApiAnomalyEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApiAnomalyEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
