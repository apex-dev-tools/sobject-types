/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PersnlBatchDcsnJobStatusEvent extends SObject {
	public static SObjectType$<PersnlBatchDcsnJobStatusEvent> SObjectType;
	public static SObjectFields$<PersnlBatchDcsnJobStatusEvent> Fields;

	public Long AudienceSize;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Long DecisionsMade;
	public String ErrorCode;
	public String ErrorMessage;
	public Datetime EventPublishTime;
	public String EventUuid;
	public String LastJobExecution;
	public Datetime LastSuccessfulRefresh;
	public String LatestRefreshedStatus;
	public String PersnlBatchDecision;
	public Datetime RefreshCompleteDateTime;
	public String RefreshMode;
	public Datetime RefreshStartDateTime;
	public String ReplayId;

	public PersnlBatchDcsnJobStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDcsnJobStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDcsnJobStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDcsnJobStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDcsnJobStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
