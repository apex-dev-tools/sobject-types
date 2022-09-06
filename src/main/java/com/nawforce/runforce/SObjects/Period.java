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

	public Period clone$() {throw new java.lang.UnsupportedOperationException();}
	public Period clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Period clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Period clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Period clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
