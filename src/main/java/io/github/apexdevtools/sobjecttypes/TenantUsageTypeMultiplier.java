/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class TenantUsageTypeMultiplier extends SObject {
	public static SObjectType$<TenantUsageTypeMultiplier> SObjectType;
	public static SObjectFields$<TenantUsageTypeMultiplier> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EffEndDateTime;
	public Datetime EffStartDateTime;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MgmtUsageTypeMultiplier;
	public Decimal Multiplier;
	public String MultiplierType;
	public String Name;
	public Datetime SystemModstamp;
	public Decimal Unit;
	public String UsageSubType0;
	public String UsageSubType1;
	public String UsageSubType2;
	public String UsageTypeDef;

	public TenantUsageTypeMultiplier clone$() {throw new java.lang.UnsupportedOperationException();}
	public TenantUsageTypeMultiplier clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TenantUsageTypeMultiplier clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TenantUsageTypeMultiplier clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TenantUsageTypeMultiplier clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
