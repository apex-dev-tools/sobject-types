/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class RecordAggregationObjectFilter extends SObject {
	public static SObjectType$<RecordAggregationObjectFilter> SObjectType;
	public static SObjectFields$<RecordAggregationObjectFilter> Fields;

	public String AssociatedObjectField;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Operator;
	public Id RecordAggregationObjectId;
	public RecordAggregationObject RecordAggregationObject;
	public Integer SequenceNumber;
	public Datetime SystemModstamp;
	public String Value;

	public RecordAggregationObjectFilter clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationObjectFilter clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationObjectFilter clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationObjectFilter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationObjectFilter clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
