/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AIWorksheetColProcEvent extends SObject {
	public static SObjectType$<AIWorksheetColProcEvent> SObjectType;
	public static SObjectFields$<AIWorksheetColProcEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String ReplayId;
	public String Status;
	public Datetime Timestamp;
	public String Worksheet;
	public String WorksheetColumn;

	public AIWorksheetColProcEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AIWorksheetColProcEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AIWorksheetColProcEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AIWorksheetColProcEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AIWorksheetColProcEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
