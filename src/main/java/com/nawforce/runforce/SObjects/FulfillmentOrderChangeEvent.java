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
	public String ReplayId;
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
