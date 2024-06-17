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
public class WebStore extends SObject {
	public static SObjectType$<WebStore> SObjectType;
	public static SObjectFields$<WebStore> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefaultTaxLocaleType;
	public String ExternalReference;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Boolean OptionsCartAsyncProcessingEnabled;
	public Boolean OptionsDuplicateCartItemsEnabled;
	public Boolean OptionsGuestBrowsingEnabled;
	public Boolean OptionsGuestCartEnabled;
	public Boolean OptionsGuestCheckoutEnabled;
	public Boolean OptionsPreserveGuestCartEnabled;
	public Boolean OptionsSkuDetectionEnabled;
	public Boolean OptionsSplitShipmentEnabled;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;
	public String Type;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public PendingOrderSummary[] PendingOrderSummaries;
	public ProcessException[] ProcessExceptions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PromotionSegmentSalesStore[] PromotionSegmentSalesStores;
	public WebStoreShare[] Shares;
	public WebStoreBuyerGroup[] WebStoreBuyerGroups;
	public WebStoreCatalog[] WebStoreCatalogs;
	public WebStoreInventorySource[] WebStoreInventorySources;

	public WebStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebStore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebStore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
