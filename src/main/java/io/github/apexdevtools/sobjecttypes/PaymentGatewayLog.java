/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PaymentGatewayLog extends SObject {
	public static SObjectType$<PaymentGatewayLog> SObjectType;
	public static SObjectFields$<PaymentGatewayLog> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String GatewayAuthCode;
	public String GatewayAvsCode;
	public Datetime GatewayDate;
	public String GatewayMessage;
	public String GatewayRefNumber;
	public String GatewayResultCode;
	public String GatewayResultCodeDescription;
	public Id Id;
	public String InteractionStatus;
	public String InteractionType;
	public Boolean IsDeleted;
	public String IsNotification;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id PaymentGatewayId;
	public PaymentGateway PaymentGateway;
	public String PaymentGatewayLogNumber;
	public Id ReferencedEntityId;
	public Name ReferencedEntity;
	public String Request;
	public String Response;
	public String RetryCategory;
	public String RetryDecision;
	public String SfRefNumber;
	public String SfResultCode;
	public Datetime SystemModstamp;

	public PaymentGatewayLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public PaymentGatewayLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGatewayLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGatewayLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGatewayLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
