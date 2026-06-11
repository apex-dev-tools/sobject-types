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
public class EmissionsForecastFactChangeEvent extends SObject {
	public static SObjectType$<EmissionsForecastFactChangeEvent> SObjectType;
	public static SObjectFields$<EmissionsForecastFactChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal ActualEmissions;
	public Decimal ActualEmissionsIntensity;
	public Decimal ActualEnergyConsumption;
	public Decimal ActualLocationBasedEmissions;
	public Decimal ActualMarketBasedEmissions;
	public Decimal ActualRenewableEnergyCnsmpPct;
	public Id AdvAcctForecastSetPartnerId;
	public AdvAcctForecastSetPartner AdvAcctForecastSetPartner;
	public Decimal CarbonCreditCost;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id EmissionsActivityId;
	public EmissionsActivity EmissionsActivity;
	public Decimal FinalForecastedEmissions;
	public Decimal ForcstEmssnIntensityRdctnPct;
	public Decimal ForcstRenewableEnergyCnsmpPct;
	public Decimal ForecastedEmissions;
	public Decimal ForecastedEmissionsIntensity;
	public Decimal ForecastedEmissionsOverride;
	public Decimal ForecastedEnergyConsumption;
	public Decimal ForecastedLocationBasedEmssn;
	public Decimal ForecastedMarketBasedEmssn;
	public Decimal Headcount;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Decimal NetEmissionsForecast;
	public Decimal OtherApplnForecastedEmissions;
	public Id OwnerId;
	public User Owner;
	public Id PeriodId;
	public Period Period;
	public Decimal PlannedCarbonCredits;
	public Decimal PlannedCarbonCreditsInvst;
	public Decimal PlnOperationalEmissionsRdctn;
	public Decimal PlnSupplierEmissionsRdctn;
	public Decimal ProcurementSpend;
	public String ReplayId;
	public Decimal RequiredCarbonCredits;
	public Decimal RequiredCarbonCreditsInvst;
	public Decimal Revenue;
	public String Status;
	public Decimal TargetCompensatedEmissions;
	public Decimal TargetEmissions;
	public Decimal TargetRenewableEnergyPct;
	public Decimal TotalFloorArea;

	public EmissionsForecastFactChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmissionsForecastFactChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmissionsForecastFactChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmissionsForecastFactChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmissionsForecastFactChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
