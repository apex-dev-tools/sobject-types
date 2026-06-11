/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class QuoteLineItem extends SObject {
	public static SObjectType$<QuoteLineItem> SObjectType;
	public static SObjectFields$<QuoteLineItem> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal Discount;
	public Boolean HasQuantitySchedule;
	public Boolean HasRevenueSchedule;
	public Boolean HasSchedule;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LineNumber;
	public Decimal ListPrice;
	public Id OpportunityLineItemId;
	public OpportunityLineItem OpportunityLineItem;
	public Id PricebookEntryId;
	public PricebookEntry PricebookEntry;
	public Id Product2Id;
	public Product2 Product2;
	public Decimal Quantity;
	public Id QuoteId;
	public Quote Quote;
	public Date ServiceDate;
	public Integer SortOrder;
	public Decimal Subtotal;
	public Datetime SystemModstamp;
	public Decimal TotalPrice;
	public Decimal UnitPrice;

	public OrderItem[] OrderItems;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;

	public QuoteLineItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public QuoteLineItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public QuoteLineItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public QuoteLineItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public QuoteLineItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
