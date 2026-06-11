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
public class SustainabilityScorecardChangeEvent extends SObject {
	public static SObjectType$<SustainabilityScorecardChangeEvent> SObjectType;
	public static SObjectFields$<SustainabilityScorecardChangeEvent> Fields;

	public String AllocationStatus;
	public Object ChangeEventHeader;
	public Decimal CompanyAnnualExpenditure;
	public Decimal CompanyAnnualExpenditureEmssn;
	public Decimal CompanyEmissionsAllocationPct;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String EmissionAllocationType;
	public Date EndDate;
	public Decimal FinalScorecardEmissions;
	public Id Id;
	public Boolean IsCurrentSupplierScorecard;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Decimal PercentageBasedEmissions;
	public String ReplayId;
	public Date ReportingDueDate;
	public String ScienceBasedTargetStatus;
	public Decimal Scope1Emissions;
	public Decimal Scope2LocationBasedEmissions;
	public Decimal Scope2MarkedBasedEmissions;
	public Decimal Scope3Emissions;
	public String Scope3EmssnCalculationMeasure;
	public String ScopestoIncludeinCalc;
	public Date StartDate;
	public String Status;
	public Decimal SupplierAnnualRevenue;
	public Decimal SupplierAnnualRevenueEmissions;
	public String SupplierClassification;
	public Id SupplierContactId;
	public Contact SupplierContact;
	public String SupplierEmssnRdctnCmtType;
	public Id SupplierId;
	public Supplier Supplier;
	public Decimal SupplierProvidedEmissions;
	public String SupplierReportingScope;
	public String SupplierTier;

	public SustainabilityScorecardChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityScorecardChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityScorecardChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityScorecardChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityScorecardChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
