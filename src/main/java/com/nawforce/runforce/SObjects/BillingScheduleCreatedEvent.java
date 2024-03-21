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
public class BillingScheduleCreatedEvent extends SObject {
	public static SObjectType$<BillingScheduleCreatedEvent> SObjectType;
	public static SObjectFields$<BillingScheduleCreatedEvent> Fields;

	public BillSchdCreatedEventDetail[] BillSchdCreatedEventDetail;
	public String CorrelationIdentifier;
	public String EventUuid;
	public String ReplayId;
	public String RequestIdentifier;

	public BillingScheduleCreatedEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BillingScheduleCreatedEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BillingScheduleCreatedEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BillingScheduleCreatedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BillingScheduleCreatedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
