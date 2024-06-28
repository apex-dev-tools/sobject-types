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
