/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OwnerChangeOptionInfo extends SObject {
	public static SObjectType$<OwnerChangeOptionInfo> SObjectType;
	public static SObjectFields$<OwnerChangeOptionInfo> Fields;

	public Boolean DefaultValue;
	public String DurableId;
	public String EntityDefinitionId;
	public Id Id;
	public Boolean IsEditable;
	public String Label;
	public String Name;
	public String ParentId;

	public OwnerChangeOptionInfo[] ChildOwnerChangeOptionInfo;

	public OwnerChangeOptionInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public OwnerChangeOptionInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OwnerChangeOptionInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OwnerChangeOptionInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OwnerChangeOptionInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
