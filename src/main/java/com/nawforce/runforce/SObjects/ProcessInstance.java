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
public class ProcessInstance extends SObject {
	public static SObjectType$<ProcessInstance> SObjectType;
	public static SObjectFields$<ProcessInstance> Fields;

	public Datetime CompletedDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal ElapsedTimeInDays;
	public Decimal ElapsedTimeInHours;
	public Decimal ElapsedTimeInMinutes;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastActorId;
	public User LastActor;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ProcessDefinitionId;
	public ProcessDefinition ProcessDefinition;
	public String Status;
	public Id SubmittedById;
	public User SubmittedBy;
	public Datetime SystemModstamp;
	public Id TargetObjectId;
	public Name TargetObject;

	public ProcessInstanceNode[] Nodes;
	public ProcessInstanceStep[] Steps;
	public ProcessInstanceHistory[] StepsAndWorkitems;
	public ProcessInstanceWorkitem[] Workitems;

	public ProcessInstance clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstance clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstance clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstance clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
