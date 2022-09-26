/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class FormulaFunctionAllowedType extends SObject {
	public static SObjectType$<FormulaFunctionAllowedType> SObjectType;
	public static SObjectFields$<FormulaFunctionAllowedType> Fields;

	public String DurableId;
	public String FunctionId;
	public Id Id;
	public String Type;

	public FormulaFunctionAllowedType clone$() {throw new UnsupportedOperationException();}
	public FormulaFunctionAllowedType clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public FormulaFunctionAllowedType clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public FormulaFunctionAllowedType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public FormulaFunctionAllowedType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
