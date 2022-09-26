/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class ContentUserSubscription extends SObject {
	public static SObjectType$<ContentUserSubscription> SObjectType;
	public static SObjectFields$<ContentUserSubscription> Fields;

	public Id Id;
	public Id SubscribedToUserId;
	public User SubscribedToUser;
	public Id SubscriberUserId;
	public User SubscriberUser;

	public ContentUserSubscription clone$() {throw new UnsupportedOperationException();}
	public ContentUserSubscription clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public ContentUserSubscription clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public ContentUserSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public ContentUserSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
