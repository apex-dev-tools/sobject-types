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

	public FormulaFunction clone$() {throw new UnsupportedOperationException();}
	public FormulaFunction clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public FormulaFunction clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public FormulaFunction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public FormulaFunction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
