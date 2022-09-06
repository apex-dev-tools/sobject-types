/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AsyncApexJob extends SObject {
	public static SObjectType$<AsyncApexJob> SObjectType;
	public static SObjectFields$<AsyncApexJob> Fields;

	public Id ApexClassId;
	public ApexClass ApexClass;
	public Datetime CompletedDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id CronTriggerId;
	public CronTrigger CronTrigger;
	public String ExtendedStatus;
	public Id Id;
	public Integer JobItemsProcessed;
	public String JobType;
	public String LastProcessed;
	public Integer LastProcessedOffset;
	public String MethodName;
	public Integer NumberOfErrors;
	public Id ParentJobId;
	public AsyncApexJob ParentJob;
	public String Status;
	public Integer TotalJobItems;

	public ApexTestRunResult[] AsyncApex;

	public AsyncApexJob clone$() {throw new java.lang.UnsupportedOperationException();}
	public AsyncApexJob clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AsyncApexJob clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AsyncApexJob clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AsyncApexJob clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
