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
public class StnryAssetEnvrSrcChangeEvent extends SObject {
	public static SObjectType$<StnryAssetEnvrSrcChangeEvent> SObjectType;
	public static SObjectFields$<StnryAssetEnvrSrcChangeEvent> Fields;

	public String BusinessRegion;
	public Object ChangeEventHeader;
	public String City;
	public String Country;
	public Id CrbnEmssnScopeAllocId;
	public CrbnEmssnScopeAlloc CrbnEmssnScopeAlloc;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id ElectricityEmssnFctrId;
	public ElectricityEmssnFctrSet ElectricityEmssnFctr;
	public Id EnvironmentalRiskId;
	public EnvironmentalRisk EnvironmentalRisk;
	public Id Id;
	public Boolean IsCompanyOwnedAsset;
	public Boolean IsLeedCertified;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Date LeaseExpirationDate;
	public String LeaseIdentifier;
	public Id MktBsdElectriEmssnFctrId;
	public ElectricityEmssnFctrSet MktBsdElectriEmssnFctr;
	public String Name;
	public Decimal OccupiedFloorArea;
	public String OccupiedFloorAreaUnit;
	public Id OtherEmssnFctrId;
	public OtherEmssnFctrSet OtherEmssnFctr;
	public Id OwnerId;
	public User Owner;
	public Id ParentEnvironmentalSourceId;
	public StnryAssetEnvrSrc ParentEnvironmentalSource;
	public String PostalCode;
	public String PremiseIdentifier;
	public Id RefrigerantEmssnFctrId;
	public RefrigerantEmssnFctr RefrigerantEmssnFctr;
	public Id RegionalBldgEnergyIntensityId;
	public BldgEnrgyIntensity RegionalBldgEnergyIntensity;
	public String ReplayId;
	public String State;
	public String StationaryAssetIdentifier;
	public String StationaryAssetType;
	public String StreetAddress;
	public String StreetAddress2;
	public Decimal TotalFloorArea;
	public String TotalFloorAreaUnit;

	public StnryAssetEnvrSrcChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetEnvrSrcChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetEnvrSrcChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetEnvrSrcChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetEnvrSrcChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
