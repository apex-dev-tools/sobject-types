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
public class WebStoreInventorySource extends SObject {
	public static SObjectType$<WebStoreInventorySource> SObjectType;
	public static SObjectFields$<WebStoreInventorySource> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Boolean DoesAllowGuestInventoryLevel;
	public Id Id;
	public Integer InventoryCacheTtl;
	public String InventoryDimension;
	public Boolean IsBopisEnabled;
	public Boolean IsChkInvOnActiveCartEnabled;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LocationSourceExtRef;
	public Id LocationSourceId;
	public Name LocationSource;
	public String Name;
	public Integer ReservationDurationInSeconds;
	public Datetime SystemModstamp;
	public Id WebStoreId;
	public WebStore WebStore;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public WebStoreInventorySource clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebStoreInventorySource clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebStoreInventorySource clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebStoreInventorySource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebStoreInventorySource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
