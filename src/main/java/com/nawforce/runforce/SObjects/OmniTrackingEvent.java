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
