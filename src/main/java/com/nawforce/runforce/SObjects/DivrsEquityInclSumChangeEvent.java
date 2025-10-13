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
public class DivrsEquityInclSumChangeEvent extends SObject {
	public static SObjectType$<DivrsEquityInclSumChangeEvent> SObjectType;
	public static SObjectFields$<DivrsEquityInclSumChangeEvent> Fields;

	public String AgeGroup;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public String DiversityCategory;
	public String DiversityType;
	public Decimal EmployeeCount;
	public Decimal EmployeePercentage;
	public String EmployeeType;
	public String EmploymentType;
	public String Gender;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Location;
	public String ManagementLevel;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String Race;
	public String ReplayId;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;

	public DivrsEquityInclSumChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DivrsEquityInclSumChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DivrsEquityInclSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DivrsEquityInclSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DivrsEquityInclSumChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
