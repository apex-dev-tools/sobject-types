/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ProductConsumedChangeEvent extends SObject {
	public static SObjectType$<ProductConsumedChangeEvent> SObjectType;
	public static SObjectFields$<ProductConsumedChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal Discount;
	public Id Id;
	public Boolean IsConsumed;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id PricebookEntryId;
	public PricebookEntry PricebookEntry;
	public String ProductConsumedNumber;
	public Id ProductItemId;
	public ProductItem ProductItem;
	public Decimal QuantityConsumed;
	public String ReplayId;
	public Decimal UnitPrice;
	public Id WorkOrderId;
	public WorkOrder WorkOrder;
	public Id WorkOrderLineItemId;
	public WorkOrderLineItem WorkOrderLineItem;

	public ProductConsumedChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductConsumedChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductConsumedChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductConsumedChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductConsumedChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
