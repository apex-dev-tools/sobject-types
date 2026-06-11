/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ObjectUserTerritory2View extends SObject {
	public static SObjectType$<ObjectUserTerritory2View> SObjectType;
	public static SObjectFields$<ObjectUserTerritory2View> Fields;

	public Id Id;
	public Datetime LastModifiedDate;
	public Id ObjectId;
	public Name Object;
	public String RoleInTerritory2;
	public Id Territory2Id;
	public Territory2 Territory2;
	public Id UserId;
	public User User;

	public ObjectUserTerritory2View clone$() {throw new java.lang.UnsupportedOperationException();}
	public ObjectUserTerritory2View clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ObjectUserTerritory2View clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ObjectUserTerritory2View clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ObjectUserTerritory2View clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
