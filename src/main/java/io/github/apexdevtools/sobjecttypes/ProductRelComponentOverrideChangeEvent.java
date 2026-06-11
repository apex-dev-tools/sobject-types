/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ProductRelComponentOverrideChangeEvent extends SObject {
	public static SObjectType$<ProductRelComponentOverrideChangeEvent> SObjectType;
	public static SObjectFields$<ProductRelComponentOverrideChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Boolean DoesBundlePriceIncludeChild;
	public Id Id;
	public Boolean IsComponentRequired;
	public Boolean IsDefaultComponent;
	public Boolean IsExcluded;
	public Boolean IsQuantityEditable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal MaxQuantity;
	public Decimal MinQuantity;
	public String Name;
	public Id OverrideContextId;
	public SObject OverrideContext;
	public Id OwnerId;
	public User Owner;
	public Id ProductRelatedComponentId;
	public ProductRelatedComponent ProductRelatedComponent;
	public Decimal Quantity;
	public String QuantityScaleMethod;
	public String ReplayId;

	public ProductRelComponentOverrideChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductRelComponentOverrideChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductRelComponentOverrideChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductRelComponentOverrideChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductRelComponentOverrideChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
