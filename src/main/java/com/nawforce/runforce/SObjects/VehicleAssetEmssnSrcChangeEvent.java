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
public class VehicleAssetEmssnSrcChangeEvent extends SObject {
	public static SObjectType$<VehicleAssetEmssnSrcChangeEvent> SObjectType;
	public static SObjectFields$<VehicleAssetEmssnSrcChangeEvent> Fields;

	public String BusinessRegion;
	public Object ChangeEventHeader;
	public String City;
	public String Country;
	public String CrbnEmssnScopeAlloc;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String FleetVehicleType;
	public Id Id;
	public Boolean IsCompanyOwnedAsset;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Date LeaseExpirationDate;
	public String LeaseIdentifier;
	public String Name;
	public Id OtherEmssnFctrId;
	public OtherEmssnFctrSet OtherEmssnFctr;
	public Id OwnerId;
	public User Owner;
	public Id ParentEmissionSourceId;
	public VehicleAssetEmssnSrc ParentEmissionSource;
	public String PostalCode;
	public String ReplayId;
	public String State;
	public String StreetAddress;
	public String StreetAddress2;
	public String VehicleIdentifier;
	public String VehicleType;

	public VehicleAssetEmssnSrcChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEmssnSrcChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEmssnSrcChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEmssnSrcChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEmssnSrcChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
