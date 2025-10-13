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
public class AnnualEmssnInventoryChangeEvent extends SObject {
	public static SObjectType$<AnnualEmssnInventoryChangeEvent> SObjectType;
	public static SObjectFields$<AnnualEmssnInventoryChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal EnergyUsageCmclBldOverride;
	public Decimal EnergyUsageCommercialBld;
	public Decimal EnergyUsageDataCenters;
	public Decimal EnergyUsageDataCtrOverride;
	public Id Id;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Decimal RenewableEnergyUsagePctCmclBld;
	public Decimal RenewableEnergyUsagePctDataCtr;
	public Decimal RenewableEnrgyPctCmclBldOvride;
	public Decimal RenewableEnrgyPctDataCtrOvride;
	public String ReplayId;
	public Decimal Scope1EmissionsDataCenters;
	public Decimal Scope1EmissionsFleetVehicles;
	public Decimal Scope1EmissionsPrivateJets;
	public Decimal Scope1EmssnCmclBldOverride;
	public Decimal Scope1EmssnCommercialBuildings;
	public Decimal Scope1EmssnDataCentersOverride;
	public Decimal Scope1EmssnPrivateJetsOverride;
	public Decimal Scope2EmissionsFleetVehicles;
	public Decimal Scope2EmissionsPrivateJets;
	public String Scope2EmissionsType;
	public Decimal Scope2LocBasedEmssnCmclBld;
	public Decimal Scope2LocBasedEmssnDataCtr;
	public Decimal Scope2MarketBasedEmssnCmclBld;
	public Decimal Scope2MarketBasedEmssnDataCtr;
	public Decimal Scope3EmissionsBusinessTravel;
	public Decimal Scope3EmissionsCapitalGoods;
	public Decimal Scope3EmissionsDataCenters;
	public Decimal Scope3EmissionsFleetVehicles;
	public Decimal Scope3EmissionsFranchises;
	public Decimal Scope3EmissionsInvestments;
	public Decimal Scope3EmissionsPctCapitalGoods;
	public Decimal Scope3EmissionsPctFranchises;
	public Decimal Scope3EmissionsPctInvestments;
	public Decimal Scope3EmissionsPercentage;
	public Decimal Scope3EmissionsPrivateJets;
	public Decimal Scope3EmissionsWasteGenInOper;
	public Decimal Scope3EmssnCapitalGoodsOvride;
	public Decimal Scope3EmssnCmclBldOverride;
	public Decimal Scope3EmssnCommercialBuildings;
	public Decimal Scope3EmssnDataCentersOverride;
	public Decimal Scope3EmssnEmpCommutingOvride;
	public Decimal Scope3EmssnEmployeeCommuting;
	public Decimal Scope3EmssnFranchisesOverride;
	public Decimal Scope3EmssnInvestmentsOverride;
	public Decimal Scope3EmssnPctBusinessTravel;
	public Decimal Scope3EmssnPctDnstrmTrnspDstr;
	public Decimal Scope3EmssnPctEmpCommuting;
	public Decimal Scope3EmssnPctUpstrmLeasedAsst;
	public Decimal Scope3EmssnPctUseOfSoldPrdct;
	public Decimal Scope3EmssnUseOfSoldProducts;
	public Decimal Scope3UncategorizedEmissions;
	public Decimal Scp1EmssnFleetVehiclesOverride;
	public Decimal Scp1EmssnWstGenInTco2e;
	public Decimal Scp1EmssnWstGenOvrideInTco2e;
	public Decimal Scp2EmssnFleetVehiclesOverride;
	public Decimal Scp2EmssnPrivateJetsOverride;
	public Decimal Scp2LocBsdEmssnCmclBldOverride;
	public Decimal Scp2LocBsdEmssnDataCtrOvride;
	public Decimal Scp2MktBsdEmssnCmclBldOverride;
	public Decimal Scp2MktBsdEmssnDataCtrOverride;
	public Decimal Scp3EmssnBusinessTravelOvride;
	public Decimal Scp3EmssnDnstrmLeasedAssets;
	public Decimal Scp3EmssnDnstrmLeasedAstOvride;
	public Decimal Scp3EmssnDnstrmTrnspDstrOvride;
	public Decimal Scp3EmssnDownstreamTrnspDstr;
	public Decimal Scp3EmssnEolSoldPrdctOvride;
	public Decimal Scp3EmssnEolTreatOfSoldPrdct;
	public Decimal Scp3EmssnFleetVehiclesOverride;
	public Decimal Scp3EmssnFuelEnergyActivity;
	public Decimal Scp3EmssnFuelEnrgyActvtyOvride;
	public Decimal Scp3EmssnPctDnstrmLeasedAssets;
	public Decimal Scp3EmssnPctEolTreatSoldPrdct;
	public Decimal Scp3EmssnPctFuelEnrgyActivity;
	public Decimal Scp3EmssnPctProcSoldProducts;
	public Decimal Scp3EmssnPctPurchGoodsAndSrvcs;
	public Decimal Scp3EmssnPctUpstrmTrnspDstr;
	public Decimal Scp3EmssnPctWasteGenInOper;
	public Decimal Scp3EmssnPrivateJetsOverride;
	public Decimal Scp3EmssnProcSoldPrdctOverride;
	public Decimal Scp3EmssnProcSoldProducts;
	public Decimal Scp3EmssnPurchGoodsAndServices;
	public Decimal Scp3EmssnPurchGoodsSrvcsOvride;
	public Decimal Scp3EmssnUpstreamLeasedAssets;
	public Decimal Scp3EmssnUpstreamTrnspDstr;
	public Decimal Scp3EmssnUpstrmLeasedAstOvride;
	public Decimal Scp3EmssnUpstrmTrnspDstrOvride;
	public Decimal Scp3EmssnUseOfSoldPrdctOvride;
	public Decimal Scp3EmssnWasteGenInOperOvride;
	public Decimal Scp3UncategorizedEmssnOverride;
	public Decimal Scp3UncatgEmssnPct;
	public Decimal SupplementalScope3EmissionsPct;
	public Decimal TotScope2LocBasedEmssn;
	public Decimal TotScope2MarketBsdEmssn;
	public Decimal TotalEmissions;
	public Decimal TotalScope1And2Emissions;
	public Decimal TotalScope1Emissions;
	public Decimal TotalScope1EmissionsOverride;
	public Decimal TotalScope2Emissions;
	public Decimal TotalScope2EmissionsOverride;
	public Decimal TotalScope3Emissions;
	public Decimal TotalScope3EmissionsOverride;
	public Decimal TotalSuplScope3EmssnOverride;
	public Decimal TotalSuplScp3Emissions;
	public String UniqueIdx;
	public String Year;

	public AnnualEmssnInventoryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnInventoryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnInventoryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnInventoryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnInventoryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
