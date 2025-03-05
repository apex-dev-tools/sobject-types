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
