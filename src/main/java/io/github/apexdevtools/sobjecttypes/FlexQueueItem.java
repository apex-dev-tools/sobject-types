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
public class FlexQueueItem extends SObject {
	public static SObjectType$<FlexQueueItem> SObjectType;
	public static SObjectFields$<FlexQueueItem> Fields;

	public Id AsyncApexJobId;
	public AsyncApexJob AsyncApexJob;
	public String FlexQueueItemId;
	public Id Id;
	public Integer JobPosition;
	public String JobType;

	public FlexQueueItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlexQueueItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlexQueueItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlexQueueItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlexQueueItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
