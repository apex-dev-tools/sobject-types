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
public class CuratedExpJobEvent extends SObject {
	public static SObjectType$<CuratedExpJobEvent> SObjectType;
	public static SObjectFields$<CuratedExpJobEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String JobName;
	public String JobStatus;
	public String PlanName;
	public String ReplayId;
	public String TaskDetails;

	public CuratedExpJobEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CuratedExpJobEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CuratedExpJobEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CuratedExpJobEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CuratedExpJobEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
