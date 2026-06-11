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
public class DataStreamStatusEvent extends SObject {
	public static SObjectType$<DataStreamStatusEvent> SObjectType;
	public static SObjectFields$<DataStreamStatusEvent> Fields;

	public Datetime CdpEventPublishDate;
	public String CdpEventType;
	public String CdpSchemaVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataStreamStatus;
	public String DatastreamId;
	public Datetime EventCreationDate;
	public String EventUuid;
	public String LastRunStatus;
	public Long ProblemRecordsAdded;
	public String ReplayId;
	public Long RowsAdded;
	public Datetime StartExecutionTime;
	public String StatusReason;
	public Long TotalProblemRecords;
	public Long TotalRecords;
	public Long TotalRowsProcessed;

	public DataStreamStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataStreamStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataStreamStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataStreamStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataStreamStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
