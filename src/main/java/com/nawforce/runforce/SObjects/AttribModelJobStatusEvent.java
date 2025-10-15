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
public class AttribModelJobStatusEvent extends SObject {
	public static SObjectType$<AttribModelJobStatusEvent> SObjectType;
	public static SObjectFields$<AttribModelJobStatusEvent> Fields;

	public String AttribModel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataSpaceName;
	public String ErrorCode;
	public String ErrorMessage;
	public Datetime EventPublishTime;
	public String EventUuid;
	public String LastJobExecution;
	public Datetime LastSuccessfulRefresh;
	public String LatestRefreshedStatus;
	public Datetime RefreshCompleteDateTime;
	public Datetime RefreshStartDateTime;
	public String ReplayId;

	public AttribModelJobStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AttribModelJobStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelJobStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelJobStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AttribModelJobStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
