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
public class PaymentMethod extends SObject {
	public static SObjectType$<PaymentMethod> SObjectType;
	public static SObjectFields$<PaymentMethod> Fields;

	public Id AccountId;
	public Account Account;
	public String Comments;
	public String CompanyName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public String ImplementorType;
	public Boolean IsAutoPayEnabled;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String NickName;
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
	public Id SavedPaymentMethodId;
	public SavedPaymentMethod SavedPaymentMethod;
	public String Status;
	public Datetime SystemModstamp;

	public PaymentAuthorization[] PaymentAuthorizations;
	public Payment[] Payments;
	public Refund[] Refunds;

	public PaymentMethod clone$() {throw new java.lang.UnsupportedOperationException();}
	public PaymentMethod clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PaymentMethod clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PaymentMethod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PaymentMethod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
