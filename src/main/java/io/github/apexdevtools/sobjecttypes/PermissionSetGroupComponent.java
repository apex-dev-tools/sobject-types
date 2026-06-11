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
public class PermissionSetGroupComponent extends SObject {
	public static SObjectType$<PermissionSetGroupComponent> SObjectType;
	public static SObjectFields$<PermissionSetGroupComponent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id PermissionSetGroupId;
	public PermissionSetGroup PermissionSetGroup;
	public Id PermissionSetId;
	public PermissionSet PermissionSet;
	public Datetime SystemModstamp;

	public PermissionSetGroupComponent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetGroupComponent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetGroupComponent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetGroupComponent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PermissionSetGroupComponent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
