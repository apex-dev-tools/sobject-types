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
public class DataObjectDataChgEvent extends SObject {
	public static SObjectType$<DataObjectDataChgEvent> SObjectType;
	public static SObjectFields$<DataObjectDataChgEvent> Fields;

	public String ActionDeveloperName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EventCreationDateTime;
	public String EventPrompt;
	public Datetime EventPublishDateTime;
	public String EventSchemaVersion;
	public String EventType;
	public String EventUuid;
	public String Offset;
	public String PayloadCurrentValue;
	public String PayloadMetadata;
	public String PayloadPrevValue;
	public String PayloadSchema;
	public String ReplayId;
	public String SourceObjectDeveloperName;

	public DataObjectDataChgEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataObjectDataChgEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataObjectDataChgEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataObjectDataChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataObjectDataChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
