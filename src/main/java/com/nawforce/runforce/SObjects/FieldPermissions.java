/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
