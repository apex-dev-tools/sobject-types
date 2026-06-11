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
public class LightningExitByPageMetrics extends SObject {
	public static SObjectType$<LightningExitByPageMetrics> SObjectType;
	public static SObjectFields$<LightningExitByPageMetrics> Fields;

	public Id Id;
	public Date MetricsDate;
	public String PageName;
	public Integer RecordCount;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;

	public LightningExitByPageMetrics clone$() {throw new java.lang.UnsupportedOperationException();}
	public LightningExitByPageMetrics clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LightningExitByPageMetrics clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LightningExitByPageMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LightningExitByPageMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
