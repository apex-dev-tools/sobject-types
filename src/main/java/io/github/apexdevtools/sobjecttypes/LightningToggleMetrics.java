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
public class LightningToggleMetrics extends SObject {
	public static SObjectType$<LightningToggleMetrics> SObjectType;
	public static SObjectFields$<LightningToggleMetrics> Fields;

	public String Action;
	public Id Id;
	public Date MetricsDate;
	public Integer RecordCount;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;

	public LightningToggleMetrics clone$() {throw new java.lang.UnsupportedOperationException();}
	public LightningToggleMetrics clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LightningToggleMetrics clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LightningToggleMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LightningToggleMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
