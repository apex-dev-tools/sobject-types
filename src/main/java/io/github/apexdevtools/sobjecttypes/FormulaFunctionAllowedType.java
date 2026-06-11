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
public class FormulaFunctionAllowedType extends SObject {
	public static SObjectType$<FormulaFunctionAllowedType> SObjectType;
	public static SObjectFields$<FormulaFunctionAllowedType> Fields;

	public String DurableId;
	public String FunctionId;
	public Id Id;
	public String Type;

	public FormulaFunctionAllowedType clone$() {throw new java.lang.UnsupportedOperationException();}
	public FormulaFunctionAllowedType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FormulaFunctionAllowedType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FormulaFunctionAllowedType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FormulaFunctionAllowedType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
