/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class InsuranceContractHistory extends SObject {
	public static SObjectType$<InsuranceContractHistory> SObjectType;
	public static SObjectFields$<InsuranceContractHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Field;
	public Id Id;
	public Id InsuranceContractId;
	public InsuranceContract InsuranceContract;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;

	public InsuranceContractHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InsuranceContractHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}