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
public class RelatedListColumnDefinition extends SObject {
	public static SObjectType$<RelatedListColumnDefinition> SObjectType;
	public static SObjectFields$<RelatedListColumnDefinition> Fields;

	public String Alias;
	public String ColumnSoql;
	public String DataType;
	public String DurableId;
	public String FieldDefinitionId;
	public Id Id;
	public Boolean IsDefault;
	public Boolean IsDescribable;
	public String Label;
	public String LookupId;
	public String RelatedListDefinitionId;

	public RelatedListColumnDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public RelatedListColumnDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RelatedListColumnDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RelatedListColumnDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RelatedListColumnDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
