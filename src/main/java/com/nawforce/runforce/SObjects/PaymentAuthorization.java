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
public class PaymentAuthorization extends SObject {
	public static SObjectType$<PaymentAuthorization> SObjectType;
	public static SObjectFields$<PaymentAuthorization> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal Amount;
	public Decimal Balance;
	public com.nawforce.runforce.System.String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Datetime Date;
	public Datetime EffectiveDate;
	public com.nawforce.runforce.System.String Email;
	public Datetime ExpirationDate;
	public com.nawforce.runforce.System.String GatewayAuthCode;
	public Datetime GatewayDate;
	public com.nawforce.runforce.System.String GatewayRefDetails;
	public com.nawforce.runforce.System.String GatewayRefNumber;
	public com.nawforce.runforce.System.String GatewayResultCode;
	public com.nawforce.runforce.System.String GatewayResultCodeDescription;
	public Id Id;
	public com.nawforce.runforce.System.String IpAddress;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String MacAddress;
	public com.nawforce.runforce.System.String PaymentAuthorizationNumber;
	public Id PaymentGatewayId;
	public PaymentGateway PaymentGateway;
	public Id PaymentGroupId;
	public PaymentGroup PaymentGroup;
	public Id PaymentMethodId;
	public PaymentMethod PaymentMethod;
	public com.nawforce.runforce.System.String Phone;
	public com.nawforce.runforce.System.String ProcessingMode;
	public com.nawforce.runforce.System.String SfResultCode;
	public com.nawforce.runforce.System.String Status;
	public Datetime SystemModstamp;
	public Decimal TotalAuthReversalAmount;
	public Decimal TotalPaymentCaptureAmount;

	public PaymentAuthAdjustment[] PaymentAuthAdjustments;
	public PaymentGatewayLog[] PaymentGatewayLogs;
	public Payment[] Payments;
	public ProcessException[] ProcessExceptions;

	public PaymentAuthorization clone$() {throw new java.lang.UnsupportedOperationException();}
	public PaymentAuthorization clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PaymentAuthorization clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PaymentAuthorization clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PaymentAuthorization clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
