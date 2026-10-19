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
public class WebCartFailedEvent extends SObject {
	public static SObjectType$<WebCartFailedEvent> SObjectType;
	public static SObjectFields$<WebCartFailedEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String FailureReason;
	public String FailureSubStatus;
	public String ReplayId;
	public String UserLocale;
	public Id WebCartId;
	public WebCart WebCart;

	public WebCartFailedEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebCartFailedEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebCartFailedEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebCartFailedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebCartFailedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
