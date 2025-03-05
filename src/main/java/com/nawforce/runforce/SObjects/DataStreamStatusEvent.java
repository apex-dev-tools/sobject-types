/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
