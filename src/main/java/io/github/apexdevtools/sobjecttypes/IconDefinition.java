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
public class IconDefinition extends SObject {
	public static SObjectType$<IconDefinition> SObjectType;
	public static SObjectFields$<IconDefinition> Fields;

	public String ContentType;
	public String DurableId;
	public Integer Height;
	public Id Id;
	public String TabDefinitionId;
	public String Theme;
	public String Url;
	public Integer Width;

	public IconDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public IconDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IconDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IconDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IconDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
