/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WebStoreInventorySource extends SObject {
	public static SObjectType$<WebStoreInventorySource> SObjectType;
	public static SObjectFields$<WebStoreInventorySource> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Integer InventoryCacheTtl;
	public String InventoryDimension;
	public Boolean IsBopisEnabled;
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
