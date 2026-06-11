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
public class BatchDataSrcFilterCriteria extends SObject {
	public static SObjectType$<BatchDataSrcFilterCriteria> SObjectType;
	public static SObjectFields$<BatchDataSrcFilterCriteria> Fields;

	public Id BatchDataSourceId;
	public BatchDataSource BatchDataSource;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DomainObjectName;
	public String DynamicValueType;
	public String FieldName;
	public String FieldPath;
	public String FieldValue;
	public Integer FilterCriteriaSequence;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsDynamicValue;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Operator;
	public Datetime SystemModstamp;

	public BatchDataSrcFilterCriteria clone$() {throw new java.lang.UnsupportedOperationException();}
	public BatchDataSrcFilterCriteria clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BatchDataSrcFilterCriteria clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BatchDataSrcFilterCriteria clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BatchDataSrcFilterCriteria clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
