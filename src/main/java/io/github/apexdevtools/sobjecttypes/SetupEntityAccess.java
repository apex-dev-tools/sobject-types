/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SetupEntityAccess extends SObject {
	public static SObjectType$<SetupEntityAccess> SObjectType;
	public static SObjectFields$<SetupEntityAccess> Fields;

	public Id Id;
	public Id ParentId;
	public PermissionSet Parent;
	public Id SetupEntityId;
	public SObject SetupEntity;
	public String SetupEntityType;
	public Datetime SystemModstamp;

	public SetupEntityAccess clone$() {throw new java.lang.UnsupportedOperationException();}
	public SetupEntityAccess clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SetupEntityAccess clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SetupEntityAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SetupEntityAccess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
