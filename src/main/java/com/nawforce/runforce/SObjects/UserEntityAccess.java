/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class UserEntityAccess extends SObject {
	public static SObjectType$<UserEntityAccess> SObjectType;
	public static SObjectFields$<UserEntityAccess> Fields;

	public String DurableId;
	public String EntityDefinitionId;
	public Id Id;
	public Boolean IsActivateable;
	public Boolean IsCreatable;
	public Boolean IsDeletable;
	public Boolean IsEditable;
	public Boolean IsFlsUpdatable;
	public Boolean IsMergeable;
	public Boolean IsReadable;
	public Boolean IsUndeletable;
	public Boolean IsUpdatable;
	public Id UserId;
	public User User;

	public UserEntityAccess clone$() {throw new UnsupportedOperationException();}
	public UserEntityAccess clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public UserEntityAccess clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public UserEntityAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public UserEntityAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
