/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class ContentUserSubscription extends SObject {
	public static SObjectType$<ContentUserSubscription> SObjectType;
	public static SObjectFields$<ContentUserSubscription> Fields;

	public Id Id;
	public Id SubscribedToUserId;
	public User SubscribedToUser;
	public Id SubscriberUserId;
	public User SubscriberUser;

	public ContentUserSubscription clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentUserSubscription clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentUserSubscription clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentUserSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentUserSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
