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
public class StnryAssetWaterActvtyChangeEvent extends SObject {
	public static SObjectType$<StnryAssetWaterActvtyChangeEvent> SObjectType;
	public static SObjectFields$<StnryAssetWaterActvtyChangeEvent> Fields;

	public String ActivitySourceType;
	public String ActivityType;
	public Object ChangeEventHeader;
	public String CostCenter;
	public Decimal CostPerUnit;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataGapFillingMethodName;
	public String Description;
	public Date EndDate;
	public Id EnvironmentalRiskId;
	public EnvironmentalRisk EnvironmentalRisk;
	public Decimal FinalWaterQuantity;
	public Id Id;
	public Boolean IsRecordLocked;
	public Boolean IsSystemGeneratedRecord;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Decimal ProposedWaterQuantity;
	public Decimal Quantity;
	public Decimal QuantityInM3;
	public String QuantityUnit;
	public String ReplayId;
	public Id ServiceProviderId;
	public Supplier ServiceProvider;
	public Date StartDate;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public Id StnryAssetWaterFtprntId;
	public StnryAssetWaterFtprnt StnryAssetWaterFtprnt;
	public Decimal TotalCost;
	public String TreatmentType;
	public String WaterDataMeasurement;
	public Date WaterFtprntReportDate;

	public StnryAssetWaterActvtyChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterActvtyChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterActvtyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterActvtyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterActvtyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
