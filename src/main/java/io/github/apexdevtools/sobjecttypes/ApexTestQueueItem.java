/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ApexTestQueueItem extends SObject {
	public static SObjectType$<ApexTestQueueItem> SObjectType;
	public static SObjectFields$<ApexTestQueueItem> Fields;

	public Id ApexClassId;
	public ApexClass ApexClass;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExtendedStatus;
	public Id Id;
	public Id ParentJobId;
	public AsyncApexJob ParentJob;
	public Boolean ShouldSkipCodeCoverage;
	public String Status;
	public Datetime SystemModstamp;
	public Id TestRunResultId;
	public ApexTestRunResult TestRunResult;

	public ApexTestQueueItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApexTestQueueItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApexTestQueueItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApexTestQueueItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApexTestQueueItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
