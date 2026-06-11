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
public class AnnualEmssnRdctnTargetChangeEvent extends SObject {
	public static SObjectType$<AnnualEmssnRdctnTargetChangeEvent> SObjectType;
	public static SObjectFields$<AnnualEmssnRdctnTargetChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal EmissionsReductionPercentage;
	public Decimal EmssnIntensityReductionPct;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Decimal OtherTargetKpiChangePercentage;
	public Decimal OtherTargetKpiInTargetYear;
	public Id ParentTargetId;
	public EmssnReductionTarget ParentTarget;
	public String ReplayId;
	public Decimal Scope3GhgCatgTgtEmssnRdctn;
	public Decimal Scope3GhgCatgTgtEmssnRdctnPct;
	public Decimal TargetEmissions;
	public Decimal TargetEmissionsIntensity;
	public String TargetYear;

	public AnnualEmssnRdctnTargetChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnRdctnTargetChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnRdctnTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnRdctnTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnRdctnTargetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
