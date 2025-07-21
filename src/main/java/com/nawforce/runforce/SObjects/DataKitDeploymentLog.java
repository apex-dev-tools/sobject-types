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
public class DataKitDeploymentLog extends SObject {
	public static SObjectType$<DataKitDeploymentLog> SObjectType;
	public static SObjectFields$<DataKitDeploymentLog> Fields;

	public String BundleName;
	public String ComponentName;
	public Id ComponentTemplateId;
	public DataSourceBundle ComponentTemplate;
	public String ComponentType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataKitName;
	public String DataPackageKitDefinition;
	public String DataSpaceName;
	public String DeployJob;
	public String DeploymentAction;
	public String DeploymentError;
	public String DeploymentStatus;
	public String FileBasedComponentTemplate;
	public String FlowInterviewIdentifier;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PublisherOrgComponentId;
	public Name PublisherOrgComponent;
	public Id SubscriberOrgComponentId;
	public Name SubscriberOrgComponent;
	public Datetime SystemModstamp;
	public Integer TemplateVersion;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public DataKitDeploymentLogShare[] Shares;

	public DataKitDeploymentLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataKitDeploymentLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataKitDeploymentLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataKitDeploymentLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataKitDeploymentLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
