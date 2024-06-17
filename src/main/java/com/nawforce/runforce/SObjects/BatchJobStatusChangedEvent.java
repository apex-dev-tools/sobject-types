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
public class BatchJobStatusChangedEvent extends SObject {
	public static SObjectType$<BatchJobStatusChangedEvent> SObjectType;
	public static SObjectFields$<BatchJobStatusChangedEvent> Fields;

	public String BatchJob;
	public String BatchJobDefinition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EndDateTime;
	public String EventUuid;
	public String ReplayId;
	public Datetime StartDateTime;
	public String Status;

	public BatchJobStatusChangedEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BatchJobStatusChangedEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BatchJobStatusChangedEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BatchJobStatusChangedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BatchJobStatusChangedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
