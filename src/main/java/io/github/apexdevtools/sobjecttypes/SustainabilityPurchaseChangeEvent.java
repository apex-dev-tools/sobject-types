/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SustainabilityPurchaseChangeEvent extends SObject {
	public static SObjectType$<SustainabilityPurchaseChangeEvent> SObjectType;
	public static SObjectFields$<SustainabilityPurchaseChangeEvent> Fields;

	public Address BillingAddress;
	public String BillingCity;
	public String BillingCountry;
	public String BillingCountryCode;
	public String BillingGeocodeAccuracy;
	public Decimal BillingLatitude;
	public Decimal BillingLongitude;
	public String BillingPostalCode;
	public String BillingState;
	public String BillingStateCode;
	public String BillingStreet;
	public Id BrokerId;
	public Supplier Broker;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String ExternalIdentifier;
	public Id Id;
	public String InvoiceNumber;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String PurchaseOrderNumber;
	public String ReplayId;
	public String Type;

	public SustainabilityPurchaseChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityPurchaseChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityPurchaseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityPurchaseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityPurchaseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
