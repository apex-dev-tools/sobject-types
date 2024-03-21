/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class BillSchdCreatedEventDetail extends SObject {
	public static SObjectType$<BillSchdCreatedEventDetail> SObjectType;
	public static SObjectFields$<BillSchdCreatedEventDetail> Fields;

	public Id BillingScheduleId;
	public String ErrorCode;
	public String ErrorMessage;
	public String EventUuid;
	public Boolean IsSuccess;
	public Id OrderItemId;
	public OrderItem OrderItem;

	public BillSchdCreatedEventDetail clone$() {throw new java.lang.UnsupportedOperationException();}
	public BillSchdCreatedEventDetail clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BillSchdCreatedEventDetail clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BillSchdCreatedEventDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BillSchdCreatedEventDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
