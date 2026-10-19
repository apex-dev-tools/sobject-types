/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AsyncThirdPartyPaymentGatewayEvent extends SObject {
	public static SObjectType$<AsyncThirdPartyPaymentGatewayEvent> SObjectType;
	public static SObjectFields$<AsyncThirdPartyPaymentGatewayEvent> Fields;

	public String ClientContext;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String GatewayMessage;
	public String GatewayReferenceDetails;
	public String GatewayReferenceNumber;
	public String GatewayResultCode;
	public String NotificationStatus;
	public Id PaymentAuthorizationId;
	public PaymentAuthorization PaymentAuthorization;
	public Id PaymentId;
	public Payment Payment;
	public Id RefundId;
	public Refund Refund;
	public String ReplayId;
	public String RetryCategory;
	public String RetryDecision;
	public String SalesforceResultCode;
	public String TransactionType;

	public AsyncThirdPartyPaymentGatewayEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AsyncThirdPartyPaymentGatewayEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AsyncThirdPartyPaymentGatewayEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AsyncThirdPartyPaymentGatewayEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AsyncThirdPartyPaymentGatewayEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
