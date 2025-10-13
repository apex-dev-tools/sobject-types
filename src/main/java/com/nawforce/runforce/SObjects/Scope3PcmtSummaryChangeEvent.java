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
public class Scope3PcmtSummaryChangeEvent extends SObject {
	public static SObjectType$<Scope3PcmtSummaryChangeEvent> SObjectType;
	public static SObjectFields$<Scope3PcmtSummaryChangeEvent> Fields;

	public String CalendarYear;
	public Date CarbonFootprintReportDate;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyCode;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Decimal InflationRate;
	public Decimal InflationRateCalculated;
	public Decimal InflationRateOverride;
	public Boolean IsComplete;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PcmtEmssnFctrId;
	public PcmtEmssnFctrSet PcmtEmssnFctr;
	public String ReplayId;
	public Id Scope3CrbnFtprntId;
	public Scope3CrbnFtprnt Scope3CrbnFtprnt;
	public Id Scope3EmssnSrcId;
	public Scope3EmssnSrc Scope3EmssnSrc;
	public Decimal Scp3EmssnBusinessTravel;
	public Decimal Scp3EmssnCapitalGood;
	public Decimal Scp3EmssnDnstrmLeasedAsset;
	public Decimal Scp3EmssnDnstrmTrnspDistr;
	public Decimal Scp3EmssnEndLifeSoldProdt;
	public Decimal Scp3EmssnFranchise;
	public Decimal Scp3EmssnFuelEnergyActivity;
	public Decimal Scp3EmssnInvestment;
	public Decimal Scp3EmssnProcSoldProduct;
	public Decimal Scp3EmssnPurchGoodsService;
	public Decimal Scp3EmssnUpstrmLeasedAsset;
	public Decimal Scp3EmssnUpstrmTrnspDistr;
	public Decimal Scp3EmssnUseOfSoldProduct;
	public Decimal Scp3UncatgEmissions;
	public Decimal Scp3WasteGenInOper;
	public Decimal ScpEmssnEmployeeCommuting;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public Decimal TotalScp3DnstrmEmissions;
	public Decimal TotalScp3Emissions;
	public Decimal TotalScp3UpstrmEmissions;
	public Decimal TotalSpentAmount;

	public Scope3PcmtSummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public Scope3PcmtSummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Scope3PcmtSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Scope3PcmtSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Scope3PcmtSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
