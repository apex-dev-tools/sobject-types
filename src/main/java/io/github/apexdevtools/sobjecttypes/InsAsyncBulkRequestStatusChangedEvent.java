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
public class InsAsyncBulkRequestStatusChangedEvent extends SObject {
	public static SObjectType$<InsAsyncBulkRequestStatusChangedEvent> SObjectType;
	public static SObjectFields$<InsAsyncBulkRequestStatusChangedEvent> Fields;

	public String ConsumerType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String InsuranceAsyncBulkRequest;
	public String ReplayId;
	public String Status;
	public String Type;

	public InsAsyncBulkRequestStatusChangedEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsAsyncBulkRequestStatusChangedEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsAsyncBulkRequestStatusChangedEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsAsyncBulkRequestStatusChangedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsAsyncBulkRequestStatusChangedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
