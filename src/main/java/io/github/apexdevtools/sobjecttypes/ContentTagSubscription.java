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
public class ContentTagSubscription extends SObject {
	public static SObjectType$<ContentTagSubscription> SObjectType;
	public static SObjectFields$<ContentTagSubscription> Fields;

	public Id Id;
	public Id UserId;
	public User User;

	public ContentTagSubscription clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentTagSubscription clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentTagSubscription clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentTagSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentTagSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
