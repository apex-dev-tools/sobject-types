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
public class ProcessInstanceNode extends SObject {
	public static SObjectType$<ProcessInstanceNode> SObjectType;
	public static SObjectFields$<ProcessInstanceNode> Fields;

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
	public String NodeStatus;
	public Id ProcessInstanceId;
	public ProcessInstance ProcessInstance;
	public Id ProcessNodeId;
	public ProcessNode ProcessNode;
	public String ProcessNodeName;
	public Datetime SystemModstamp;

	public ProcessInstanceNode clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceNode clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceNode clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceNode clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceNode clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
