/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ForecastingUserPreference extends SObject {
	public static SObjectType$<ForecastingUserPreference> SObjectType;
	public static SObjectFields$<ForecastingUserPreference> Fields;

	public String ExternalId;
	public Id ForecastingDisplayedTypeId;
	public ForecastingType ForecastingDisplayedType;
	public Integer ForecastingPeriodDuration;
	public String ForecastingPeriodType;
	public Integer ForecastingStartPeriod;
	public String ForecastingViewCurrency;
	public Id Id;
	public Boolean IsForecastingHideZeroRows;
	public Boolean IsForecastingShowQuantity;
	public Boolean IsHideForecastingGuidedTour;
	public Boolean IsHideForecastingQuotaColumn;
	public Boolean IsShowForecastingChangeSignals;
	public Boolean IsShowForecastingQuotaAttainment;
	public Boolean IsShowForecastingRoundedAmounts;

	public ForecastingUserPreference clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingUserPreference clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingUserPreference clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingUserPreference clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingUserPreference clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
