/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ForecastingItem extends SObject {
	public static SObjectType$<ForecastingItem> SObjectType;
	public static SObjectFields$<ForecastingItem> Fields;

	public Decimal AmountWithoutAdjustments;
	public Decimal AmountWithoutManagerAdjustment;
	public Decimal AmountWithoutOwnerAdjustment;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Decimal ForecastAmount;
	public com.nawforce.runforce.System.String ForecastCategoryName;
	public Decimal ForecastQuantity;
	public com.nawforce.runforce.System.String ForecastingItemCategory;
	public Id ForecastingTypeId;
	public ForecastingType ForecastingType;
	public com.nawforce.runforce.System.Boolean HasAdjustment;
	public com.nawforce.runforce.System.Boolean HasOwnerAdjustment;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsAmount;
	public com.nawforce.runforce.System.Boolean IsQuantity;
	public com.nawforce.runforce.System.Boolean IsUpToDate;
	public Id OwnerId;
	public User Owner;
	public Decimal OwnerOnlyAmount;
	public Decimal OwnerOnlyQuantity;
	public Id ParentForecastingItemId;
	public ForecastingItem ParentForecastingItem;
	public Id PeriodId;
	public Period Period;
	public com.nawforce.runforce.System.String ProductFamily;
	public Decimal QuantityWithoutAdjustments;
	public Decimal QuantityWithoutManagerAdjustment;
	public Decimal QuantityWithoutOwnerAdjustment;
	public com.nawforce.runforce.System.Integer SubordinateOverrides;
	public Datetime SystemModstamp;
	public Id Territory2Id;
	public Territory2 Territory2;

	public ForecastingFact[] ForecastingFacts;

	public ForecastingItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingItem clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingItem clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingItem clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingItem clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
