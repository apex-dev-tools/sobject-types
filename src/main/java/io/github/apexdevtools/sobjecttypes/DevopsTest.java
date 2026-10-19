/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DevopsTest extends SObject {
	public static SObjectType$<DevopsTest> SObjectType;
	public static SObjectFields$<DevopsTest> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefinitionInTestProvider;
	public String Description;
	public Id DevopsPipelineId;
	public DevopsPipeline DevopsPipeline;
	public Id DevopsTestProviderId;
	public DevopsTestProvider DevopsTestProvider;
	public Id EnvironmentId;
	public DevopsEnvironment Environment;
	public String ExternalId;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsEssential;
	public String LastExecutionStatus;
	public Datetime LastExecutionTime;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String Severity;
	public String Subtype;
	public Id SyncLogId;
	public DevopsTestProviderSyncLog SyncLog;
	public Datetime SystemModstamp;
	public String TestClass;
	public String TestProviderSpecificConfig;
	public String Type;
	public String UniqueKey;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DevopsTestShare[] Shares;

	public DevopsTest clone$() {throw new java.lang.UnsupportedOperationException();}
	public DevopsTest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DevopsTest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DevopsTest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DevopsTest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
