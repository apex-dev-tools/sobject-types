/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class VisualforceAccessMetrics extends SObject {
	public static SObjectType$<VisualforceAccessMetrics> SObjectType;
	public static SObjectFields$<VisualforceAccessMetrics> Fields;

	public Id ApexPageId;
	public ApexPage ApexPage;
	public Integer DailyPageViewCount;
	public Id Id;
	public Date LogDate;
	public Date MetricsDate;
	public Id ProfileId;
	public Profile Profile;
	public Datetime SystemModstamp;

	public VisualforceAccessMetrics clone$() {throw new java.lang.UnsupportedOperationException();}
	public VisualforceAccessMetrics clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VisualforceAccessMetrics clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VisualforceAccessMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VisualforceAccessMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
