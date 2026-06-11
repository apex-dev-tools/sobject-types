/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
