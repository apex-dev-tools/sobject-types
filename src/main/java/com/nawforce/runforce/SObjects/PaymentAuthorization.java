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
public class PaymentAuthorization extends SObject {
	public static SObjectType$<PaymentAuthorization> SObjectType;
	public static SObjectFields$<PaymentAuthorization> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal Amount;
	public Decimal Balance;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime Date;
	public Datetime EffectiveDate;
	public String Email;
	public Datetime ExpirationDate;
	public String GatewayAuthCode;
	public Datetime GatewayDate;
	public String GatewayRefDetails;
	public String GatewayRefNumber;
	public String GatewayResultCode;
	public String GatewayResultCodeDescription;
	public Id Id;
	public String IpAddress;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MacAddress;
	public String PaymentAuthorizationNumber;
	public Id PaymentGatewayId;
	public PaymentGateway PaymentGateway;
	public Id PaymentGroupId;
	public PaymentGroup PaymentGroup;
	public String PaymentIntentGuid;
	public Id PaymentMethodId;
	public PaymentMethod PaymentMethod;
	public String Phone;
	public String ProcessingMode;
	public String SfResultCode;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal TotalAuthReversalAmount;
	public Decimal TotalPaymentCaptureAmount;

	public PaymentAuthAdjustment[] PaymentAuthAdjustments;
	public PaymentGatewayLog[] PaymentGatewayLogs;
	public Payment[] Payments;
	public ProcessException[] ProcessExceptions;

	public PaymentAuthorization clone$() {throw new java.lang.UnsupportedOperationException();}
	public PaymentAuthorization clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PaymentAuthorization clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PaymentAuthorization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PaymentAuthorization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
