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
public class Territory2ObjectExclusion extends SObject {
	public static SObjectType$<Territory2ObjectExclusion> SObjectType;
	public static SObjectFields$<Territory2ObjectExclusion> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Note;
	public Id ObjectId;
	public Account Object;
	public Datetime SystemModstamp;
	public Id Territory2Id;
	public Territory2 Territory2;

	public Territory2ObjectExclusion clone$() {throw new java.lang.UnsupportedOperationException();}
	public Territory2ObjectExclusion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Territory2ObjectExclusion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Territory2ObjectExclusion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Territory2ObjectExclusion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
