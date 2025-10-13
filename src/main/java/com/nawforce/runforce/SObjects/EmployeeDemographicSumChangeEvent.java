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
public class EmployeeDemographicSumChangeEvent extends SObject {
	public static SObjectType$<EmployeeDemographicSumChangeEvent> SObjectType;
	public static SObjectFields$<EmployeeDemographicSumChangeEvent> Fields;

	public String AgeGroup;
	public Object ChangeEventHeader;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Decimal EmployeeCount;
	public String EmploymentType;
	public String Gender;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Month;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Decimal Percentage;
	public String Region;
	public String ReplayId;
	public String ReportType;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;
	public String WorkType;

	public EmployeeDemographicSumChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmployeeDemographicSumChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmployeeDemographicSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmployeeDemographicSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmployeeDemographicSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
