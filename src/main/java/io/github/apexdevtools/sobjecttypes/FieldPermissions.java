/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class FieldPermissions extends SObject {
	public static SObjectFields$<FieldPermissions> Fields;

	public String Field;
	public Id Id;
	public Id ParentId;
	public PermissionSet Parent;
	public Boolean PermissionsEdit;
	public Boolean PermissionsRead;
	public String SobjectType;
	public Datetime SystemModstamp;

	public FieldPermissions clone$() {throw new java.lang.UnsupportedOperationException();}
	public FieldPermissions clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FieldPermissions clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FieldPermissions clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FieldPermissions clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
