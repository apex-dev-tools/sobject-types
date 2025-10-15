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
public class StnryAssetCrbnFtprntItmChangeEvent extends SObject {
	public static SObjectType$<StnryAssetCrbnFtprntItmChangeEvent> SObjectType;
	public static SObjectFields$<StnryAssetCrbnFtprntItmChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal EnergyIntensityVariancePct;
	public Decimal EnrgyCnsmpIntensityInKwhM2;
	public Decimal EnrgyCnsmpIntensityInKwhSqft;
	public String FuelType;
	public Id Id;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ParentCarbonFootprintId;
	public StnryAssetCrbnFtprnt ParentCarbonFootprint;
	public Id PrevYearCarbonFootprintItemId;
	public StnryAssetCrbnFtprntItm PrevYearCarbonFootprintItem;
	public Decimal PrevYrEnrgyIntensityKwhM2;
	public Decimal PrevYrEnrgyIntensityKwhSqft;
	public String ReplayId;
	public Decimal TotEmssnUseMktBsdMthd;
	public Decimal TotalEmissionsInTco2e;
	public Decimal TotalEnergyConsumptionInGj;
	public Decimal TotalEnergyConsumptionInKwh;

	public StnryAssetCrbnFtprntItmChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprntItmChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprntItmChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprntItmChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetCrbnFtprntItmChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
