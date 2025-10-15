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
public class TaxDisclosureSummaryChangeEvent extends SObject {
	public static SObjectType$<TaxDisclosureSummaryChangeEvent> SObjectType;
	public static SObjectFields$<TaxDisclosureSummaryChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal CustomerTaxCollected;
	public String Description;
	public String DisclosedBy;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Decimal EmployeeCount;
	public Decimal EmployeeTaxWithheld;
	public Decimal EmployeeTotalIncome;
	public Id Id;
	public Decimal IncomeTaxAccrued;
	public Decimal IncomeTaxPaid;
	public Decimal IndustryTaxDue;
	public Decimal IntraCompanyDebt;
	public Decimal IntraGroupTrxnRev;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String PrimaryActivity;
	public Decimal ProfitLossBeforeTax;
	public String ReplayId;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;
	public Decimal TangibleAssetValue;
	public String TaxJurisdiction;
	public Decimal ThirdPartySalesRevenue;
	public Decimal UncertainTaxPositionVal;

	public TaxDisclosureSummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public TaxDisclosureSummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TaxDisclosureSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TaxDisclosureSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TaxDisclosureSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
