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
public class PricebookEntry extends SObject {
	public static SObjectType$<PricebookEntry> SObjectType;
	public static SObjectFields$<PricebookEntry> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsArchived;
	public Boolean IsDeleted;
	public Boolean IsDerived;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public Id Product2Id;
	public Product2 Product2;
	public String ProductCode;
	public Id ProductSellingModelId;
	public ProductSellingModel ProductSellingModel;
	public Datetime SystemModstamp;
	public Decimal UnitPrice;
	public Boolean UseStandardPrice;

	public ContractLineItem[] ContractLineItems;
	public PricebookEntryHistory[] Histories;
	public OpportunityLineItem[] OpportunityLineItems;
	public OrderItem[] OrderItems;
	public TransactionUsageEntitlement[] PBE_TransactionUsageEntitlements;
	public PriceBookEntryDerivedPrice[] PriceBookEntryDerivedPrices;
	public UsageEntitlementAccount[] PricebookEntry_UsageEntitlementAccounts;
	public ProductConsumed[] ProductsConsumed;
	public QuoteLineItem[] QuoteLineItems;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public WorkOrderLineItem[] WorkOrderLineItems;

	public PricebookEntry clone$() {throw new java.lang.UnsupportedOperationException();}
	public PricebookEntry clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PricebookEntry clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PricebookEntry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PricebookEntry clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
