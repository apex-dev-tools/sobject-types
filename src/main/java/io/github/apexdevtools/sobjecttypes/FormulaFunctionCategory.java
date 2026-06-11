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
public class FormulaFunctionCategory extends SObject {
	public static SObjectType$<FormulaFunctionCategory> SObjectType;
	public static SObjectFields$<FormulaFunctionCategory> Fields;

	public String DurableId;
	public Id Id;
	public String Label;
	public String Name;

	public FormulaFunction[] Functions;

	public FormulaFunctionCategory clone$() {throw new java.lang.UnsupportedOperationException();}
	public FormulaFunctionCategory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FormulaFunctionCategory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FormulaFunctionCategory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FormulaFunctionCategory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
