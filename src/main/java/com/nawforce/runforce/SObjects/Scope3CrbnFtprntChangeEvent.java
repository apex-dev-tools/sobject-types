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
public class Scope3CrbnFtprntChangeEvent extends SObject {
	public static SObjectType$<Scope3CrbnFtprntChangeEvent> SObjectType;
	public static SObjectFields$<Scope3CrbnFtprntChangeEvent> Fields;

	public Id AnnualEmssnInventoryId;
	public AnnualEmssnInventory AnnualEmssnInventory;
	public String AuditApprovalStatus;
	public Decimal CarbonInventoryRecordCount;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EndDate;
	public String FootprintStage;
	public Id Id;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Date ReportingDate;
	public String ReportingYear;
	public Id Scope3EmssnSrcId;
	public Scope3EmssnSrc Scope3EmssnSrc;
	public Decimal Scp3EmssnCapitalGood;
	public Decimal Scp3EmssnDnstrmLeasedAsset;
	public Decimal Scp3EmssnDnstrmTrnspDistr;
	public Decimal Scp3EmssnEmployeeCommuting;
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
	public Date StartDate;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public Decimal SuplScope3Emission;
	public Decimal SupplDnstrmLsdAst;
	public Decimal SupplEndLifeTreatSoldPrdct;
	public Decimal SupplFuelEnrgyRelaActv;
	public Decimal SupplProcessingSoldPrdct;
	public Decimal SupplPurchGoodSrvcs;
	public Decimal SupplScp3EmssnBizTravl;
	public Decimal SupplScp3EmssnCptlGoods;
	public Decimal SupplScp3EmssnDnstrmTrnspDstr;
	public Decimal SupplScp3EmssnEmpComut;
	public Decimal SupplScp3EmssnFranch;
	public Decimal SupplScp3EmssnInvestments;
	public Decimal SupplScp3EmssnWstGenOper;
	public Decimal SupplScp3UncatgEmssn;
	public Decimal SupplUpstrmLsdAst;
	public Decimal SupplUpstrmTrnspDstr;
	public Decimal SupplUseSoldPrdct;
	public Decimal TotScope3EmissionsInTco2e;
	public Decimal TotalScp3DnstrmEmissions;
	public Decimal TotalScp3EmssnBusTrvl;
	public Decimal TotalScp3UpstrmEmissions;

	public Scope3CrbnFtprntChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public Scope3CrbnFtprntChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Scope3CrbnFtprntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Scope3CrbnFtprntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Scope3CrbnFtprntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
