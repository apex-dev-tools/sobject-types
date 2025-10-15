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
public class FulfillmentOrderLineItemChangeEvent extends SObject {
	public static SObjectType$<FulfillmentOrderLineItemChangeEvent> SObjectType;
	public static SObjectFields$<FulfillmentOrderLineItemChangeEvent> Fields;

	public String Action;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime EndDate;
	public Id FulfillmentOrderId;
	public FulfillmentOrder FulfillmentOrder;
	public String FulfillmentOrderLineItemNumber;
	public Decimal GrossUnitPrice;
	public Id Id;
	public Boolean IsReship;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MainFulfillmentOrderLineItemId;
	public FulfillmentOrderLineItem MainFulfillmentOrderLineItem;
	public Id OrderItemId;
	public OrderItem OrderItem;
	public Decimal OriginalQuantity;
	public Id Product2Id;
	public Product2 Product2;
	public Decimal Quantity;
	public String QuantityUnitOfMeasure;
	public String RejectReason;
	public Decimal RejectedQuantity;
	public String ReplayId;
	public String ReshipReason;
	public String ScopeIdentifierText;
	public Datetime ServiceDate;
	public Decimal TotalAdjustmentAmount;
	public Decimal TotalAdjustmentAmountWithTax;
	public Decimal TotalAdjustmentTaxAmount;
	public Decimal TotalAmount;
	public Decimal TotalLineAmount;
	public Decimal TotalLineAmountWithTax;
	public Decimal TotalLineTaxAmount;
	public Decimal TotalPrice;
	public Decimal TotalTaxAmount;
	public Decimal UnitPrice;

	public FulfillmentOrderLineItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderLineItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
