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
public class FiscalYearSettings extends SObject {
	public static SObjectType$<FiscalYearSettings> SObjectType;
	public static SObjectFields$<FiscalYearSettings> Fields;

	public String Description;
	public Date EndDate;
	public Id Id;
	public Boolean IsStandardYear;
	public String Name;
	public Id PeriodId;
	public Period Period;
	public String PeriodLabelScheme;
	public String PeriodPrefix;
	public String QuarterLabelScheme;
	public String QuarterPrefix;
	public Date StartDate;
	public Datetime SystemModstamp;
	public String WeekLabelScheme;
	public Integer WeekStartDay;
	public String YearType;

	public Period[] Periods;

	public FiscalYearSettings clone$() {throw new java.lang.UnsupportedOperationException();}
	public FiscalYearSettings clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FiscalYearSettings clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FiscalYearSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FiscalYearSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
