/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class TerritoryAdminAssignment extends SObject {
	public static SObjectType$<TerritoryAdminAssignment> SObjectType;
	public static SObjectFields$<TerritoryAdminAssignment> Fields;

	public Boolean CanManageHierarchy;
	public Boolean CanManageMembers;
	public Boolean CanManageRecordAssociations;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;
	public Id Territory2Id;
	public Territory2 Territory2;
	public Id Territory2ModelId;
	public Territory2Model Territory2Model;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public TerritoryAdminAssignment clone$() {throw new java.lang.UnsupportedOperationException();}
	public TerritoryAdminAssignment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TerritoryAdminAssignment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TerritoryAdminAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TerritoryAdminAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
