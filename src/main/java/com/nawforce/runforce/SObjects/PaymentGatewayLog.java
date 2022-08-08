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
public class PaymentGatewayLog extends SObject {
	public static SObjectType$<PaymentGatewayLog> SObjectType;
	public static SObjectFields$<PaymentGatewayLog> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String GatewayAuthCode;
	public com.nawforce.runforce.System.String GatewayAvsCode;
	public Datetime GatewayDate;
	public com.nawforce.runforce.System.String GatewayMessage;
	public com.nawforce.runforce.System.String GatewayRefNumber;
	public com.nawforce.runforce.System.String GatewayResultCode;
	public com.nawforce.runforce.System.String GatewayResultCodeDescription;
	public Id Id;
	public com.nawforce.runforce.System.String InteractionStatus;
	public com.nawforce.runforce.System.String InteractionType;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.String IsNotification;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id PaymentGatewayId;
	public PaymentGateway PaymentGateway;
	public com.nawforce.runforce.System.String PaymentGatewayLogNumber;
	public Id ReferencedEntityId;
	public Name ReferencedEntity;
	public com.nawforce.runforce.System.String Request;
	public com.nawforce.runforce.System.String Response;
	public com.nawforce.runforce.System.String SfRefNumber;
	public com.nawforce.runforce.System.String SfResultCode;
	public Datetime SystemModstamp;

	public PaymentGatewayLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public PaymentGatewayLog clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGatewayLog clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGatewayLog clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGatewayLog clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
