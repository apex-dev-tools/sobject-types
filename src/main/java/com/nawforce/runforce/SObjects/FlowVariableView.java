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

	public FlowVariableView clone$() {throw new UnsupportedOperationException();}
	public FlowVariableView clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public FlowVariableView clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public FlowVariableView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public FlowVariableView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
