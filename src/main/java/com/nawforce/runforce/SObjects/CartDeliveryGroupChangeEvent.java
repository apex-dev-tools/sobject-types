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
public class CartDeliveryGroupChangeEvent extends SObject {
	public static SObjectType$<CartDeliveryGroupChangeEvent> SObjectType;
	public static SObjectFields$<CartDeliveryGroupChangeEvent> Fields;

	public Id CartId;
	public WebCart Cart;
	public Object ChangeEventHeader;
	public String CompanyName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Address DeliverToAddress;
	public String DeliverToCity;
	public String DeliverToCountry;
	public String DeliverToCountryCode;
	public String DeliverToFirstName;
	public String DeliverToGeocodeAccuracy;
	public String DeliverToLastName;
	public Decimal DeliverToLatitude;
	public Decimal DeliverToLongitude;
	public String DeliverToName;
	public String DeliverToPostalCode;
	public String DeliverToState;
	public String DeliverToStateCode;
	public String DeliverToStreet;
	public Datetime DesiredDeliveryDate;
	public Id Id;
	public Boolean IsDefault;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public Id SelectedDeliveryMethodId;
	public CartDeliveryGroupMethod SelectedDeliveryMethod;
	public String ShipToPhoneNumber;
	public String ShippingInstructions;

	public CartDeliveryGroupChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CartDeliveryGroupChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CartDeliveryGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CartDeliveryGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CartDeliveryGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
