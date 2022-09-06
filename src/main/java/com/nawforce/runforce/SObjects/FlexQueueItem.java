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
