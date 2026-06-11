/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class UserEntityAccess extends SObject {
	public static SObjectType$<UserEntityAccess> SObjectType;
	public static SObjectFields$<UserEntityAccess> Fields;

	public String DurableId;
	public EntityDefinition EntityDefinition;
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

	public UserEntityAccess clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserEntityAccess clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserEntityAccess clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserEntityAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserEntityAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
