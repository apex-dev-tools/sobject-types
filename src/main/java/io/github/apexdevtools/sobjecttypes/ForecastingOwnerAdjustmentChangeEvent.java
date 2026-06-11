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
public class ForecastingOwnerAdjustmentChangeEvent extends SObject {
	public static SObjectType$<ForecastingOwnerAdjustmentChangeEvent> SObjectType;
	public static SObjectFields$<ForecastingOwnerAdjustmentChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ForecastCategoryName;
	public Id ForecastOwnerId;
	public User ForecastOwner;
	public Id ForecastingGroupItemId;
	public ForecastingGroupItem ForecastingGroupItem;
	public String ForecastingItemCategory;
	public Id ForecastingItemId;
	public ForecastingItem ForecastingItem;
	public Id ForecastingTypeId;
	public ForecastingType ForecastingType;
	public Id Id;
	public Boolean IsAmount;
	public Boolean IsQuantity;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal OwnerAdjustedAmount;
	public Decimal OwnerAdjustedQuantity;
	public String OwnerAdjustmentNote;
	public Id PeriodId;
	public Period Period;
	public String ProductFamily;
	public String ReplayId;
	public Date StartDate;
	public Id Territory2Id;
	public Territory2 Territory2;

	public ForecastingOwnerAdjustmentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingOwnerAdjustmentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingOwnerAdjustmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingOwnerAdjustmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingOwnerAdjustmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
