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
public class UserFieldAccess extends SObject {
	public static SObjectType$<UserFieldAccess> SObjectType;
	public static SObjectFields$<UserFieldAccess> Fields;

	public String DurableId;
	public String EntityDefinitionId;
	public String FieldDefinitionId;
	public Id Id;
	public Boolean IsAccessible;
	public Boolean IsCreatable;
	public Boolean IsUpdatable;
	public Id UserId;
	public User User;

	public UserFieldAccess clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserFieldAccess clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserFieldAccess clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserFieldAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserFieldAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
