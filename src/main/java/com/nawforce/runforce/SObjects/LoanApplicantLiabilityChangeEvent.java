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
public class LoanApplicantLiabilityChangeEvent extends SObject {
	public static SObjectType$<LoanApplicantLiabilityChangeEvent> SObjectType;
	public static SObjectFields$<LoanApplicantLiabilityChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoanApplicantId;
	public LoanApplicant LoanApplicant;
	public Id LoanApplicationLiabilityId;
	public LoanApplicationLiability LoanApplicationLiability;
	public String Name;
	public String ReplayId;
	public String Role;

	public LoanApplicantLiabilityChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantLiabilityChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantLiabilityChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantLiabilityChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoanApplicantLiabilityChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
