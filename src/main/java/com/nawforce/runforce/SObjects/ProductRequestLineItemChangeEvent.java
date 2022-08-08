/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ProductRequestLineItemChangeEvent extends SObject {
	public static SObjectType$<ProductRequestLineItemChangeEvent> SObjectType;
	public static SObjectFields$<ProductRequestLineItemChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id CaseId;
	public Case Case;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public Id DestinationLocationId;
	public Location DestinationLocation;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime NeedByDate;
	public Id ParentId;
	public ProductRequest Parent;
	public Id Product2Id;
	public Product2 Product2;
	public com.nawforce.runforce.System.String ProductRequestLineItemNumber;
	public Decimal QuantityRequested;
	public com.nawforce.runforce.System.String QuantityUnitOfMeasure;
	public com.nawforce.runforce.System.String ReplayId;
	public Address ShipToAddress;
	public com.nawforce.runforce.System.String ShipToCity;
	public com.nawforce.runforce.System.String ShipToCountry;
	public com.nawforce.runforce.System.String ShipToCountryCode;
	public com.nawforce.runforce.System.String ShipToGeocodeAccuracy;
	public Decimal ShipToLatitude;
	public Decimal ShipToLongitude;
	public com.nawforce.runforce.System.String ShipToPostalCode;
	public com.nawforce.runforce.System.String ShipToState;
	public com.nawforce.runforce.System.String ShipToStateCode;
	public com.nawforce.runforce.System.String ShipToStreet;
	public com.nawforce.runforce.System.String ShipmentType;
	public Id SourceLocationId;
	public Location SourceLocation;
	public com.nawforce.runforce.System.String Status;
	public Id WorkOrderId;
	public WorkOrder WorkOrder;
	public Id WorkOrderLineItemId;
	public WorkOrderLineItem WorkOrderLineItem;

	public ProductRequestLineItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductRequestLineItemChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductRequestLineItemChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductRequestLineItemChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductRequestLineItemChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
