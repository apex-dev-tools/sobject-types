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
public class CuratedExpPlanEvent extends SObject {
	public static SObjectType$<CuratedExpPlanEvent> SObjectType;
	public static SObjectFields$<CuratedExpPlanEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String JobDetails;
	public String PlanName;
	public String PlanStatus;
	public String ReplayId;

	public CuratedExpPlanEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CuratedExpPlanEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CuratedExpPlanEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CuratedExpPlanEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CuratedExpPlanEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
