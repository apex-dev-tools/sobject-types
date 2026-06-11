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
public class EstmtEnergyUseJobRunHistory extends SObject {
	public static SObjectType$<EstmtEnergyUseJobRunHistory> SObjectType;
	public static SObjectFields$<EstmtEnergyUseJobRunHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public Id EstmtEnergyUseJobRunId;
	public EstmtEnergyUseJobRun EstmtEnergyUseJobRun;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;

	public EstmtEnergyUseJobRunHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public EstmtEnergyUseJobRunHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EstmtEnergyUseJobRunHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EstmtEnergyUseJobRunHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EstmtEnergyUseJobRunHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
