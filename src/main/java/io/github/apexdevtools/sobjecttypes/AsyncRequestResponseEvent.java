/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AsyncRequestResponseEvent extends SObject {
	public static SObjectType$<AsyncRequestResponseEvent> SObjectType;
	public static SObjectFields$<AsyncRequestResponseEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String ReplayId;
	public String RequestGuid;
	public String ResponsePayload;

	public AsyncRequestResponseEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AsyncRequestResponseEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AsyncRequestResponseEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AsyncRequestResponseEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AsyncRequestResponseEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
