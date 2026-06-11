/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class UserProvisioningRequest extends SObject {
	public static SObjectType$<UserProvisioningRequest> SObjectType;
	public static SObjectFields$<UserProvisioningRequest> Fields;

	public String AppName;
	public String ApprovalStatus;
	public Id ConnectedAppId;
	public ConnectedApplication ConnectedApp;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExternalUserId;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ManagerId;
	public User Manager;
	public String Name;
	public String Operation;
	public Id OwnerId;
	public Name Owner;
	public Id ParentId;
	public UserProvisioningRequest Parent;
	public Integer RetryCount;
	public Id SalesforceUserId;
	public User SalesforceUser;
	public Datetime ScheduleDate;
	public String State;
	public Datetime SystemModstamp;
	public Id UserProvAccountId;
	public UserProvAccount UserProvAccount;
	public Id UserProvConfigId;
	public UserProvisioningConfig UserProvConfig;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public UserProvisioningRequestShare[] Shares;

	public UserProvisioningRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserProvisioningRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserProvisioningRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserProvisioningRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserProvisioningRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
