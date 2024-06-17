/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CartItem extends SObject {
	public static SObjectType$<CartItem> SObjectType;
	public static SObjectFields$<CartItem> Fields;

	public Decimal AdjustmentAmount;
	public Decimal AdjustmentTaxAmount;
	public Id CartDeliveryGroupId;
	public CartDeliveryGroup CartDeliveryGroup;
	public Id CartId;
	public WebCart Cart;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal DistributedAdjustmentAmount;
	public Decimal DistributedAdjustmentTaxAmount;
	public Decimal GrossAdjustmentAmount;
	public Decimal GrossUnitPrice;
	public Id Id;
	public Boolean IsDeleted;
	public Decimal ItemizedAdjustmentAmount;
	public Decimal ItemizedAdjustmentTaxAmount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal ListPrice;
	public String Name;
	public Decimal NetAdjustmentAmount;
	public Decimal NetUnitPrice;
	public Id Product2Id;
	public Product2 Product2;
	public Decimal Quantity;
	public Decimal SalesPrice;
	public String Sku;
	public Datetime SystemModstamp;
	public Decimal TotalAdjustmentAmount;
	public Decimal TotalAmount;
	public Decimal TotalLineAmount;
	public Decimal TotalLineGrossAmount;
	public Decimal TotalLineNetAmount;
	public Decimal TotalLineTaxAmount;
	public Decimal TotalListPrice;
	public Decimal TotalPrice;
	public Decimal TotalPriceAfterAllAdjustments;
	public Decimal TotalPriceTaxAmount;
	public Decimal TotalPromoAdjustmentAmount;
	public Decimal TotalPromoAdjustmentTaxAmount;
	public Decimal TotalTaxAmount;
	public String Type;
	public Decimal UnitAdjustedPrice;
	public Decimal UnitAdjustedPriceWithItemAdj;
	public Decimal UnitAdjustmentAmount;
	public Decimal UnitItemAdjustmentAmount;

	public CartItemPriceAdjustment[] CartItemPriceAdjustments;
	public CartTax[] CartItemTaxes;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public InventoryItemReservation[] InventoryReservationSources;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public CartItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public CartItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CartItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CartItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CartItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
