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
public class GeneratedWasteChangeEvent extends SObject {
	public static SObjectType$<GeneratedWasteChangeEvent> SObjectType;
	public static SObjectFields$<GeneratedWasteChangeEvent> Fields;

	public String CalculationDetail;
	public Object ChangeEventHeader;
	public String CrbnEmssnScopeAlloc;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String DisposalSiteType;
	public String DisposalType;
	public Id DisposedWasteQtyUnitRefId;
	public SustainabilityUom DisposedWasteQtyUnitRef;
	public Decimal DisposedWasteQuantity;
	public String DisposedWasteQuantityUnit;
	public Decimal DisposedWasteQuantityinTonnes;
	public Date EndDate;
	public Id Id;
	public Boolean IsHazardous;
	public Boolean IsRadioactive;
	public Boolean IsRecordLocked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Decimal Scope1EmissionsInTco2e;
	public Id Scope3CrbnFtprntId;
	public Scope3CrbnFtprnt Scope3CrbnFtprnt;
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
	public Id SupplierId;
	public Supplier Supplier;
	public Id WasteFootprintId;
	public WasteFootprint WasteFootprint;
	public String WasteType;
	public Id WstDispoEmssnFctrId;
	public WstDispoEmssnFctrSet WstDispoEmssnFctr;

	public GeneratedWasteChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GeneratedWasteChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GeneratedWasteChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GeneratedWasteChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GeneratedWasteChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
