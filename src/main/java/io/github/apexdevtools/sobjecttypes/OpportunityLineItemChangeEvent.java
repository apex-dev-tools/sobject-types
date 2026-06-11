/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class OpportunityLineItemChangeEvent extends SObject {
	public static SObjectType$<OpportunityLineItemChangeEvent> SObjectType;
	public static SObjectFields$<OpportunityLineItemChangeEvent> Fields;

	public Boolean CanUseQuantitySchedule;
	public Boolean CanUseRevenueSchedule;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Decimal Discount;
	public Boolean HasQuantitySchedule;
	public Boolean HasRevenueSchedule;
	public Boolean HasSchedule;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal ListPrice;
	public String Name;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public Id PricebookEntryId;
	public PricebookEntry PricebookEntry;
	public Id Product2Id;
	public Product2 Product2;
	public String ProductCode;
	public Decimal Quantity;
	public String ReplayId;
	public Date ServiceDate;
	public Integer SortOrder;
	public Decimal Subtotal;
	public Decimal TotalPrice;
	public Decimal UnitPrice;

	public OpportunityLineItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public OpportunityLineItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
