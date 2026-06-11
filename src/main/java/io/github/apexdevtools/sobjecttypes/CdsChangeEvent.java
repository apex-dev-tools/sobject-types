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
public class CdsChangeEvent extends SObject {
	public static SObjectType$<CdsChangeEvent> SObjectType;
	public static SObjectFields$<CdsChangeEvent> Fields;

	public String Action;
	public Id AsyncOperationLogId;
	public AsyncOperationLog AsyncOperationLog;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Data;
	public String EntityType;
	public String EventUuid;
	public String ReplayId;
	public String SyncType;

	public CdsChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CdsChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CdsChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CdsChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CdsChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
