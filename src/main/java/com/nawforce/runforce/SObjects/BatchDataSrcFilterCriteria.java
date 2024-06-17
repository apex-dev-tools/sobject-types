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
public class BatchDataSrcFilterCriteria extends SObject {
	public static SObjectType$<BatchDataSrcFilterCriteria> SObjectType;
	public static SObjectFields$<BatchDataSrcFilterCriteria> Fields;

	public Id BatchDataSourceId;
	public BatchDataSource BatchDataSource;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DynamicValueType;
	public String FieldName;
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
