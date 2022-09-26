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
public class LightningUsageByPageMetrics extends SObject {
	public static SObjectType$<LightningUsageByPageMetrics> SObjectType;
	public static SObjectFields$<LightningUsageByPageMetrics> Fields;

	public Integer CoresBin2To4;
	public Integer CoresBin4To8;
	public Integer CoresBinOver8;
	public Integer CoresBinUnder2;
	public Integer DownlinkBin3To5;
	public Integer DownlinkBin5To8;
	public Integer DownlinkBin8To10;
	public Integer DownlinkBinOver10;
	public Integer DownlinkBinUnder3;
	public Integer EptBin3To5;
	public Integer EptBin5To8;
	public Integer EptBin8To10;
	public Integer EptBinOver10;
	public Integer EptBinUnder3;
	public Id Id;
	public Date MetricsDate;
	public String PageName;
	public Integer RecordCountEPT;
	public Integer RttBin50To150;
	public Integer RttBinOver150;
	public Integer RttBinUnder50;
	public Integer SumEPT;
	public Datetime SystemModstamp;
	public Integer TotalCount;
	public Id UserId;
	public User User;

	public LightningUsageByPageMetrics clone$() {throw new java.lang.UnsupportedOperationException();}
	public LightningUsageByPageMetrics clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LightningUsageByPageMetrics clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LightningUsageByPageMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LightningUsageByPageMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
