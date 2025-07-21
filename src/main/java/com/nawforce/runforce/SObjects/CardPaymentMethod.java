/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CardPaymentMethod extends SObject {
	public static SObjectType$<CardPaymentMethod> SObjectType;
	public static SObjectFields$<CardPaymentMethod> Fields;

	public Id AccountId;
	public Account Account;
	public String AuditEmail;
	public String AutoCardType;
	public Integer CardBin;
	public String CardCategory;
	public String CardHolderFirstName;
	public String CardHolderLastName;
	public String CardHolderName;
	public Integer CardLastFour;
	public String CardPaymentMethodNumber;
	public String CardType;
	public String CardTypeCategory;
	public String Comments;
	public String CompanyName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DisplayCardNumber;
	public String Email;
	public Integer ExpiryMonth;
	public Integer ExpiryYear;
	public Datetime GatewayDate;
	public String GatewayResultCode;
	public String GatewayResultCodeDescription;
	public String GatewayToken;
	public String GatewayTokenDetails;
	public Blob GatewayTokenEncrypted;
	public Id Id;
	public String InputCardNumber;
	public String IpAddress;
	public Boolean IsAutoPayEnabled;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MacAddress;
	public String NickName;
	public Id PaymentGatewayId;
	public PaymentGateway PaymentGateway;
	public Address PaymentMethodAddress;
	public String PaymentMethodCity;
	public String PaymentMethodCountry;
	public String PaymentMethodCountryCode;
	public String PaymentMethodDetails;
	public String PaymentMethodGeocodeAccuracy;
	public Decimal PaymentMethodLatitude;
	public Decimal PaymentMethodLongitude;
	public String PaymentMethodPostalCode;
	public String PaymentMethodState;
	public String PaymentMethodStateCode;
	public String PaymentMethodStreet;
	public String PaymentMethodSubType;
	public String PaymentMethodType;
	public String Phone;
	public String ProcessingMode;
	public Id SavedPaymentMethodId;
	public SavedPaymentMethod SavedPaymentMethod;
	public String SfResultCode;
	public Integer StartMonth;
	public Integer StartYear;
	public String Status;
	public Datetime SystemModstamp;

	public PaymentAuthorization[] PaymentAuthorizations;
	public PaymentGatewayLog[] PaymentGatewayLogs;
	public Payment[] Payments;
	public RevenueTransactionErrorLog[] PrimaryRevenueTransactionErrorLogs;
	public Refund[] Refunds;

	public CardPaymentMethod clone$() {throw new java.lang.UnsupportedOperationException();}
	public CardPaymentMethod clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CardPaymentMethod clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CardPaymentMethod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CardPaymentMethod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
