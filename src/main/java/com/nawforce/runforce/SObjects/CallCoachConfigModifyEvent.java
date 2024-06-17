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
public class CallCoachConfigModifyEvent extends SObject {
	public static SObjectType$<CallCoachConfigModifyEvent> SObjectType;
	public static SObjectFields$<CallCoachConfigModifyEvent> Fields;

	public String ChangeType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String OrganizationId;
	public String ProviderIdChange;
	public String ReplayId;

	public CallCoachConfigModifyEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CallCoachConfigModifyEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CallCoachConfigModifyEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CallCoachConfigModifyEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CallCoachConfigModifyEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
