/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PrivacyJobSession extends SObject {
	public static SObjectType$<PrivacyJobSession> SObjectType;
	public static SObjectFields$<PrivacyJobSession> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime CreationDate;
	public String CurrencyIsoCode;
	public String CurrentObject;
	public Datetime EndTime;
	public String FailureLog;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPreview;
	public String JobManagementType;
	public String JobPolicyName;
	public String JobStartType;
	public String JobStatus;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Boolean OptionsAcknowledged;
	public Boolean OptionsErrorBypassOccurred;
	public Boolean OptionsPreview;
	public Boolean OptionsProcessingFailed;
	public Boolean OptionsTopLevelErrorBypass;
	public Boolean OptionsTraversalComplete;
	public Boolean OptionsTraversalFailed;
	public Id OwnerId;
	public Name Owner;
	public String PermissionSet;
	public String PolicyDescription;
	public String PolicyName;
	public String PolicyType;
	public Id PrivacyPolicyDefinitionId;
	public PrivacyPolicyDefinition PrivacyPolicyDefinition;
	public Id PrivacyRtbfRequestId;
	public PrivacyRTBFRequest PrivacyRtbfRequest;
	public Datetime ScheduledTime;
	public String SerializedPolicy;
	public Datetime StartTime;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public PrivacyObjectSession[] PrivacyJobSessionObjects;
	public PrivacyJobSessionShare[] Shares;

	public PrivacyJobSession clone$() {throw new java.lang.UnsupportedOperationException();}
	public PrivacyJobSession clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyJobSession clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyJobSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyJobSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
