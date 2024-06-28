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
public class ReportAnomalyEventStore extends SObject {
	public static SObjectType$<ReportAnomalyEventStore> SObjectType;
	public static SObjectFields$<ReportAnomalyEventStore> Fields;

	public Datetime CreatedDate;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public String EventIdentifier;
	public Id Id;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LoginKey;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public String PolicyOutcome;
	public String Report;
	public String ReportAnomalyEventNumber;
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
	public ReportAnomalyEventStoreFeed[] Feeds;
	public NetworkActivityAudit[] ParentEntities;
	public GeneratedDocument[] GeneratedDocRefObjects;

	public ReportAnomalyEventStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReportAnomalyEventStore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReportAnomalyEventStore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReportAnomalyEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReportAnomalyEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
