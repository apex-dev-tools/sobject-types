/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PendingOrderSummaryChangeEvent extends SObject {
	public static SObjectType$<PendingOrderSummaryChangeEvent> SObjectType;
	public static SObjectFields$<PendingOrderSummaryChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id BillToContactId;
	public Contact BillToContact;
	public String BillingEmailAddress;
	public String BillingPhoneNumber;
	public Object ChangeEventHeader;
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
	public String ProcessingInstructions;
	public String ReplayId;
	public Id SalesStoreId;
	public WebStore SalesStore;
	public String ShopperName;

	public PendingOrderSummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PendingOrderSummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PendingOrderSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PendingOrderSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PendingOrderSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
