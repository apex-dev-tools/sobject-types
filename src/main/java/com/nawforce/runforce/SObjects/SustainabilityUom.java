/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SustainabilityUom extends SObject {
	public static SObjectType$<SustainabilityUom> SObjectType;
	public static SObjectFields$<SustainabilityUom> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsProductUom;
	public Boolean IsStationaryAssetUom;
	public Boolean IsVehicleAssetUom;
	public Boolean IsWasteUom;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Datetime SystemModstamp;
	public String UnitType;

	public StnryAssetEnrgyUse[] FuelConsumptionUnitRef;
	public GeneratedWaste[] SustainabilityUomRef;
	public VehicleAssetEnrgyUse[] VehicleAssetEnrgyUseFuelConsumptionUnitRef;

	public SustainabilityUom clone$() {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityUom clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityUom clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityUom clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityUom clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
