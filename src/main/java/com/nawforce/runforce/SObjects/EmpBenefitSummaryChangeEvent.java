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
public class EmpBenefitSummaryChangeEvent extends SObject {
	public static SObjectType$<EmpBenefitSummaryChangeEvent> SObjectType;
	public static SObjectFields$<EmpBenefitSummaryChangeEvent> Fields;

	public String BenefitUsage;
	public Object ChangeEventHeader;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public String EmployeeBenefitType;
	public Decimal EmployeeCount;
	public Decimal EmployeePercentage;
	public String EmploymentType;
	public String Gender;
	public Id Id;
	public Boolean IsEmployeeEligible;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String PercentageCalcType;
	public String PrimaryLocation;
	public String ReplayId;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;

	public EmpBenefitSummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmpBenefitSummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmpBenefitSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmpBenefitSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmpBenefitSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
