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
