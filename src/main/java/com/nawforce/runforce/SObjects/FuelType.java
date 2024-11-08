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
public class FuelType extends SObject {
	public static SObjectType$<FuelType> SObjectType;
	public static SObjectFields$<FuelType> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsStationaryAssetFuel;
	public Boolean IsVehicleAssetFuel;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Datetime SystemModstamp;

	public CrbnEmssnScopeAllocVal[] CrbnEmssnScopeAllocValFuelTypeRef;
	public StnryAssetEnrgyUse[] FuelTypeRef;
	public OtherEmssnFctrSetItem[] FuelTypeRefs;
	public VehicleAssetEnrgyUse[] VehicleAssetEnrgyUseFuelTypeRef;

	public FuelType clone$() {throw new java.lang.UnsupportedOperationException();}
	public FuelType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FuelType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FuelType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FuelType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}