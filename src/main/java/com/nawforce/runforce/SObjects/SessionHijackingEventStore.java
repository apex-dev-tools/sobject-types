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
public class SessionHijackingEventStore extends SObject {
	public static SObjectType$<SessionHijackingEventStore> SObjectType;
	public static SObjectFields$<SessionHijackingEventStore> Fields;

	public Datetime CreatedDate;
	public String CurrentIp;
	public String CurrentPlatform;
	public String CurrentScreen;
	public String CurrentUserAgent;
	public String CurrentWindow;
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
	public String PreviousIp;
	public String PreviousPlatform;
	public String PreviousScreen;
	public String PreviousUserAgent;
	public String PreviousWindow;
	public Decimal Score;
	public String SecurityEventData;
	public String SessionHijackingEventNumber;
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
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ThreatDetectionFeedback[] Feedbacks;
	public SessionHijackingEventStoreFeed[] Feeds;
	public NetworkActivityAudit[] ParentEntities;

	public SessionHijackingEventStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public SessionHijackingEventStore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SessionHijackingEventStore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SessionHijackingEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SessionHijackingEventStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
