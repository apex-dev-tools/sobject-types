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
public class BldgEnrgyIntensityChangeEvent extends SObject {
	public static SObjectType$<BldgEnrgyIntensityChangeEvent> SObjectType;
	public static SObjectFields$<BldgEnrgyIntensityChangeEvent> Fields;

	public Decimal AnnualEnergyIntensityInKwhM2;
	public Decimal AnnualEnergyIntensityInKwhSqft;
	public Boolean AreSysGenEnrgyUseRecIncluded;
	public Decimal AveragePowerUsageEffectiveness;
	public Date AveragingWindowEndDate;
	public Date AveragingWindowStartDate;
	public String BldgEnergyIntensityIdentifier;
	public String BuildingAssetType;
	public String BuildingSize;
	public Id BuildingSizeCategoryId;
	public BldgSizeCategory BuildingSizeCategory;
	public String BusinessRegion;
	public Object ChangeEventHeader;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EmissionFactorDataSource;
	public String EmissionFactorUpdateYear;
	public String ExternalIdentifier;
	public Id Id;
	public Boolean IsRecordLocked;
	public Datetime LastCalculatedDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal MaximumBuildingSizeInM2;
	public Decimal MaximumBuildingSizeInSqft;
	public Decimal MinimumBuildingSizeInM2;
	public Decimal MinimumBuildingSizeInSqft;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public String RegionalDivision;
	public String ReplayId;
	public Boolean ShouldLockDtastUpdtForRec;
	public String State;

	public BldgEnrgyIntensityChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BldgEnrgyIntensityChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BldgEnrgyIntensityChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BldgEnrgyIntensityChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BldgEnrgyIntensityChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
