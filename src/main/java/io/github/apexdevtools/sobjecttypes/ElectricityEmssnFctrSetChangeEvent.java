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
public class ElectricityEmssnFctrSetChangeEvent extends SObject {
	public static SObjectType$<ElectricityEmssnFctrSetChangeEvent> SObjectType;
	public static SObjectFields$<ElectricityEmssnFctrSetChangeEvent> Fields;

	public Decimal Ch4EmissionRate;
	public Decimal Ch4EmissionRateInTgwh;
	public String Ch4EmissionRateUnit;
	public Object ChangeEventHeader;
	public String City;
	public Decimal Co2EmissionRate;
	public Decimal Co2EmissionRateInTmwh;
	public String Co2EmissionRateUnit;
	public Decimal Co2eEmissionRate;
	public Decimal Co2eEmissionRateInTmwh;
	public String Co2eEmissionRateUnit;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EmissionFactorDataSource;
	public String EmissionFactorUpdateYear;
	public String EmissionsFactorType;
	public String ExternalIdentifier;
	public Date GenlConversionFctrRevisionDate;
	public String GridSubregion;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal LocBasedGeothermalMixPct;
	public Decimal LocBasedOtherFossilFuelMixPct;
	public Decimal LocBasedRenewableEnergyPct;
	public Decimal LocBsdRenewableEnrgyNonHydro;
	public Decimal LocationBasedBiomassMixPct;
	public Decimal LocationBasedCoalMixPct;
	public Decimal LocationBasedGasMixPct;
	public Decimal LocationBasedHydroMixPct;
	public Decimal LocationBasedMixPct;
	public Decimal LocationBasedNuclearMixPct;
	public Decimal LocationBasedOilMixPct;
	public Decimal LocationBasedOtherFuelMixPct;
	public Decimal LocationBasedSolarMixPct;
	public Decimal LocationBasedWindMixPct;
	public Decimal MarketBasedBiomassMixPct;
	public Decimal MarketBasedCoalMixPct;
	public Decimal MarketBasedGasMixPct;
	public Decimal MarketBasedHydroMixPct;
	public Decimal MarketBasedMixPct;
	public Decimal MarketBasedNuclearMixPct;
	public Decimal MarketBasedOilMixPct;
	public Decimal MarketBasedOtherFuelMixPct;
	public Decimal MarketBasedSolarMixPct;
	public Decimal MarketBasedWindMixPct;
	public Decimal MktBasedGeothermalMixPct;
	public Decimal MktBasedOtherFossilFuelMixPct;
	public Decimal MktBasedRenewableEnergyPct;
	public Decimal MktBsdCh4EmssnRate;
	public String MktBsdCh4EmssnRateUnit;
	public Decimal MktBsdCh4EmssnRtInTgwh;
	public Decimal MktBsdCo2EmssnRate;
	public String MktBsdCo2EmssnRateUnit;
	public Decimal MktBsdCo2EmssnRtInTmwh;
	public Decimal MktBsdCo2eEmissionRate;
	public Decimal MktBsdCo2eEmissionRateInTmwh;
	public String MktBsdCo2eEmissionRateUnit;
	public String MktBsdDataSrcType;
	public Id MktBsdElectrSupplierId;
	public Supplier MktBsdElectrSupplier;
	public Decimal MktBsdN2oEmssnRate;
	public String MktBsdN2oEmssnRateUnit;
	public Decimal MktBsdN2oEmssnRtInTgwh;
	public Decimal MktBsdRenewableEnrgyNonHydro;
	public Decimal N2oEmissionRate;
	public Decimal N2oEmissionRateInTgwh;
	public String N2oEmissionRateUnit;
	public String Name;
	public Id OtherEmssnFctrId;
	public OtherEmssnFctrSet OtherEmssnFctr;
	public Id OwnerId;
	public User Owner;
	public String PostalCodeSet;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public String ReplayId;
	public Boolean ShouldLockDtastUpdtForRec;
	public String State;

	public ElectricityEmssnFctrSetChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ElectricityEmssnFctrSetChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ElectricityEmssnFctrSetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ElectricityEmssnFctrSetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ElectricityEmssnFctrSetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
