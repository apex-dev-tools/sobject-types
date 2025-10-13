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
public class StnryAssetCrbnFtprntChangeEvent extends SObject {
	public static SObjectType$<StnryAssetCrbnFtprntChangeEvent> SObjectType;
	public static SObjectFields$<StnryAssetCrbnFtprntChangeEvent> Fields;

	public Decimal AllocatedRenewableEnergyInKwh;
	public String AllocationStatus;
	public Id AnnualEmssnInventoryId;
	public AnnualEmssnInventory AnnualEmssnInventory;
	public String AuditApprovalStatus;
	public Decimal AvgDataCenterPue;
	public Decimal AvgMonthlyElectrCnsmpInKwh;
	public Id BuildingEnergyIntensityId;
	public BldgEnrgyIntensity BuildingEnergyIntensity;
	public Decimal CarbonInventoryRecordCount;
	public Decimal Ch4EmissionsInKg;
	public Object ChangeEventHeader;
	public Decimal Co2EmissionsInKg;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal DataCtrItDieselCnsmpIntensity;
	public String DataGapStatus;
	public Decimal ElectricityIntensityVarPct;
	public Date EndDate;
	public Decimal EnrgyCnsmpIntensityInKbtuM2;
	public Decimal EnrgyCnsmpIntensityInKbtuSqft;
	public Decimal EnrgyCnsmpIntensityInKwhM2;
	public Decimal EnrgyCnsmpIntensityInKwhSqft;
	public Decimal EnrgyIntensityVariancePct;
	public String FootprintStage;
	public Id Id;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal LocBasedElectrFrOthrFuelInKwh;
	public Decimal LocBasedElectrFromBiomassInKwh;
	public Decimal LocBasedElectrFromCoalInKwh;
	public Decimal LocBasedElectrFromGasInKwh;
	public Decimal LocBasedElectrFromHydroInKwh;
	public Decimal LocBasedElectrFromNuclearInKwh;
	public Decimal LocBasedElectrFromOilInKwh;
	public Decimal LocBasedElectrFromSolarInKwh;
	public Decimal LocBasedElectrFromWindInKwh;
	public Decimal LocBsdElectrFrGeothermalInKwh;
	public Decimal LocBsdElectrOthrFossilFuelKwh;
	public Decimal MaxVarianceAboveAvgElectrCnsmp;
	public Decimal MaxVarianceBelowAvgElectrCnsmp;
	public Decimal MktBsdElectrFrBiomassInKwh;
	public Decimal MktBsdElectrFrFromCoalInKwh;
	public Decimal MktBsdElectrFrGasInKwh;
	public Decimal MktBsdElectrFrGeothermalInKwh;
	public Decimal MktBsdElectrFrHydroInKwh;
	public Decimal MktBsdElectrFrNuclearInKwh;
	public Decimal MktBsdElectrFrOilInKwh;
	public Decimal MktBsdElectrFrOthrFuelInKwh;
	public Decimal MktBsdElectrFrSolarInKwh;
	public Decimal MktBsdElectrFrWindInKwh;
	public Decimal MktBsdElectrOthrFossilFuelKwh;
	public Decimal N2oEmissionsInKg;
	public String Name;
	public Decimal OccupiedFloorArea;
	public String OccupiedFloorAreaUnit;
	public Id OwnerId;
	public User Owner;
	public Id PrevYrAnnlCarbonFootprintId;
	public StnryAssetCrbnFtprnt PrevYrAnnlCarbonFootprint;
	public Decimal PrevYrDataCenterPue;
	public Decimal PrevYrEnrgyIntensityKbtuM2;
	public Decimal PrevYrEnrgyIntensityKbtuSqft;
	public Decimal PrevYrEnrgyIntensityKwhM2;
	public Decimal PrevYrEnrgyIntensityKwhSqft;
	public Id RegionalBldgEnergyIntensityId;
	public BldgEnrgyIntensity RegionalBldgEnergyIntensity;
	public String ReplayId;
	public Date ReportingDate;
	public String ReportingYear;
	public Decimal RgnlElectrCnsmpIntensity;
	public Decimal RgnlEnrgyCnsmpIntensity;
	public Decimal Scope3EmssnDnstrmLsdAst;
	public Decimal Scp3EmssnCptlGoods;
	public Decimal Scp3EmssnEmpCommute;
	public Decimal Scp3EmssnFranchises;
	public Decimal Scp3EmssnInvestments;
	public Decimal Scp3EmssnProcSoldPrdct;
	public Decimal Scp3EmssnPurchGoodsSrvcs;
	public Decimal Scp3EmssnUpstrmLsdAst;
	public Decimal Scp3EmssnUseOfSoldPrdct;
	public Decimal Scp3EmssnWstGenInOper;
	public Decimal Scp3EndLifeTreatSoldPrdct;
	public Decimal Scp3FuelEnrgyRelaActv;
	public Decimal Scp3UncategorizedEmssn;
	public Date StartDate;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public Decimal SuplScope1Emissions;
	public Decimal SuplScope2LocationBasedEmssn;
	public Decimal SuplScope2MarketBasedEmssn;
	public Decimal SuplScope3DnstrmEmissions;
	public Decimal SuplScope3UpstrmEmissions;
	public Decimal TotBldgIndirectEnrgyCnsmpInMwh;
	public Decimal TotEnergyConsumptionInGj;
	public Decimal TotEnergyConsumptionInKwh;
	public Decimal TotEnergyConsumptionInMwh;
	public Decimal TotRnwlEnrgyExclHydroInKwh;
	public Decimal TotRnwlEnrgyExclHydroPct;
	public Decimal TotScope1EmissionsInTco2e;
	public Decimal TotScope2LocBasedEmissions;
	public Decimal TotScope2MktBasedEmissions;
	public Decimal TotalFloorArea;
	public String TotalFloorAreaUnit;
	public Decimal TotalRenewableEnergyInKwh;
	public Decimal TotalRenewableEnergyPct;
	public Decimal TotalScp3DnstrmEmissions;
	public Decimal TotalScp3UpstrmEmissions;
	public Decimal YearOverYearPueVariancePct;

	public StnryAssetCrbnFtprntChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprntChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
