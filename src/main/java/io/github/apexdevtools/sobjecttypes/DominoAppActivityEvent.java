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
public class DominoAppActivityEvent extends SObject {
	public static SObjectType$<DominoAppActivityEvent> SObjectType;
	public static SObjectFields$<DominoAppActivityEvent> Fields;

	public String Activity;
	public String ActivityStatus;
	public String ActivityType;
	public String App;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String ReplayId;

	public DominoAppActivityEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DominoAppActivityEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DominoAppActivityEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DominoAppActivityEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DominoAppActivityEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
