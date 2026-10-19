/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SvcCatalogItemAttribute extends SObject {
	public static SObjectType$<SvcCatalogItemAttribute> SObjectType;
	public static SObjectFields$<SvcCatalogItemAttribute> Fields;

	public String AttributeType;
	public String BaseObjectApiName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public String InputVariable;
	public String InputVariableValue;
	public Boolean IsAttrValueDerivAtRuntime;
	public Boolean IsDeleted;
	public Boolean IsRequired;
	public String ItemVersionStatus;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentAttributeId;
	public SvcCatalogItemAttribute ParentAttribute;
	public String ReferenceObjectApiName;
	public Integer SortOrder;
	public String StandardFieldApiName;
	public Id SvcCatalogItemDefId;
	public SvcCatalogItemDef SvcCatalogItemDef;
	public Id SvcCatalogItemGroupId;
	public SvcCatalogItemGroup SvcCatalogItemGroup;
	public Datetime SystemModstamp;

	public SvcCatalogReqExtdAttrVal[] SvcCatalogItemAttributes;

	public SvcCatalogItemAttribute clone$() {throw new java.lang.UnsupportedOperationException();}
	public SvcCatalogItemAttribute clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SvcCatalogItemAttribute clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SvcCatalogItemAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SvcCatalogItemAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
