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
public class ProductRequestLineItemChangeEvent extends SObject {
	public static SObjectType$<ProductRequestLineItemChangeEvent> SObjectType;
	public static SObjectFields$<ProductRequestLineItemChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id CareProgramEnrolleeId;
	public CareProgramEnrollee CareProgramEnrollee;
	public Id CaseId;
	public Case Case;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
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
	public String ProductRequestLineItemNumber;
	public Decimal QuantityRequested;
	public String QuantityUnitOfMeasure;
	public String ReplayId;
	public Address ShipToAddress;
	public String ShipToCity;
	public String ShipToCountry;
	public String ShipToCountryCode;
	public String ShipToGeocodeAccuracy;
	public Decimal ShipToLatitude;
	public Decimal ShipToLongitude;
	public String ShipToPostalCode;
	public String ShipToState;
	public String ShipToStateCode;
	public String ShipToStreet;
	public String ShipmentType;
	public Id SourceLocationId;
	public Location SourceLocation;
	public String Status;
	public Id WorkOrderId;
	public WorkOrder WorkOrder;
	public Id WorkOrderLineItemId;
	public WorkOrderLineItem WorkOrderLineItem;

	public ProductRequestLineItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductRequestLineItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductRequestLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductRequestLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductRequestLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
