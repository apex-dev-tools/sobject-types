/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ForecastingFact extends SObject {
	public static SObjectType$<ForecastingFact> SObjectType;
	public static SObjectFields$<ForecastingFact> Fields;

	public String ForecastCategoryName;
	public Id ForecastedObjectId;
	public SObject ForecastedObject;
	public Id ForecastedSubObjectId;
	public SObject ForecastedSubObject;
	public Id ForecastingItemId;
	public ForecastingItem ForecastingItem;
	public Id ForecastingTypeId;
	public ForecastingType ForecastingType;
	public Id Id;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public Id OwnerId;
	public User Owner;
	public Id PeriodId;
	public Period Period;
	public Datetime SystemModstamp;
	public Decimal TargetValue;
	public Id Territory2Id;
	public Territory2 Territory2;

	public ForecastingFact clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingFact clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingFact clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingFact clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingFact clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
