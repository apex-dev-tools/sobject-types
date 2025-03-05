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
public class DataSyncConnectorEvent extends SObject {
	public static SObjectType$<DataSyncConnectorEvent> SObjectType;
	public static SObjectFields$<DataSyncConnectorEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataSyncConnectorIdentifier;
	public String DataSyncConnectorReasonDetail;
	public String DataSyncConnectorResponseCode;
	public String DataSyncConnectorStatus;
	public String DataSyncConnectorType;
	public Datetime EventCreationDate;
	public Datetime EventPublishDate;
	public String EventType;
	public String EventUuid;
	public String ReplayId;
	public String SchemaVersion;

	public DataSyncConnectorEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataSyncConnectorEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataSyncConnectorEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataSyncConnectorEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataSyncConnectorEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
