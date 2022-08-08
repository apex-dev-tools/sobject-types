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
public class PaymentGateway extends SObject {
	public static SObjectType$<PaymentGateway> SObjectType;
	public static SObjectFields$<PaymentGateway> Fields;

	public com.nawforce.runforce.System.String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String ExternalReference;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MerchantCredentialId;
	public NamedCredential MerchantCredential;
	public com.nawforce.runforce.System.String PaymentGatewayName;
	public Id PaymentGatewayProviderId;
	public PaymentGatewayProvider PaymentGatewayProvider;
	public com.nawforce.runforce.System.String Status;
	public Datetime SystemModstamp;

	public AlternativePaymentMethod[] AlternativePaymentMethods;
	public CardPaymentMethod[] CardPaymentMethods;
	public DigitalWallet[] DigitalWallets;
	public PaymentAuthorization[] PaymentAuthorizations;
	public PaymentGatewayLog[] PaymentGatewayLogs;
	public Payment[] Payments;
	public Refund[] Refunds;

	public PaymentGateway clone$() {throw new java.lang.UnsupportedOperationException();}
	public PaymentGateway clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGateway clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGateway clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGateway clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
