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
public class RelatedListDefinition extends SObject {
	public static SObjectType$<RelatedListDefinition> SObjectType;
	public static SObjectFields$<RelatedListDefinition> Fields;

	public String DefaultSort;
	public String DurableId;
	public String EntityDefinitionId;
	public Id Id;
	public Boolean IsCustomizable;
	public Boolean IsDescribable;
	public Boolean IsLayoutable;
	public String Label;
	public String ParentEntityDefinitionId;
	public String RelatedListId;
	public String RelatedListName;

	public RelatedListColumnDefinition[] RelatedListColumnDefinitions;

	public RelatedListDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public RelatedListDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RelatedListDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RelatedListDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RelatedListDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
