/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class PermissionSetAssignment extends SObject {
	public static SObjectType$<PermissionSetAssignment> SObjectType;
	public static SObjectFields$<PermissionSetAssignment> Fields;

	public Id AssigneeId;
	public User Assignee;
	public Datetime ExpirationDate;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsRevoked;
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
