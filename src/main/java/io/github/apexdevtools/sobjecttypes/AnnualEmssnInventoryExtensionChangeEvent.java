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
public class AnnualEmssnInventoryExtensionChangeEvent extends SObject {
	public static SObjectType$<AnnualEmssnInventoryExtensionChangeEvent> SObjectType;
	public static SObjectFields$<AnnualEmssnInventoryExtensionChangeEvent> Fields;

	public Decimal AllocScope1EmssnCmclBuildings;
	public Decimal AllocScope1EmssnDataCenters;
	public Decimal AllocScope1EmssnFleetVehicles;
	public Decimal AllocScope1EmssnPrivateJets;
	public Decimal AllocScope2EmssnFleetVehicles;
	public Decimal AllocScope2EmssnPrivateJets;
	public Decimal AllocScope2LocBsdEmssnCmclBld;
	public Decimal AllocScope2LocBsdEmssnDataCtr;
	public Decimal AllocScope2MktBsdEmssnCmclBld;
	public Decimal AllocScope2MktBsdEmssnDataCtr;
	public Decimal AllocScope3EmssnDnstrmLsdAst;
	public Decimal AllocScp1EmssnWstGenInTco2e;
	public Decimal AllocScp3EmssnBusTrvl;
	public Decimal AllocScp3EmssnCptlGoods;
	public Decimal AllocScp3EmssnDnstrmTrnspDistr;
	public Decimal AllocScp3EmssnEmpCommute;
	public Decimal AllocScp3EmssnFranchises;
	public Decimal AllocScp3EmssnFuelEnrgyActvty;
	public Decimal AllocScp3EmssnInvestments;
	public Decimal AllocScp3EmssnProcSoldPrdct;
	public Decimal AllocScp3EmssnPurchGoodsSrvcs;
	public Decimal AllocScp3EmssnUpstrmLsdAst;
	public Decimal AllocScp3EmssnUpstrmTrnspDistr;
	public Decimal AllocScp3EmssnUseOfSoldPrdct;
	public Decimal AllocScp3EmssnWstGenInOper;
	public Decimal AllocScp3EndLifeTreatSoldPrdct;
	public Decimal AllocScp3UncategorizedEmssn;
	public Decimal AllocSuplScope3DnstrmEmissions;
	public Decimal AllocSuplScope3Emission;
	public Decimal AllocSuplScope3UpstrmEmissions;
	public Id AnnualEmissionInventoryId;
	public AnnualEmssnInventory AnnualEmissionInventory;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;

	public AnnualEmssnInventoryExtensionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnInventoryExtensionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnInventoryExtensionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnInventoryExtensionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnnualEmssnInventoryExtensionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
