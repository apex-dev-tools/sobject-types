/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
	public String ProfileIdValue;
	public String ReplayId;
	public String SourceObjectDeveloperName;
	public String TraceIdValue;
	public String TriggerEntity;

	public DataObjectDataChgEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataObjectDataChgEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataObjectDataChgEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataObjectDataChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataObjectDataChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
