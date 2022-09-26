/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
	public Boolean PermissionsViewAllRecords;
	public String SobjectType;
	public Datetime SystemModstamp;

	public ObjectPermissions clone$() {throw new java.lang.UnsupportedOperationException();}
	public ObjectPermissions clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ObjectPermissions clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ObjectPermissions clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ObjectPermissions clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
