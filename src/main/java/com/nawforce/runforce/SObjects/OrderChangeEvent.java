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
public class OrderChangeEvent extends SObject {
	public static SObjectType$<OrderChangeEvent> SObjectType;
	public static SObjectFields$<OrderChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id ActivatedById;
	public User ActivatedBy;
	public Datetime ActivatedDate;
	public Id BillToContactId;
	public Contact BillToContact;
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
	public Id CompanyAuthorizedById;
	public User CompanyAuthorizedBy;
	public Date CompanyAuthorizedDate;
	public Id ContractId;
	public Contract Contract;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id CustomerAuthorizedById;
	public Contact CustomerAuthorizedBy;
	public Date CustomerAuthorizedDate;
	public String Description;
	public String Division;
	public Date EffectiveDate;
	public Date EndDate;
	public Id Id;
	public Boolean IsReductionOrder;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public String OrderNumber;
	public String OrderReferenceNumber;
	public Id OriginalOrderId;
	public Order OriginalOrder;
	public Id OwnerId;
	public User Owner;
	public Date PoDate;
	public String PoNumber;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public Id QuoteId;
	public Quote Quote;
	public Id RecordTypeId;
	public RecordType RecordType;
	public String ReplayId;
	public Id ShipToContactId;
	public Contact ShipToContact;
	public Address ShippingAddress;
	public String ShippingCity;
	public String ShippingCountry;
	public String ShippingCountryCode;
	public String ShippingGeocodeAccuracy;
	public Decimal ShippingLatitude;
	public Decimal ShippingLongitude;
	public String ShippingPostalCode;
	public String ShippingState;
	public String ShippingStateCode;
	public String ShippingStreet;
	public String Status;
	public String StatusCode;
	public Decimal TotalAmount;
	public String Type;

	public OrderChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public OrderChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OrderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OrderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OrderChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
