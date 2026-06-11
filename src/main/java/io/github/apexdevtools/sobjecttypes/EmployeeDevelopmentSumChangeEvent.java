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
public class EmployeeDevelopmentSumChangeEvent extends SObject {
	public static SObjectType$<EmployeeDevelopmentSumChangeEvent> SObjectType;
	public static SObjectFields$<EmployeeDevelopmentSumChangeEvent> Fields;

	public Decimal AverageTrainingTime;
	public String BusinessFunction;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Decimal EmployeeCount;
	public Decimal EmployeePercentage;
	public String EmployeeType;
	public String Gender;
	public Id Id;
	public Boolean IsBusinessFunctionAtRisk;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ManagementLevel;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Decimal PercentBusinessFunctionAtRisk;
	public String ProgramCategory;
	public String ReplayId;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;

	public EmployeeDevelopmentSumChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmployeeDevelopmentSumChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmployeeDevelopmentSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmployeeDevelopmentSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmployeeDevelopmentSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
