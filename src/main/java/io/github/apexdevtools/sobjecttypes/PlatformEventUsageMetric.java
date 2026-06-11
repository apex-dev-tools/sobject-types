/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PlatformEventUsageMetric extends SObject {
	public static SObjectType$<PlatformEventUsageMetric> SObjectType;
	public static SObjectFields$<PlatformEventUsageMetric> Fields;

	public Datetime EndDate;
	public String ExternalId;
	public Id Id;
	public String Name;
	public Datetime StartDate;
	public Long Value;

	public PlatformEventUsageMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public PlatformEventUsageMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PlatformEventUsageMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PlatformEventUsageMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PlatformEventUsageMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
