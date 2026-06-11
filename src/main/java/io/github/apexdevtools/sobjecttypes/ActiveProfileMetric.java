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
public class ActiveProfileMetric extends SObject {
	public static SObjectType$<ActiveProfileMetric> SObjectType;
	public static SObjectFields$<ActiveProfileMetric> Fields;

	public Integer ActiveUserCount;
	public Integer AssignedUserCount;
	public Id Id;
	public Date MetricsDate;
	public Id ProfileId;
	public Profile Profile;
	public Datetime SystemModstamp;
	public Id UserLicenseId;
	public UserLicense UserLicense;

	public ActiveProfileMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActiveProfileMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActiveProfileMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActiveProfileMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActiveProfileMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
