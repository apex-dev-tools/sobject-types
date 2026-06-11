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
public class DataActionJobStatusEvent extends SObject {
	public static SObjectType$<DataActionJobStatusEvent> SObjectType;
	public static SObjectFields$<DataActionJobStatusEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataActionApiName;
	public Datetime EndExecutionTime;
	public Datetime EventPublishDate;
	public String EventType;
	public String EventUuid;
	public String ExecutionDetails;
	public String ExternalRequestName;
	public Long FailedRecordCount;
	public String FailedRecords;
	public String JobIdentifier;
	public String JobStatus;
	public String JobType;
	public String ProcessName;
	public Long ProcessedRecordCount;
	public String ReplayId;
	public String RequestSource;
	public String SchemaVersion;
	public Long SkippedRecordsCount;
	public Datetime StartExecutionTime;
	public Long UpdatedRecordCount;

	public DataActionJobStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataActionJobStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataActionJobStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataActionJobStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataActionJobStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
