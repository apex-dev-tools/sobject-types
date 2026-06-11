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
public class VehicleAssetEnrgyUseChangeEvent extends SObject {
	public static SObjectType$<VehicleAssetEnrgyUseChangeEvent> SObjectType;
	public static SObjectFields$<VehicleAssetEnrgyUseChangeEvent> Fields;

	public Decimal AircraftFuelEconomy;
	public Decimal AircraftFuelEconomyInGph;
	public String AircraftFuelEconomyUnit;
	public String AircraftType;
	public String CalculationDetail;
	public Date CarbonFootprintReportDate;
	public Decimal Ch4EmissionsInKg;
	public Object ChangeEventHeader;
	public Decimal Co2EmissionsInKg;
	public String CostCenter;
	public String CrbnEmssnScopeAlloc;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal Distance;
	public String DistanceUnit;
	public Date EndDate;
	public Date FlightDate;
	public Decimal FlightDurationInHours;
	public Decimal FuelConsumption;
	public String FuelConsumptionUnit;
	public Id FuelConsumptionUnitRefId;
	public SustainabilityUom FuelConsumptionUnitRef;
	public Decimal FuelEfficiency;
	public Decimal FuelEfficiencyInMpg;
	public String FuelEfficiencyUnit;
	public String FuelType;
	public Id FuelTypeRefId;
	public FuelType FuelTypeRef;
	public Id Id;
	public Boolean IsCompanyOwnedAsset;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal N2oEmissionsInKg;
	public String Name;
	public Id OtherEmssnFctrId;
	public OtherEmssnFctrSet OtherEmssnFctr;
	public Id OthrLifecyclEmssnFctrSetId;
	public OthrLifecyclEmssnFctrSet OthrLifecyclEmssnFctrSet;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Decimal Scope1EmissionsInTco2e;
	public Decimal Scope2LocBasedEmssnInTco2e;
	public Decimal Scope2MktBasedEmssnInTco2e;
	public Decimal Scope3DnstrmEmissionsInTco2e;
	public String Scope3GhgCategory;
	public Decimal Scope3UpstrmEmissionsInTco2e;
	public Decimal Scp3Ch4EmssnFuelEnrgy;
	public Decimal Scp3Co2EmssnFuelEnrgy;
	public Decimal Scp3EmssnFuelEnrgy;
	public Decimal Scp3N2oEmssnFuelEnrgy;
	public Date StartDate;
	public Decimal SuplScope1Emissions;
	public Decimal SuplScope2LocationBasedEmssn;
	public Decimal SuplScope2MarketBasedEmssn;
	public Decimal SuplScope3DnstrmEmissions;
	public Decimal SuplScope3UpstrmEmissions;
	public Id SupplierId;
	public Supplier Supplier;
	public Decimal TotalFuelConsumptionInGal;
	public Decimal TotalFuelConsumptionInLiter;
	public Id VehicleAssetCrbnFtprntId;
	public VehicleAssetCrbnFtprnt VehicleAssetCrbnFtprnt;
	public Id VehicleAssetEmssnSrcId;
	public VehicleAssetEmssnSrc VehicleAssetEmssnSrc;

	public VehicleAssetEnrgyUseChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEnrgyUseChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEnrgyUseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
