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
public class DataObjectMetadataChgEvent extends SObject {
	public static SObjectType$<DataObjectMetadataChgEvent> SObjectType;
	public static SObjectFields$<DataObjectMetadataChgEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrentValue;
	public Datetime EventCreationDate;
	public Datetime EventPublishDate;
	public String EventType;
	public String EventUuid;
	public String PreviousValue;
	public String ReplayId;
	public String SchemaVersion;
	public String SourceTableDeveloperName;
	public String Trigger;

	public DataObjectMetadataChgEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataObjectMetadataChgEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataObjectMetadataChgEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataObjectMetadataChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataObjectMetadataChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
