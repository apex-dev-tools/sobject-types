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
public class OpportunityLineItem extends SObject {
	public static SObjectType$<OpportunityLineItem> SObjectType;
	public static SObjectFields$<OpportunityLineItem> Fields;

	public Boolean CanUseQuantitySchedule;
	public Boolean CanUseRevenueSchedule;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal Discount;
	public Boolean HasQuantitySchedule;
	public Boolean HasRevenueSchedule;
	public Boolean HasSchedule;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
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
	public Date ServiceDate;
	public Integer SortOrder;
	public Decimal Subtotal;
	public Datetime SystemModstamp;
	public Decimal TotalPrice;
	public Decimal UnitPrice;

	public OpportunityLineItemSchedule[] OpportunityLineItemSchedules;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;

	public OpportunityLineItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public OpportunityLineItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityLineItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityLineItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OpportunityLineItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
