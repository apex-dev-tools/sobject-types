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
public class PaymentGateway extends SObject {
	public static SObjectType$<PaymentGateway> SObjectType;
	public static SObjectFields$<PaymentGateway> Fields;

	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DefaultTapToPayLocation;
	public String ExternalReference;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MerchantAccountId;
	public MerchantAccount MerchantAccount;
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
	public RevenueTransactionErrorLog[] PrimaryRevenueTransactionErrorLogs;
	public Refund[] Refunds;
	public SavedPaymentMethod[] SavedPaymentMethods;

	public PaymentGateway clone$() {throw new java.lang.UnsupportedOperationException();}
	public PaymentGateway clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGateway clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGateway clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PaymentGateway clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
