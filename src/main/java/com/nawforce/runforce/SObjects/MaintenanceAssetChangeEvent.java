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
public class MaintenanceAssetChangeEvent extends SObject {
	public static SObjectType$<MaintenanceAssetChangeEvent> SObjectType;
	public static SObjectFields$<MaintenanceAssetChangeEvent> Fields;

	public Id AssetId;
	public Asset Asset;
	public Object ChangeEventHeader;
	public Id ContractLineItemId;
	public ContractLineItem ContractLineItem;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MaintenanceAssetNumber;
	public Id MaintenancePlanId;
	public MaintenancePlan MaintenancePlan;
	public Date NextSuggestedMaintenanceDate;
	public String ReplayId;
	public Id WorkTypeId;
	public WorkType WorkType;

	public MaintenanceAssetChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceAssetChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceAssetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceAssetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MaintenanceAssetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
