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
public class AlternativePaymentMethod extends SObject {
	public static SObjectType$<AlternativePaymentMethod> SObjectType;
	public static SObjectFields$<AlternativePaymentMethod> Fields;

	public Id AccountId;
	public Account Account;
	public String AlternativePaymentMethodNumber;
	public String AuditEmail;
	public String BankAccountHolderType;
	public String BankAccountType;
	public String BankCode;
	public String BillingFirstName;
	public String BillingLastName;
	public String BillingName;
	public String Comments;
	public String CompanyName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Email;
	public Blob GatewayToken;
	public String GatewayTokenDetails;
	public Id Id;
	public String IpAddress;
	public Boolean IsAutoPayEnabled;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MacAddress;
	public String Mandate;
	public String NickName;
	public Id OwnerId;
	public Name Owner;
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
	public String StandardEntryClassCode;
	public String Status;
	public Datetime SystemModstamp;

	public PaymentAuthorization[] PaymentAuthorizations;
	public PaymentGatewayLog[] PaymentGatewayLogs;
	public Payment[] Payments;
	public Refund[] Refunds;
	public AlternativePaymentMethodShare[] Shares;

	public AlternativePaymentMethod clone$() {throw new java.lang.UnsupportedOperationException();}
	public AlternativePaymentMethod clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AlternativePaymentMethod clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AlternativePaymentMethod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AlternativePaymentMethod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
