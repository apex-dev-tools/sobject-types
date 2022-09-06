/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ProcessInstanceWorkitem extends SObject {
	public static SObjectType$<ProcessInstanceWorkitem> SObjectType;
	public static SObjectFields$<ProcessInstanceWorkitem> Fields;

	public Id ActorId;
	public Name Actor;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal ElapsedTimeInDays;
	public Decimal ElapsedTimeInHours;
	public Decimal ElapsedTimeInMinutes;
	public Id Id;
	public Boolean IsDeleted;
	public Id OriginalActorId;
	public Name OriginalActor;
	public Id ProcessInstanceId;
	public ProcessInstance ProcessInstance;
	public Datetime SystemModstamp;

	public ProcessInstanceWorkitem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceWorkitem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceWorkitem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceWorkitem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcessInstanceWorkitem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
