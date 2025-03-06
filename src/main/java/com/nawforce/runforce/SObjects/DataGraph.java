/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DataGraph extends SObject {
	public static SObjectType$<DataGraph> SObjectType;
	public static SObjectFields$<DataGraph> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer DaoFieldsCount;
	public String DataGraphApiName;
	public String DataGraphType;
	public Integer DataSourceObjCount;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String FullRefreshConfig;
	public Id Id;
	public String IncrementalRefreshConfig;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastRefreshDate;
	public String LastRunStatus;
	public Datetime LastViewedDate;
	public Integer Levels;
	public String Name;
	public String PrimaryDmo;
	public Long RecordCount;
	public String RolloutVersion;
	public String Schedule;
	public String Status;
	public Datetime SystemModstamp;
	public String Version;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public DataGraph clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataGraph clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataGraph clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataGraph clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataGraph clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
