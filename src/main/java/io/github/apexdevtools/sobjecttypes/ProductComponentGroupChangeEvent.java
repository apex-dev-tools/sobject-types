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
public class ProductComponentGroupChangeEvent extends SObject {
	public static SObjectType$<ProductComponentGroupChangeEvent> SObjectType;
	public static SObjectFields$<ProductComponentGroupChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer MaxBundleComponents;
	public Integer MinBundleComponents;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentGroupId;
	public ProductComponentGroup ParentGroup;
	public Id ParentProductId;
	public Product2 ParentProduct;
	public String ReplayId;
	public Integer Sequence;

	public ProductComponentGroupChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductComponentGroupChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductComponentGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductComponentGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductComponentGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
