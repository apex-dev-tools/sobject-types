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
public class DevopsRequestInfoEvent extends SObject {
	public static SObjectType$<DevopsRequestInfoEvent> SObjectType;
	public static SObjectFields$<DevopsRequestInfoEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorDetails;
	public String EventContext;
	public String EventUuid;
	public String LastModifiedUser;
	public String Message;
	public String OperationType;
	public String ParentRequestInfo;
	public String ReplayId;
	public String RequestInfoName;
	public String RequestToken;
	public String Status;

	public DevopsRequestInfoEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DevopsRequestInfoEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DevopsRequestInfoEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DevopsRequestInfoEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DevopsRequestInfoEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
