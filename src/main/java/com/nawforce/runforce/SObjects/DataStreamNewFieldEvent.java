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
public class DataStreamNewFieldEvent extends SObject {
	public static SObjectType$<DataStreamNewFieldEvent> SObjectType;
	public static SObjectFields$<DataStreamNewFieldEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataStreamExternalId;
	public Datetime EventCreationDate;
	public Datetime EventPublishDate;
	public String EventType;
	public String EventUuid;
	public Long NewFieldsCount;
	public String ReplayId;
	public String SchemaVersion;

	public DataStreamNewFieldEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataStreamNewFieldEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataStreamNewFieldEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataStreamNewFieldEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataStreamNewFieldEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
