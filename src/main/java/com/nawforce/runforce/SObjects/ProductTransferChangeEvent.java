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
public class ProductTransferChangeEvent extends SObject {
	public static SObjectType$<ProductTransferChangeEvent> SObjectType;
	public static SObjectFields$<ProductTransferChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DestinationLocationId;
	public Location DestinationLocation;
	public Datetime ExpectedPickupDate;
	public Id Id;
	public Boolean IsReceived;
	public Boolean IsSent;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public User Owner;
	public Id Product2Id;
	public Product2 Product2;
	public Id ProductRequestLineItemId;
	public ProductRequestLineItem ProductRequestLineItem;
	public String ProductTransferNumber;
	public Decimal QuantityReceived;
	public Decimal QuantitySent;
	public String QuantityUnitOfMeasure;
	public Id ReceivedById;
	public SObject ReceivedBy;
	public String ReplayId;
	public Id ReturnOrderLineItemId;
	public ReturnOrderLineItem ReturnOrderLineItem;
	public Id ShipmentId;
	public Shipment Shipment;
	public Id SourceLocationId;
	public Location SourceLocation;
	public Id SourceProductItemId;
	public ProductItem SourceProductItem;
	public String Status;

	public ProductTransferChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductTransferChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductTransferChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductTransferChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductTransferChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
