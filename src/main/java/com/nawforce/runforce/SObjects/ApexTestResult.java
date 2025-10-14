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
