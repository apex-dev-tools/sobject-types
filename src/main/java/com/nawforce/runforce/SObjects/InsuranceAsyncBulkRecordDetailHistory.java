/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class InsuranceAsyncBulkRecordDetailHistory extends SObject {
	public static SObjectType$<InsuranceAsyncBulkRecordDetailHistory> SObjectType;
	public static SObjectFields$<InsuranceAsyncBulkRecordDetailHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public String Field;
	public Id Id;
	public Id InsuranceAsyncBulkRecordDetailId;
	public InsuranceAsyncBulkRecordDetail InsuranceAsyncBulkRecordDetail;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;

	public InsuranceAsyncBulkRecordDetailHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsuranceAsyncBulkRecordDetailHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceAsyncBulkRecordDetailHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceAsyncBulkRecordDetailHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceAsyncBulkRecordDetailHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
