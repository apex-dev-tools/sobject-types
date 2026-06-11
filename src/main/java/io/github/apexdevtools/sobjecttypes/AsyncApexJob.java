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
