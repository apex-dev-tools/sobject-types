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
public class DataQueryWorkspaceTab extends SObject {
	public static SObjectType$<DataQueryWorkspaceTab> SObjectType;
	public static SObjectFields$<DataQueryWorkspaceTab> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Entity;
	public String EntityType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Query;
	public Id QueryWorkspaceId;
	public DataQueryWorkspace QueryWorkspace;
	public Datetime SystemModstamp;
	public String TabOption;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DataQueryWorkspace[] QueryWorkspaces;

	public DataQueryWorkspaceTab clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataQueryWorkspaceTab clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataQueryWorkspaceTab clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataQueryWorkspaceTab clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataQueryWorkspaceTab clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
