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
public class ClimateChgEmssnFincSummaryChangeEvent extends SObject {
	public static SObjectType$<ClimateChgEmssnFincSummaryChangeEvent> SObjectType;
	public static SObjectFields$<ClimateChgEmssnFincSummaryChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Decimal E1BgnCo2EmssnBiomassNotScp2Ghg;
	public Decimal E1BgnEmssnCo2BiomassNotScp3Ghg;
	public Decimal E1BiogenicCo2EmssnScp1GhgEmssn;
	public Decimal E1CnsmpSelfGenNonFuelEnrgy;
	public Decimal E1CptlExpClimateTrnstPlan;
	public Decimal E1CptlExpCoalRelatedActivities;
	public Decimal E1CptlExpGasRelatedActivities;
	public Decimal E1CptlExpOilRelatedActivities;
	public Decimal E1CrbnPriceMetricTonneGhgEmssn;
	public Date E1DateAdoptionTransitionPlan;
	public Date E1DateCrbnCrValChnPlnCanceled;
	public Decimal E1FuelCnsmpRenewableSrcBiomass;
	public Decimal E1NetRevHighClimateImpcSctr;
	public Decimal E1NetRevNonHighClimateimpcSctr;
	public Decimal E1NetRevOthrCalcGhgIntensity;
	public Decimal E1NetRevenue;
	public Decimal E1NetRevenueCalcGhgIntensity;
	public Decimal E1OpExpenseClimateTrnstPlan;
	public Decimal E1PctCntrEnrgyGnrnScp2Emssn;
	public Decimal E1PctCntrInstrScope2GhgEmssn;
	public Decimal E1PctCntrPurchEnrgyScp2Emssn;
	public Decimal E1PctCrbnCrProjEuropeanUnion;
	public Decimal E1PctCrbnCrQualCoresAdjustment;
	public Decimal E1PctGhgScp3CalcPrimaryData;
	public Decimal E1PctMktBsdScp2GhgEmssnElectr;
	public Decimal E1PctScp1GhgEmssnIntrCrbnPrc;
	public Decimal E1PctScp1GhgEmssnRegltTrdSchm;
	public Decimal E1PctScp2GhgEmssnIntrCrbnPrc;
	public Decimal E1PctScp3GhgEmssnIntrCrbnPrc;
	public Date E1Sbm3DateResilienceAnlys;
	public Decimal E1TotEnrgyCnsmpHighImpcSctr;
	public Decimal Gov3PctRemunLnkClimateCsdn;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;

	public ClimateChgEmssnFincSummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgEmssnFincSummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgEmssnFincSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgEmssnFincSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ClimateChgEmssnFincSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
