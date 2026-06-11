/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SrcPredJobStatusChgEvent extends SObject {
	public static SObjectType$<SrcPredJobStatusChgEvent> SObjectType;
	public static SObjectFields$<SrcPredJobStatusChgEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorCode;
	public Datetime EventCreationDate;
	public Datetime EventPublishDate;
	public String EventType;
	public String EventUuid;
	public Datetime LastRefreshDate;
	public String LastRunStatus;
	public Datetime LastRunTime;
	public String OutputDloName;
	public String PredictionApiName;
	public String ReplayId;
	public Long RowsProcessed;
	public Long RowsUpdated;
	public String SchemaVersion;

	public SrcPredJobStatusChgEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SrcPredJobStatusChgEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SrcPredJobStatusChgEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SrcPredJobStatusChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SrcPredJobStatusChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
