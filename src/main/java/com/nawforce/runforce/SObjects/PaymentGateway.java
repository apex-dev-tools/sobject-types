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
public class PaymentGateway extends SObject {
	public static SObjectType$<PaymentGateway> SObjectType;
	public static SObjectFields$<PaymentGateway> Fields;

	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExternalReference;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MerchantCredentialId;
	public NamedCredential MerchantCredential;
	public String PaymentGatewayName;
	public Id PaymentGatewayProviderId;
	public PaymentGatewayProvider PaymentGatewayProvider;
	public String Status;
	public Datetime SystemModstamp;

	public AlternativePaymentMethod[] AlternativePaymentMethods;
	public CardPaymentMethod[] CardPaymentMethods;
	public DigitalWallet[] DigitalWallets;
	public PaymentAuthorization[] PaymentAuthorizations;
	public PaymentGatewayLog[] PaymentGatewayLogs;
	public Payment[] Payments;
	public Refund[] Refunds;

	public PaymentGateway clone$() {throw new java.lang.UnsupportedOperationException();}
	public PaymentGateway clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGateway clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGateway clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGateway clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
