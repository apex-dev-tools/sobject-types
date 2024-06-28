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
public class LoanApplicantHistory extends SObject {
	public static SObjectType$<LoanApplicantHistory> SObjectType;
	public static SObjectFields$<LoanApplicantHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Id LoanApplicantId;
	public LoanApplicant LoanApplicant;
	public Object NewValue;
	public Object OldValue;

	public LoanApplicantHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
