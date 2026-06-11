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
public class CustomPermissionDependency extends SObject {
	public static SObjectType$<CustomPermissionDependency> SObjectType;
	public static SObjectFields$<CustomPermissionDependency> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id CustomPermissionId;
	public CustomPermission CustomPermission;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id RequiredCustomPermissionId;
	public CustomPermission RequiredCustomPermission;
	public Datetime SystemModstamp;

	public CustomPermissionDependency clone$() {throw new java.lang.UnsupportedOperationException();}
	public CustomPermissionDependency clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CustomPermissionDependency clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CustomPermissionDependency clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CustomPermissionDependency clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
