/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class FulfillmentOrderItemTaxChangeEvent extends SObject {
	public static SObjectType$<FulfillmentOrderItemTaxChangeEvent> SObjectType;
	public static SObjectFields$<FulfillmentOrderItemTaxChangeEvent> Fields;

	public Decimal Amount;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id FulfillmentOrderId;
	public FulfillmentOrder FulfillmentOrder;
	public Id FulfillmentOrderItemAdjustId;
	public FulfillmentOrderItemAdjustment FulfillmentOrderItemAdjust;
	public String FulfillmentOrderItemTaxNumber;
	public Id FulfillmentOrderLineItemId;
	public FulfillmentOrderLineItem FulfillmentOrderLineItem;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal Rate;
	public String ReplayId;
	public Date TaxEffectiveDate;
	public String Type;

	public FulfillmentOrderItemTaxChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderItemTaxChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderItemTaxChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderItemTaxChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderItemTaxChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
