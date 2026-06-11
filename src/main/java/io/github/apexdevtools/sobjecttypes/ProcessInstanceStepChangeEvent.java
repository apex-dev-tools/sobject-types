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
public class ProcessInstanceStepChangeEvent extends SObject {
	public static SObjectType$<ProcessInstanceStepChangeEvent> SObjectType;
	public static SObjectFields$<ProcessInstanceStepChangeEvent> Fields;

	public Id ActorId;
	public SObject Actor;
	public Object ChangeEventHeader;
	public String Comments;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal ElapsedTimeInDays;
	public Id Id;
	public Id OriginalActorId;
	public SObject OriginalActor;
	public Id ProcessInstanceId;
	public ProcessInstance ProcessInstance;
	public String ReplayId;
	public Id StepNodeId;
	public ProcessNode StepNode;
	public String StepStatus;

	public ProcessInstanceStepChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceStepChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceStepChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceStepChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceStepChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
