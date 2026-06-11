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
public class EnergyAttrCreditDstrChangeEvent extends SObject {
	public static SObjectType$<EnergyAttrCreditDstrChangeEvent> SObjectType;
	public static SObjectFields$<EnergyAttrCreditDstrChangeEvent> Fields;

	public Datetime AllocationDate;
	public Object ChangeEventHeader;
	public String CleanEnergyType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id EnergyAttrCertCreditId;
	public EnergyAttrCertCredit EnergyAttrCertCredit;
	public Decimal EnrgyAttrCrAllocCost;
	public Decimal EnrgyAttrCreditsAlloc;
	public Decimal EnrgyAttrCreditsAllocInKwh;
	public Decimal EnrgyAttrCreditsAllocInMwh;
	public String EnrgyAttrCreditsUnit;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Id StnryAssetEnergyUseId;
	public StnryAssetEnrgyUse StnryAssetEnergyUse;

	public EnergyAttrCreditDstrChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCreditDstrChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCreditDstrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCreditDstrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCreditDstrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
