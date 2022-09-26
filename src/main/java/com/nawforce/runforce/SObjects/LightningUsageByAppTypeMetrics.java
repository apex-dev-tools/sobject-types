/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LightningUsageByAppTypeMetrics extends SObject {
	public static SObjectType$<LightningUsageByAppTypeMetrics> SObjectType;
	public static SObjectFields$<LightningUsageByAppTypeMetrics> Fields;

	public String AppExperience;
	public Id Id;
	public Date MetricsDate;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;

	public LightningUsageByAppTypeMetrics clone$() {throw new java.lang.UnsupportedOperationException();}
	public LightningUsageByAppTypeMetrics clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LightningUsageByAppTypeMetrics clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LightningUsageByAppTypeMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LightningUsageByAppTypeMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
