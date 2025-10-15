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
public class WasteFootprintChangeEvent extends SObject {
	public static SObjectType$<WasteFootprintChangeEvent> SObjectType;
	public static SObjectFields$<WasteFootprintChangeEvent> Fields;

	public Id AnnualEmssnInventoryId;
	public AnnualEmssnInventory AnnualEmssnInventory;
	public String AuditApprovalStatus;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public String FootprintStage;
	public Decimal GeneratedWasteDetailRecordCnt;
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
	public Decimal Scope1EmissionsInTco2e;
	public Id Scope3EmssnSrcId;
	public Scope3EmssnSrc Scope3EmssnSrc;
	public Decimal Scp3DnstrmEndLifeSoldPrdct;
	public Decimal Scp3UpstrmWstGenInOper;
	public Date StartDate;
	public Id StnryAssetEnvrSrcId;
	public StnryAssetEnvrSrc StnryAssetEnvrSrc;
	public Decimal SuplScope1EmissionsInTco2e;
	public Decimal SuplScp3DnstrmEndLifeSoldPrdct;
	public Decimal SuplScp3UpstrmWstGenInOper;
	public Decimal TotalWasteQuantityinTonnes;

	public WasteFootprintChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WasteFootprintChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WasteFootprintChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WasteFootprintChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WasteFootprintChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
