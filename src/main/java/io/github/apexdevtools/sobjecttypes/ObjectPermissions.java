/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ObjectPermissions extends SObject {
	public static SObjectFields$<ObjectPermissions> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public PermissionSet Parent;
	public Boolean PermissionsCreate;
	public Boolean PermissionsDelete;
	public Boolean PermissionsEdit;
	public Boolean PermissionsModifyAllRecords;
	public Boolean PermissionsRead;
	public Boolean PermissionsViewAllFields;
	public Boolean PermissionsViewAllRecords;
	public String SobjectType;
	public Datetime SystemModstamp;

	public ObjectPermissions clone$() {throw new java.lang.UnsupportedOperationException();}
	public ObjectPermissions clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ObjectPermissions clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ObjectPermissions clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ObjectPermissions clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
