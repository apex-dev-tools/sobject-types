/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class EntitySubscription extends SObject {
	public static SObjectType$<EntitySubscription> SObjectType;
	public static SObjectFields$<EntitySubscription> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id ParentId;
	public Name Parent;
	public Id SubscriberId;
	public User Subscriber;

	public EntitySubscription clone$() {throw new UnsupportedOperationException();}
	public EntitySubscription clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public EntitySubscription clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public EntitySubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public EntitySubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
