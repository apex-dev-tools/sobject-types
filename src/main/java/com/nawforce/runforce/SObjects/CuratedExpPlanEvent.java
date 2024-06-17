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
