/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ProductComponentGrpOverrideChangeEvent extends SObject {
	public static SObjectType$<ProductComponentGrpOverrideChangeEvent> SObjectType;
	public static SObjectFields$<ProductComponentGrpOverrideChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsExcluded;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer MaxBundleComponents;
	public Integer MinBundleComponents;
	public String Name;
	public Id OverrideContextId;
	public SObject OverrideContext;
	public Id OwnerId;
	public User Owner;
	public Id ProductComponentGroupId;
	public ProductComponentGroup ProductComponentGroup;
	public String ReplayId;

	public ProductComponentGrpOverrideChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductComponentGrpOverrideChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductComponentGrpOverrideChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductComponentGrpOverrideChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductComponentGrpOverrideChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
