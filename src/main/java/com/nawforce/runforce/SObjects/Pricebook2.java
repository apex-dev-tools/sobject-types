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
public class Pricebook2 extends SObject {
	public static SObjectType$<Pricebook2> SObjectType;
	public static SObjectFields$<Pricebook2> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsArchived;
	public Boolean IsDeleted;
	public Boolean IsStandard;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime SystemModstamp;

	public AssetWarranty[] AssetWarrantyPricebooks;
	public Contract[] Contracts;
	public Pricebook2History[] Histories;
	public Opportunity[] Opportunities;
	public Order[] Orders;
	public WarrantyTerm[] Pricebook2;
	public PricebookEntry[] PricebookEntries;
	public Quote[] Quotes;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ServiceContract[] ServiceContracts;
	public WorkOrder[] WorkOrders;

	public Pricebook2 clone$() {throw new java.lang.UnsupportedOperationException();}
	public Pricebook2 clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Pricebook2 clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Pricebook2 clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Pricebook2 clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
