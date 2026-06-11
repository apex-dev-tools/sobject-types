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
public class MktDataTransformEvent extends SObject {
	public static SObjectType$<MktDataTransformEvent> SObjectType;
	public static SObjectFields$<MktDataTransformEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataLakeObjectDevName;
	public String DataTransformDevName;
	public String DataTransformType;
	public String ErrorCode;
	public Datetime EventCreationDate;
	public Datetime EventPublishDate;
	public String EventType;
	public String EventUuid;
	public String LastRunStatus;
	public Datetime LastRunTime;
	public String NodeUpdates;
	public String ReplayId;
	public String SchemaVersion;
	public String Tags;
	public Long TotalRecords;

	public MktDataTransformEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MktDataTransformEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MktDataTransformEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MktDataTransformEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MktDataTransformEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
