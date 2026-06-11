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
public class EmssnReductionTargetChangeEvent extends SObject {
	public static SObjectType$<EmssnReductionTargetChangeEvent> SObjectType;
	public static SObjectFields$<EmssnReductionTargetChangeEvent> Fields;

	public String AbsoluteContractionPercentage;
	public String ActivityUnit;
	public Id AnnualEmissionsInventoryId;
	public AnnualEmssnInventory AnnualEmissionsInventory;
	public Decimal BaseYear;
	public Decimal BaseYearActivity;
	public Decimal BaseYearEmissionIntensity;
	public Decimal BaseYearEmissions;
	public String BusinessLine;
	public String BusinessRegion;
	public String Category;
	public Object ChangeEventHeader;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal CustomAbsoluteContractionPct;
	public String CustomTargetSettingMethod;
	public String CustomTargetType;
	public String Description;
	public Id EmissionsActivityId;
	public EmissionsActivity EmissionsActivity;
	public Id EmssnRdctnCommitmentId;
	public EmssnRdctnCommitment EmssnRdctnCommitment;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Level;
	public String Name;
	public String OtherTargetKpi;
	public Decimal OtherTargetKpiChangePercentage;
	public Decimal OtherTargetKpiInBaseYear;
	public Decimal OtherTargetKpiInTargetYear;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String TargetEmissionsCalculator;
	public Decimal TargetEmssnChangePercentage;
	public Decimal TargetEmssnIntensityChangePct;
	public String TargetSettingMethod;
	public String TargetType;
	public String TargetYear;
	public Decimal TargetYearActivity;
	public Decimal TargetYearEmissions;
	public Decimal TargetYearEmissionsIntensity;
	public String TargetYearOutputCalcType;

	public EmssnReductionTargetChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmssnReductionTargetChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmssnReductionTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmssnReductionTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmssnReductionTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
