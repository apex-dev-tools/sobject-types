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
public class ActiveFeatureLicenseMetric extends SObject {
	public static SObjectType$<ActiveFeatureLicenseMetric> SObjectType;
	public static SObjectFields$<ActiveFeatureLicenseMetric> Fields;

	public Integer ActiveUserCount;
	public Integer AssignedUserCount;
	public String FeatureType;
	public Id Id;
	public Date MetricsDate;
	public Datetime SystemModstamp;
	public Integer TotalLicenseCount;

	public ActiveFeatureLicenseMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActiveFeatureLicenseMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActiveFeatureLicenseMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActiveFeatureLicenseMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActiveFeatureLicenseMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
