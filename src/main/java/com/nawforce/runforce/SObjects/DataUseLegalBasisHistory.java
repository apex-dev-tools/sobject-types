/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DataUseLegalBasisHistory extends SObject {
	public static SObjectType$<DataUseLegalBasisHistory> SObjectType;
	public static SObjectFields$<DataUseLegalBasisHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public Id DataUseLegalBasisId;
	public DataUseLegalBasis DataUseLegalBasis;
	public String Division;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;

	public DataUseLegalBasisHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataUseLegalBasisHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataUseLegalBasisHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataUseLegalBasisHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataUseLegalBasisHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
