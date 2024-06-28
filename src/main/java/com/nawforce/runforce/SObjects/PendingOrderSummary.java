/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PendingOrderSummary extends SObject {
	public static SObjectType$<PendingOrderSummary> SObjectType;
	public static SObjectFields$<PendingOrderSummary> Fields;

	public Id AccountId;
	public Account Account;
	public Id BillToContactId;
	public Contact BillToContact;
	public String BillingEmailAddress;
	public String BillingPhoneNumber;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String ExternalId;
	public String ExternalReferenceIdentifier;
	public Decimal GrandTotalAmount;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String OrderNumber;
	public Datetime OrderedDate;
	public String Payload;
	public String PayloadType;
	public Id SalesStoreId;
	public WebStore SalesStore;
	public String ShopperName;
	public Datetime SystemModstamp;

	public PendingOrderSummary clone$() {throw new java.lang.UnsupportedOperationException();}
	public PendingOrderSummary clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PendingOrderSummary clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PendingOrderSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PendingOrderSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
