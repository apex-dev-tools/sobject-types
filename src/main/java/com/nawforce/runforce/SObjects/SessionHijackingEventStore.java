/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SessionHijackingEventStore extends SObject {
	public static SObjectType$<SessionHijackingEventStore> SObjectType;
	public static SObjectFields$<SessionHijackingEventStore> Fields;

	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrentIp;
	public com.nawforce.runforce.System.String CurrentPlatform;
	public com.nawforce.runforce.System.String CurrentScreen;
	public com.nawforce.runforce.System.String CurrentUserAgent;
	public com.nawforce.runforce.System.String CurrentWindow;
	public Decimal EvaluationTime;
	public Datetime EventDate;
	public com.nawforce.runforce.System.String EventIdentifier;
	public Id Id;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String LoginKey;
	public Id PolicyId;
	public TransactionSecurityPolicy Policy;
	public com.nawforce.runforce.System.String PolicyOutcome;
	public com.nawforce.runforce.System.String PreviousIp;
	public com.nawforce.runforce.System.String PreviousPlatform;
	public com.nawforce.runforce.System.String PreviousScreen;
	public com.nawforce.runforce.System.String PreviousUserAgent;
	public com.nawforce.runforce.System.String PreviousWindow;
	public Decimal Score;
	public com.nawforce.runforce.System.String SecurityEventData;
	public com.nawforce.runforce.System.String SessionHijackingEventNumber;
	public com.nawforce.runforce.System.String SessionKey;
	public com.nawforce.runforce.System.String SourceIp;
	public com.nawforce.runforce.System.String Summary;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;
	public com.nawforce.runforce.System.String Username;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ThreatDetectionFeedback[] Feedbacks;
	public SessionHijackingEventStoreFeed[] Feeds;

	public SessionHijackingEventStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public SessionHijackingEventStore clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SessionHijackingEventStore clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SessionHijackingEventStore clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SessionHijackingEventStore clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
