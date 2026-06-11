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
public class FormulaFunction extends SObject {
	public static SObjectType$<FormulaFunction> SObjectType;
	public static SObjectFields$<FormulaFunction> Fields;

	public String CategoryId;
	public String Description;
	public String DurableId;
	public String ExampleString;
	public Id Id;
	public String Label;
	public String Name;

	public FormulaFunctionAllowedType[] Types;

	public FormulaFunction clone$() {throw new java.lang.UnsupportedOperationException();}
	public FormulaFunction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FormulaFunction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FormulaFunction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FormulaFunction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
