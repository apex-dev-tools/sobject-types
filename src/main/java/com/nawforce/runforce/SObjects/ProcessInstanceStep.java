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
public class ProcessInstanceStep extends SObject {
	public static SObjectType$<ProcessInstanceStep> SObjectType;
	public static SObjectFields$<ProcessInstanceStep> Fields;

	public Id ActorId;
	public Name Actor;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal ElapsedTimeInDays;
	public Decimal ElapsedTimeInHours;
	public Decimal ElapsedTimeInMinutes;
	public Id Id;
	public Id OriginalActorId;
	public Name OriginalActor;
	public Id ProcessInstanceId;
	public ProcessInstance ProcessInstance;
	public Id StepNodeId;
	public ProcessNode StepNode;
	public String StepStatus;
	public Datetime SystemModstamp;

	public ProcessInstanceStep clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceStep clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceStep clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceStep clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceStep clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
