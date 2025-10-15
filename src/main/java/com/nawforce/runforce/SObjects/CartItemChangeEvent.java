/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CartItemChangeEvent extends SObject {
	public static SObjectType$<CartItemChangeEvent> SObjectType;
	public static SObjectFields$<CartItemChangeEvent> Fields;

	public Decimal AdjustmentAmount;
	public Decimal AdjustmentTaxAmount;
	public Id CartDeliveryGroupId;
	public CartDeliveryGroup CartDeliveryGroup;
	public Id CartId;
	public WebCart Cart;
	public Object ChangeEventHeader;
	public Integer ChildProductCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal DistributedAdjustmentAmount;
	public Decimal DistributedAdjustmentTaxAmount;
	public Decimal GrossUnitPrice;
	public Id Id;
	public Boolean IsShippingChargeNotApplicable;
	public Decimal ItemizedAdjustmentAmount;
	public Decimal ItemizedAdjustmentTaxAmount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal ListPrice;
	public String Name;
	public Decimal NetUnitPrice;
	public Id ParentCartItemId;
	public CartItem ParentCartItem;
	public Decimal PerUnitWeight;
	public Id Product2Id;
	public Product2 Product2;
	public String ProductClass;
	public Id ProductRelatedComponentId;
	public ProductRelatedComponent ProductRelatedComponent;
	public String ProductValidationKey;
	public Decimal Quantity;
	public String ReplayId;
	public Decimal SalesPrice;
	public String Sku;
	public String StockCheckMethod;
	public String SubType;
	public Decimal TotalAdjustmentAmount;
	public Decimal TotalLineAmount;
	public Decimal TotalLineTaxAmount;
	public Decimal TotalListPrice;
	public Decimal TotalPrice;
	public Decimal TotalPriceAfterAllAdjustments;
	public Decimal TotalPromoAdjustmentAmount;
	public Decimal TotalWeight;
	public String Type;
	public Decimal UnitAdjustedPrice;
	public Decimal UnitAdjustedPriceWithItemAdj;
	public Decimal UnitAdjustmentAmount;
	public Decimal UnitItemAdjustmentAmount;
	public String WeightUnit;

	public CartItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CartItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CartItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CartItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CartItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
