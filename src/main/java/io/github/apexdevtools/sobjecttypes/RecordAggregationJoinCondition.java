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
public class RecordAggregationJoinCondition extends SObject {
	public static SObjectType$<RecordAggregationJoinCondition> SObjectType;
	public static SObjectFields$<RecordAggregationJoinCondition> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public String JoinField;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer NavigationSequenceNumber;
	public Id RecordAggregationObjectId;
	public RecordAggregationObject RecordAggregationObject;
	public String RelatedJoinField;
	public Id RelatedRecordAggrObjectId;
	public RecordAggregationObject RelatedRecordAggrObject;
	public Datetime SystemModstamp;
	public String Type;

	public RecordAggregationJoinCondition clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationJoinCondition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationJoinCondition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationJoinCondition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationJoinCondition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
