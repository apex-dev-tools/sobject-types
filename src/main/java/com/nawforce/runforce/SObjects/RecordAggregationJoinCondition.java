/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
