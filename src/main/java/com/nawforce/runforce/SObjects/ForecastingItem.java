/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ForecastingItem extends SObject {
	public static SObjectType$<ForecastingItem> SObjectType;
	public static SObjectFields$<ForecastingItem> Fields;

	public Decimal AmountWithoutAdjustments;
	public Decimal AmountWithoutManagerAdjustment;
	public Decimal AmountWithoutOwnerAdjustment;
	public String CurrencyIsoCode;
	public Decimal ForecastAmount;
	public String ForecastCategoryName;
	public Decimal ForecastQuantity;
	public String ForecastingItemCategory;
	public Id ForecastingTypeId;
	public ForecastingType ForecastingType;
	public Boolean HasAdjustment;
	public Boolean HasOwnerAdjustment;
	public Id Id;
	public Boolean IsAmount;
	public Boolean IsQuantity;
	public Boolean IsUpToDate;
	public Id OwnerId;
	public User Owner;
	public Decimal OwnerOnlyAmount;
	public Decimal OwnerOnlyQuantity;
	public Id ParentForecastingItemId;
	public ForecastingItem ParentForecastingItem;
	public Id PeriodId;
	public Period Period;
	public String ProductFamily;
	public Decimal QuantityWithoutAdjustments;
	public Decimal QuantityWithoutManagerAdjustment;
	public Decimal QuantityWithoutOwnerAdjustment;
	public Integer SubordinateOverrides;
	public Datetime SystemModstamp;
	public Id Territory2Id;
	public Territory2 Territory2;

	public ForecastingFact[] ForecastingFacts;

	public ForecastingItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
