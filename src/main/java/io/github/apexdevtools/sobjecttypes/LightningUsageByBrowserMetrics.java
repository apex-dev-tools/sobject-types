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
public class LightningUsageByBrowserMetrics extends SObject {
	public static SObjectType$<LightningUsageByBrowserMetrics> SObjectType;
	public static SObjectFields$<LightningUsageByBrowserMetrics> Fields;

	public String Browser;
	public Integer EptBin3To5;
	public Integer EptBin5To8;
	public Integer EptBin8To10;
	public Integer EptBinOver10;
	public Integer EptBinUnder3;
	public Id Id;
	public Date MetricsDate;
	public String PageName;
	public Integer RecordCountEPT;
	public Integer SumEPT;
	public Datetime SystemModstamp;
	public Integer TotalCount;

	public LightningUsageByBrowserMetrics clone$() {throw new java.lang.UnsupportedOperationException();}
	public LightningUsageByBrowserMetrics clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LightningUsageByBrowserMetrics clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LightningUsageByBrowserMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LightningUsageByBrowserMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
