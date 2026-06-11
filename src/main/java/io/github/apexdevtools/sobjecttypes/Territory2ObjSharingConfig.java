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
public class Territory2ObjSharingConfig extends SObject {
	public static SObjectType$<Territory2ObjSharingConfig> SObjectType;
	public static SObjectFields$<Territory2ObjSharingConfig> Fields;

	public String AccessLevel;
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
	public Id TerritoryMgmtObjectConfigId;
	public TerritoryMgmtObjectConfig TerritoryMgmtObjectConfig;

	public Territory2ObjSharingConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public Territory2ObjSharingConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Territory2ObjSharingConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Territory2ObjSharingConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Territory2ObjSharingConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
