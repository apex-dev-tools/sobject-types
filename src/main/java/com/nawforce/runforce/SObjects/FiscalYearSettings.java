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
public class FiscalYearSettings extends SObject {
	public static SObjectType$<FiscalYearSettings> SObjectType;
	public static SObjectFields$<FiscalYearSettings> Fields;

	public com.nawforce.runforce.System.String Description;
	public Date EndDate;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsStandardYear;
	public com.nawforce.runforce.System.String Name;
	public Id PeriodId;
	public Period Period;
	public com.nawforce.runforce.System.String PeriodLabelScheme;
	public com.nawforce.runforce.System.String PeriodPrefix;
	public com.nawforce.runforce.System.String QuarterLabelScheme;
	public com.nawforce.runforce.System.String QuarterPrefix;
	public Date StartDate;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String WeekLabelScheme;
	public com.nawforce.runforce.System.Integer WeekStartDay;
	public com.nawforce.runforce.System.String YearType;

	public Period[] Periods;

	public FiscalYearSettings clone$() {throw new java.lang.UnsupportedOperationException();}
	public FiscalYearSettings clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FiscalYearSettings clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FiscalYearSettings clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FiscalYearSettings clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
