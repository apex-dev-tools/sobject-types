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
public class RecordAggregationObject extends SObject {
	public static SObjectType$<RecordAggregationObject> SObjectType;
	public static SObjectFields$<RecordAggregationObject> Fields;

	public String AssociatedObject;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String FilterLogic;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Id RecordAggregationDefinitionId;
	public RecordAggregationDefinition RecordAggregationDefinition;
	public Datetime SystemModstamp;

	public RecordAggregationObjectFilter[] RecordAggregationObjectFilters;
	public RecordAggregationJoinCondition[] RecordAggregationObjectForJoinConditions;
	public RecordAggregationJoinCondition[] RelatedRecordAggrObjectForJoinConditions;

	public RecordAggregationObject clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationObject clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationObject clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationObject clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecordAggregationObject clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
