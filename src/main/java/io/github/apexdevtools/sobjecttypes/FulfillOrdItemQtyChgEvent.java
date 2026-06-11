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
public class FulfillOrdItemQtyChgEvent extends SObject {
	public static SObjectType$<FulfillOrdItemQtyChgEvent> SObjectType;
	public static SObjectFields$<FulfillOrdItemQtyChgEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public Id FulfillmentOrderLineItemId;
	public FulfillmentOrderLineItem FulfillmentOrderLineItem;
	public Decimal NewQuantity;
	public Decimal OldQuantity;
	public String ReplayId;

	public FulfillOrdItemQtyChgEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FulfillOrdItemQtyChgEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FulfillOrdItemQtyChgEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FulfillOrdItemQtyChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FulfillOrdItemQtyChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
