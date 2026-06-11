/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AppTabMember extends SObject {
	public static SObjectType$<AppTabMember> SObjectType;
	public static SObjectFields$<AppTabMember> Fields;

	public String AppDefinitionId;
	public String DurableId;
	public Id Id;
	public Integer SortOrder;
	public String TabDefinitionId;
	public String WorkspaceDriverField;

	public AppTabMember clone$() {throw new java.lang.UnsupportedOperationException();}
	public AppTabMember clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AppTabMember clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AppTabMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AppTabMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
