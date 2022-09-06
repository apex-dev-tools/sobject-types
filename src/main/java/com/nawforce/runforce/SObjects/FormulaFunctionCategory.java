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
public class FormulaFunctionCategory extends SObject {
	public static SObjectType$<FormulaFunctionCategory> SObjectType;
	public static SObjectFields$<FormulaFunctionCategory> Fields;

	public String DurableId;
	public Id Id;
	public String Label;
	public String Name;

	public FormulaFunction[] Functions;

	public FormulaFunctionCategory clone$() {throw new UnsupportedOperationException();}
	public FormulaFunctionCategory clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public FormulaFunctionCategory clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public FormulaFunctionCategory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public FormulaFunctionCategory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
