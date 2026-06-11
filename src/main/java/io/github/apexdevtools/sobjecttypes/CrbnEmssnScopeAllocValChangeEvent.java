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
public class CrbnEmssnScopeAllocValChangeEvent extends SObject {
	public static SObjectType$<CrbnEmssnScopeAllocValChangeEvent> SObjectType;
	public static SObjectFields$<CrbnEmssnScopeAllocValChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CrbnEmssnScopeAllocId;
	public CrbnEmssnScopeAlloc CrbnEmssnScopeAlloc;
	public Id CrbnEmssnScopeAllocValFuelTypeRefId;
	public FuelType CrbnEmssnScopeAllocValFuelTypeRef;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String FuelType;
	public String FuelTypeAllocation;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;

	public CrbnEmssnScopeAllocValChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CrbnEmssnScopeAllocValChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CrbnEmssnScopeAllocValChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CrbnEmssnScopeAllocValChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CrbnEmssnScopeAllocValChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
