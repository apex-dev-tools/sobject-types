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
public class OmniTrackingEvent extends SObject {
	public static SObjectType$<OmniTrackingEvent> SObjectType;
	public static SObjectFields$<OmniTrackingEvent> Fields;

	public String ActionContainerName;
	public String ComponentType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventName;
	public String EventPayload;
	public String EventUuid;
	public String ReplayId;
	public Datetime Timestamp;
	public String TrackingCategory;
	public String TrackingGroup;

	public OmniTrackingEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniTrackingEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniTrackingEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniTrackingEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniTrackingEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
