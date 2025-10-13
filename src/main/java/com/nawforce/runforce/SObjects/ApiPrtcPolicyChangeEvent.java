/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ApiPrtcPolicyChangeEvent extends SObject {
	public static SObjectType$<ApiPrtcPolicyChangeEvent> SObjectType;
	public static SObjectFields$<ApiPrtcPolicyChangeEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String ReplayId;
	public String Source;
	public String Target;

	public ApiPrtcPolicyChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApiPrtcPolicyChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApiPrtcPolicyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApiPrtcPolicyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApiPrtcPolicyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
