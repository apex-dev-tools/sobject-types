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
public class ContentTagSubscription extends SObject {
	public static SObjectType$<ContentTagSubscription> SObjectType;
	public static SObjectFields$<ContentTagSubscription> Fields;

	public Id Id;
	public Id UserId;
	public User User;

	public ContentTagSubscription clone$() {throw new UnsupportedOperationException();}
	public ContentTagSubscription clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public ContentTagSubscription clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public ContentTagSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public ContentTagSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
