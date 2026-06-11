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
public class AIUpdateRecordEvent extends SObject {
	public static SObjectType$<AIUpdateRecordEvent> SObjectType;
	public static SObjectFields$<AIUpdateRecordEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorCode;
	public String ErrorMessage;
	public String EventUuid;
	public Boolean IsUpdated;
	public String RecordId;
	public String ReplayId;
	public Object UpdatedFields;

	public AIUpdateRecordEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AIUpdateRecordEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AIUpdateRecordEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AIUpdateRecordEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AIUpdateRecordEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
