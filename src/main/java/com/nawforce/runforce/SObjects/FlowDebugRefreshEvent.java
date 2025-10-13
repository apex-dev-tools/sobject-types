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
public class FlowDebugRefreshEvent extends SObject {
	public static SObjectType$<FlowDebugRefreshEvent> SObjectType;
	public static SObjectFields$<FlowDebugRefreshEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String FlowVersion;
	public String InterviewGuid;
	public String ReplayId;

	public FlowDebugRefreshEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowDebugRefreshEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowDebugRefreshEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowDebugRefreshEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowDebugRefreshEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
