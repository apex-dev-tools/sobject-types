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
public class ActvTgtPlatformFieldValue extends SObject {
	public static SObjectType$<ActvTgtPlatformFieldValue> SObjectType;
	public static SObjectFields$<ActvTgtPlatformFieldValue> Fields;

	public Id ActivationTargetPlatformId;
	public ActivationTargetPlatform ActivationTargetPlatform;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String OverridenValue;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ActvTgtPlatformFieldValueHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ActvTgtPlatformFieldValueShare[] Shares;

	public ActvTgtPlatformFieldValue clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActvTgtPlatformFieldValue clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActvTgtPlatformFieldValue clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActvTgtPlatformFieldValue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActvTgtPlatformFieldValue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
