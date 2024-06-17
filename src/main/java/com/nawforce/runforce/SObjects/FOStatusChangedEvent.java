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
public class FOStatusChangedEvent extends SObject {
	public static SObjectType$<FOStatusChangedEvent> SObjectType;
	public static SObjectFields$<FOStatusChangedEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public Id FulfillmentOrderId;
	public FulfillmentOrder FulfillmentOrder;
	public String NewStatus;
	public String NewStatusCategory;
	public String OldStatus;
	public String OldStatusCategory;
	public String ReplayId;

	public FOStatusChangedEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FOStatusChangedEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FOStatusChangedEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FOStatusChangedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FOStatusChangedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
