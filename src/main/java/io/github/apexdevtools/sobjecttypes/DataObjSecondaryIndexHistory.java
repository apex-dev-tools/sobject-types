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
public class DataObjSecondaryIndexHistory extends SObject {
	public static SObjectType$<DataObjSecondaryIndexHistory> SObjectType;
	public static SObjectFields$<DataObjSecondaryIndexHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DataObjSecondaryIndexId;
	public DataObjSecondaryIndex DataObjSecondaryIndex;
	public String DataType;
	public String Division;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;

	public DataObjSecondaryIndexHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataObjSecondaryIndexHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataObjSecondaryIndexHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataObjSecondaryIndexHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataObjSecondaryIndexHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
