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
public class ApexTestResult extends SObject {
	public static SObjectType$<ApexTestResult> SObjectType;
	public static SObjectFields$<ApexTestResult> Fields;

	public Id ApexClassId;
	public ApexClass ApexClass;
	public Id ApexLogId;
	public ApexLog ApexLog;
	public Id ApexTestRunResultId;
	public ApexTestRunResult ApexTestRunResult;
	public Id AsyncApexJobId;
	public AsyncApexJob AsyncApexJob;
	public Id Id;
	public Boolean IsTestSetup;
	public String Message;
	public String MethodName;
	public String Outcome;
	public Id QueueItemId;
	public ApexTestQueueItem QueueItem;
	public Integer RunTime;
	public String StackTrace;
	public Datetime SystemModstamp;
	public String TestName;
	public String TestNamespace;
	public Datetime TestTimestamp;

	public ApexTestResultLimits[] ApexTestResults;

	public ApexTestResult clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApexTestResult clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApexTestResult clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApexTestResult clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApexTestResult clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
