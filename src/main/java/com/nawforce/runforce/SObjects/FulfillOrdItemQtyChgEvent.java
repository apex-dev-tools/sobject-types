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
