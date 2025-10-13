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
public class StnryAssetWaterFtprntChangeEvent extends SObject {
	public static SObjectType$<StnryAssetWaterFtprntChangeEvent> SObjectType;
	public static SObjectFields$<StnryAssetWaterFtprntChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Decimal CnsmpIntsVariancePct;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal DchgIntsVariancePct;
	public Decimal EmployeeCnsmpIntsInM3;
	public Decimal EmployeeCount;
	public Decimal EmployeeDchgIntsInM3;
	public Decimal EmployeeWdrwIntsInM3;
	public Date EndDate;
	public Decimal ExtremeStressCnsmpPct;
	public Decimal ExtremeStressWdrwPct;
	public Decimal FlAreaCnsmpIntsInM3M2;
	public Decimal FlAreaCnsmpIntsInM3Sqft;
	public Decimal FlAreaDchgIntsInM3M2;
	public Decimal FlAreaDchgIntsInM3Sqft;
	public Decimal FlAreaWdrwIntsInM3M2;
	public Decimal FlAreaWdrwIntsInM3Sqft;
	public String FootprintStage;
	public Decimal HighStressCnsmpPct;
	public Decimal HighStressWdrwPct;
	public Id Id;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Decimal OccupiedFloorArea;
	public String OccupiedFloorAreaUnit;
	public Id OwnerId;
	public User Owner;
	public Id PreviousYearWaterFtprntId;
	public StnryAssetWaterFtprnt PreviousYearWaterFtprnt;
	public Decimal ProdtVolumeCnsmpIntsInM3;
	public Decimal ProdtVolumeDchgIntsInM3;
	public Decimal ProdtVolumeWdrwIntsInM3;
	public String ReplayId;
	public String ReportingYear;
	public Date StartDate;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public Decimal TotalConsumptionInMl;
	public Decimal TotalCost;
	public Decimal TotalDischargeInMl;
	public Decimal TotalFloorArea;
	public String TotalFloorAreaUnit;
	public Decimal TotalStorageDuringPreviousYear;
	public Decimal TotalStorageInMl;
	public Decimal TotalUnitsManufactured;
	public Decimal TotalWithdrawalInMl;
	public Decimal WaterInventoryRecCount;
	public Decimal WdrwIntsVariancePct;

	public StnryAssetWaterFtprntChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterFtprntChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterFtprntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterFtprntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetWaterFtprntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
