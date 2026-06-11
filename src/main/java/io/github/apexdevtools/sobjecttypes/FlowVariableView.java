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
public class FlowVariableView extends SObject {
	public static SObjectType$<FlowVariableView> SObjectType;
	public static SObjectFields$<FlowVariableView> Fields;

	public String ApiName;
	public String DataType;
	public String Description;
	public String DurableId;
	public String FlowVersionViewId;
	public Id Id;
	public Boolean IsCollection;
	public Boolean IsInput;
	public Boolean IsOutput;
	public String ObjectType;

	public FlowVariableView clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowVariableView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowVariableView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowVariableView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowVariableView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
