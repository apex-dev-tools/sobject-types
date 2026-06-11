/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ProductRelatedComponentChangeEvent extends SObject {
	public static SObjectType$<ProductRelatedComponentChangeEvent> SObjectType;
	public static SObjectFields$<ProductRelatedComponentChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ChildProductClassificationId;
	public ProductClassification ChildProductClassification;
	public Id ChildProductId;
	public Product2 ChildProduct;
	public String ChildProductRole;
	public Id ChildSellingModelId;
	public ProductSellingModel ChildSellingModel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Boolean DoesBundlePriceIncludeChild;
	public Id Id;
	public Boolean IsComponentRequired;
	public Boolean IsDefaultComponent;
	public Boolean IsQuantityEditable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal MaxQuantity;
	public Decimal MinQuantity;
	public String Name;
	public Id ParentProductId;
	public Product2 ParentProduct;
	public String ParentProductRole;
	public Id ParentSellingModelId;
	public ProductSellingModel ParentSellingModel;
	public Id ProductComponentGroupId;
	public ProductComponentGroup ProductComponentGroup;
	public Id ProductRelationshipTypeId;
	public ProductRelationshipType ProductRelationshipType;
	public Decimal Quantity;
	public String QuantityScaleMethod;
	public String ReplayId;
	public Integer Sequence;

	public ProductRelatedComponentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductRelatedComponentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductRelatedComponentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductRelatedComponentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductRelatedComponentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
