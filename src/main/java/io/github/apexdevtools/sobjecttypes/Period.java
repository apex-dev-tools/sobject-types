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
public class Period extends SObject {
	public static SObjectType$<Period> SObjectType;
	public static SObjectFields$<Period> Fields;

	public Date EndDate;
	public Id FiscalYearSettingsId;
	public FiscalYearSettings FiscalYearSettings;
	public String FullyQualifiedLabel;
	public Id Id;
	public Boolean IsForecastPeriod;
	public Integer Number;
	public String PeriodLabel;
	public String QuarterLabel;
	public Date StartDate;
	public Datetime SystemModstamp;
	public String Type;

	public AdvAccountForecastFact[] AdvAcctForecastFacts;
	public EmissionsForecastFact[] EmssnForecastFactYear;

	public Period clone$() {throw new java.lang.UnsupportedOperationException();}
	public Period clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Period clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Period clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Period clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
