/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
