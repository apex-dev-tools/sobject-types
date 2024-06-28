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
public class EmpBenefitSummaryHistory extends SObject {
	public static SObjectType$<EmpBenefitSummaryHistory> SObjectType;
	public static SObjectFields$<EmpBenefitSummaryHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public Id EmpBenefitSummaryId;
	public EmpBenefitSummary EmpBenefitSummary;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;

	public EmpBenefitSummaryHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmpBenefitSummaryHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmpBenefitSummaryHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmpBenefitSummaryHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmpBenefitSummaryHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
