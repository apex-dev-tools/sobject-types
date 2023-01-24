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
public class PermissionSetAssignment extends SObject {
	public static SObjectType$<PermissionSetAssignment> SObjectType;
	public static SObjectFields$<PermissionSetAssignment> Fields;

	public Id AssigneeId;
	public User Assignee;
	public Datetime ExpirationDate;
	public Id Id;
	public Boolean IsActive;
	public Id PermissionSetGroupId;
	public PermissionSetGroup PermissionSetGroup;
	public Id PermissionSetId;
	public PermissionSet PermissionSet;
	public Datetime SystemModstamp;

	public PermissionSetAssignment clone$() {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetAssignment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetAssignment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
