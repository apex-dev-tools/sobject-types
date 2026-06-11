/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class FulfillmentOrderChangeEvent extends SObject {
	public static SObjectType$<FulfillmentOrderChangeEvent> SObjectType;
	public static SObjectFields$<FulfillmentOrderChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Datetime ActivatedDate;
	public Id BillToContactId;
	public Contact BillToContact;
	public Object ChangeEventHeader;
	public Datetime ClosedDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime DeliveryDate;
	public Id FulfilledFromLocationId;
	public Location FulfilledFromLocation;
	public Address FulfilledToAddress;
	public String FulfilledToCity;
	public String FulfilledToCountry;
	public String FulfilledToCountryCode;
	public String FulfilledToEmailAddress;
	public String FulfilledToGeocodeAccuracy;
	public Decimal FulfilledToLatitude;
	public Decimal FulfilledToLongitude;
	public String FulfilledToName;
	public String FulfilledToPhone;
	public String FulfilledToPostalCode;
	public String FulfilledToState;
	public String FulfilledToStateCode;
	public String FulfilledToStreet;
	public String FulfillmentOrderNumber;
	public Decimal GrandTotalAmount;
	public Id Id;
	public Id InvoiceId;
	public Invoice Invoice;
	public Boolean IsReship;
	public Boolean IsSuspended;
	public Decimal ItemCount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OrderId;
	public Order Order;
	public Id OwnerId;
	public User Owner;
	public Integer ProcessingTimeInMinutes;
	public String ReplayId;
	public Datetime StartFulfillmentDate;
	public String Status;
	public String StatusCategory;
	public String TaxLocaleType;
	public Decimal TotalAdjustmentAmount;
	public Decimal TotalAdjustmentAmtWithTax;
	public Decimal TotalAdjustmentTaxAmount;
	public Decimal TotalAmount;
	public Decimal TotalDeliveryAdjustAmount;
	public Decimal TotalDeliveryAdjustAmtWithTax;
	public Decimal TotalDeliveryAdjustTaxAmount;
	public Decimal TotalDeliveryAmount;
	public Decimal TotalDeliveryAmtWithTax;
	public Decimal TotalDeliveryTaxAmount;
	public Decimal TotalFeeAdjustAmount;
	public Decimal TotalFeeAdjustAmtWithTax;
	public Decimal TotalFeeAdjustTaxAmount;
	public Decimal TotalFeeAmount;
	public Decimal TotalFeeAmtWithTax;
	public Decimal TotalFeeTaxAmount;
	public Decimal TotalProductAmount;
	public Decimal TotalProductAmtWithTax;
	public Decimal TotalProductTaxAmount;
	public Decimal TotalTaxAmount;
	public String Type;
	public String TypeCategory;

	public FulfillmentOrderChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FulfillmentOrderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
