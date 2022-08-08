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
public class DigitalWallet extends SObject {
	public static SObjectType$<DigitalWallet> SObjectType;
	public static SObjectFields$<DigitalWallet> Fields;

	public Id AccountId;
	public Account Account;
	public com.nawforce.runforce.System.String AuditEmail;
	public com.nawforce.runforce.System.String Comments;
	public com.nawforce.runforce.System.String CompanyName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String Customer;
	public com.nawforce.runforce.System.String DigitalWalletNumber;
	public com.nawforce.runforce.System.String Email;
	public com.nawforce.runforce.System.String GatewayToken;
	public com.nawforce.runforce.System.String GatewayTokenDetails;
	public Blob GatewayTokenEncrypted;
	public Id Id;
	public com.nawforce.runforce.System.String IpAddress;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String MacAddress;
	public com.nawforce.runforce.System.String NickName;
	public Id PaymentGatewayId;
	public PaymentGateway PaymentGateway;
	public Address PaymentMethodAddress;
	public com.nawforce.runforce.System.String PaymentMethodCity;
	public com.nawforce.runforce.System.String PaymentMethodCountry;
	public com.nawforce.runforce.System.String PaymentMethodCountryCode;
	public com.nawforce.runforce.System.String PaymentMethodGeocodeAccuracy;
	public Decimal PaymentMethodLatitude;
	public Decimal PaymentMethodLongitude;
	public com.nawforce.runforce.System.String PaymentMethodPostalCode;
	public com.nawforce.runforce.System.String PaymentMethodState;
	public com.nawforce.runforce.System.String PaymentMethodStateCode;
	public com.nawforce.runforce.System.String PaymentMethodStreet;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.String ProcessingMode;
	public com.nawforce.runforce.System.String Status;
	public Datetime SystemModstamp;

	public PaymentAuthorization[] PaymentAuthorizations;
	public Payment[] Payments;
	public Refund[] Refunds;

	public DigitalWallet clone$() {throw new java.lang.UnsupportedOperationException();}
	public DigitalWallet clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DigitalWallet clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DigitalWallet clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DigitalWallet clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
