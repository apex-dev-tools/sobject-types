/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class EmploymentCompensationSummaryChangeEvent extends SObject {
	public static SObjectType$<EmploymentCompensationSummaryChangeEvent> SObjectType;
	public static SObjectFields$<EmploymentCompensationSummaryChangeEvent> Fields;

	public Decimal AverageHourlyWage;
	public Object ChangeEventHeader;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public String FacilityType;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal MinimumWageEmployeePercent;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String Region;
	public String ReplayId;
	public Decimal S1AdequateWagePercent;
	public Decimal S1AnnlTotRemunHpdIndv;
	public Decimal S1AvgGrHrlyPayFmlEmp;
	public Decimal S1AvgGrHrlyPayMaleEmp;
	public Decimal S1MdnAnnlTotRemunEmp;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;

	public EmploymentCompensationSummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmploymentCompensationSummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmploymentCompensationSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmploymentCompensationSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmploymentCompensationSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
