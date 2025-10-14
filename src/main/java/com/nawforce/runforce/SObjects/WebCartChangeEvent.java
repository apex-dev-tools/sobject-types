/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WebCartChangeEvent extends SObject {
	public static SObjectType$<WebCartChangeEvent> SObjectType;
	public static SObjectFields$<WebCartChangeEvent> Fields;

	public Id AccountId;
	public SObject Account;
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
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String GuestCompanyName;
	public String GuestEmailAddress;
	public String GuestFirstName;
	public String GuestLastName;
	public String GuestPhoneNumber;
	public String GuestSecondName;
	public Id Id;
	public String InitialOrderReferenceNumber;
	public String InventoryReservationIdentifier;
	public Boolean IsRepricingNeeded;
	public Boolean IsSecondary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastRepricingDate;
	public String Name;
	public Id OrderOwnerId;
	public User OrderOwner;
	public Id OwnerId;
	public User Owner;
	public Id PaymentGroupId;
	public PaymentGroup PaymentGroup;
	public Id PaymentMethodId;
	public SObject PaymentMethod;
	public String PoNumber;
	public String ReplayId;
	public String Status;
	public String TaxType;
	public Decimal TotalAdjustmentAmount;
	public Decimal TotalCartLevelAdjAmount;
	public Decimal TotalChargeAmount;
	public Decimal TotalChargeItemAdjAmount;
	public Decimal TotalChargeTaxAmount;
	public Integer TotalLineItemsWithErrors;
	public Decimal TotalListAmount;
	public Decimal TotalProductAmount;
	public Decimal TotalProductCount;
	public Decimal TotalProductItemAdjAmount;
	public Integer TotalProductLineItemCount;
	public Decimal TotalProductListAmount;
	public Decimal TotalProductTaxAmount;
	public Decimal TotalPromoAdjustmentAmount;
	public Decimal TotalPromoAdjustmentTaxAmount;
	public String Type;
	public Integer UniqueProductCount;
	public Id WebStoreId;
	public WebStore WebStore;

	public WebCartChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebCartChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebCartChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebCartChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebCartChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
