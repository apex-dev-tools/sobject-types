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
public class VehicleAssetCrbnFtprntChangeEvent extends SObject {
	public static SObjectType$<VehicleAssetCrbnFtprntChangeEvent> SObjectType;
	public static SObjectFields$<VehicleAssetCrbnFtprntChangeEvent> Fields;

	public Id AnnualEmssnInventoryId;
	public AnnualEmssnInventory AnnualEmssnInventory;
	public String AuditApprovalStatus;
	public Decimal CarbonInventoryRecordCount;
	public Decimal Ch4EmissionsInKg;
	public Object ChangeEventHeader;
	public Decimal Co2EmissionsInKg;
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
	public Decimal N2oEmissionsInKg;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Date ReportingDate;
	public String ReportingYear;
	public Decimal Scp3EmssnBusTravl;
	public Decimal Scp3EmssnDnstrmLsdAst;
	public Decimal Scp3EmssnDnstrmTrnspDstr;
	public Decimal Scp3EmssnEmpComut;
	public Decimal Scp3EmssnUpstrmTrnspDstr;
	public Decimal Scp3UncategorizedEmssn;
	public Date StartDate;
	public Decimal SuplScope1Emissions;
	public Decimal SuplScope2LocationBasedEmssn;
	public Decimal SuplScope2MarketBasedEmssn;
	public Decimal SuplScope3DnstrmEmissions;
	public Decimal SuplScope3UpstrmEmissions;
	public Decimal TotFuelCnsmpInGallons;
	public Decimal TotFuelCnsmpInLiters;
	public Decimal TotScope1EmissionsInTco2e;
	public Decimal TotScope2LocBasedEmissions;
	public Decimal TotScope2MktBasedEmissions;
	public Decimal TotalScp3DnstrmEmissions;
	public Decimal TotalScp3UpstrmEmissions;
	public Id VehicleAssetEmssnSrcId;
	public VehicleAssetEmssnSrc VehicleAssetEmssnSrc;
	public String VehicleType;

	public VehicleAssetCrbnFtprntChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetCrbnFtprntChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetCrbnFtprntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetCrbnFtprntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetCrbnFtprntChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
