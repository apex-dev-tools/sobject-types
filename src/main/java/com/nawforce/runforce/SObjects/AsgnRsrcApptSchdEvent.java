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
public class AsgnRsrcApptSchdEvent extends SObject {
	public static SObjectType$<AsgnRsrcApptSchdEvent> SObjectType;
	public static SObjectFields$<AsgnRsrcApptSchdEvent> Fields;

	public String AssignedResourceId;
	public Object ChangedFields;
	public String EventUuid;
	public Boolean IsPrimaryResource;
	public Boolean IsRequiredResource;
	public String ServiceResourceId;
	public String ServiceResourceUserEmail;
	public String ServiceResourceUserId;
	public String ServiceResourceUserName;

	public AsgnRsrcApptSchdEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AsgnRsrcApptSchdEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AsgnRsrcApptSchdEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AsgnRsrcApptSchdEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AsgnRsrcApptSchdEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
