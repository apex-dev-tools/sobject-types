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
public class ServiceContractChangeEvent extends SObject {
	public static SObjectType$<ServiceContractChangeEvent> SObjectType;
	public static SObjectFields$<ServiceContractChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Datetime ActivationDate;
	public com.nawforce.runforce.System.String ApprovalStatus;
	public Address BillingAddress;
	public com.nawforce.runforce.System.String BillingCity;
	public com.nawforce.runforce.System.String BillingCountry;
	public com.nawforce.runforce.System.String BillingCountryCode;
	public com.nawforce.runforce.System.String BillingGeocodeAccuracy;
	public Decimal BillingLatitude;
	public Decimal BillingLongitude;
	public com.nawforce.runforce.System.String BillingPostalCode;
	public com.nawforce.runforce.System.String BillingState;
	public com.nawforce.runforce.System.String BillingStateCode;
	public com.nawforce.runforce.System.String BillingStreet;
	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public com.nawforce.runforce.System.String ContractNumber;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public Date EndDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.Integer LineItemCount;
	public com.nawforce.runforce.System.String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentServiceContractId;
	public ServiceContract ParentServiceContract;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public com.nawforce.runforce.System.String ReplayId;
	public Id RootServiceContractId;
	public ServiceContract RootServiceContract;
	public Address ShippingAddress;
	public com.nawforce.runforce.System.String ShippingCity;
	public com.nawforce.runforce.System.String ShippingCountry;
	public com.nawforce.runforce.System.String ShippingCountryCode;
	public com.nawforce.runforce.System.String ShippingGeocodeAccuracy;
	public Decimal ShippingHandling;
	public Decimal ShippingLatitude;
	public Decimal ShippingLongitude;
	public com.nawforce.runforce.System.String ShippingPostalCode;
	public com.nawforce.runforce.System.String ShippingState;
	public com.nawforce.runforce.System.String ShippingStateCode;
	public com.nawforce.runforce.System.String ShippingStreet;
	public com.nawforce.runforce.System.String SpecialTerms;
	public Date StartDate;
	public Decimal Subtotal;
	public Decimal Tax;
	public com.nawforce.runforce.System.Integer Term;
	public Decimal TotalPrice;

	public ServiceContractChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceContractChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceContractChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceContractChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceContractChangeEvent clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
