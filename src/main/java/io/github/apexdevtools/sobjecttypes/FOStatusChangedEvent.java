/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
