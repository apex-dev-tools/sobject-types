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
public class ReturnOrderItemAdjustmentChangeEvent extends SObject {
	public static SObjectType$<ReturnOrderItemAdjustmentChangeEvent> SObjectType;
	public static SObjectFields$<ReturnOrderItemAdjustmentChangeEvent> Fields;

	public Decimal Amount;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ReplayId;
	public Id ReturnOrderId;
	public ReturnOrder ReturnOrder;
	public String ReturnOrderItemAdjustmentNumber;
	public Id ReturnOrderLineItemId;
	public ReturnOrderLineItem ReturnOrderLineItem;
	public Decimal TotalAmtWithTax;
	public Decimal TotalTaxAmount;

	public ReturnOrderItemAdjustmentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderItemAdjustmentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderItemAdjustmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderItemAdjustmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderItemAdjustmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
