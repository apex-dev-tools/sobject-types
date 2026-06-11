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
public class CustomObjectUserLicenseMetrics extends SObject {
	public static SObjectType$<CustomObjectUserLicenseMetrics> SObjectType;
	public static SObjectFields$<CustomObjectUserLicenseMetrics> Fields;

	public String CustomObjectId;
	public String CustomObjectName;
	public String CustomObjectType;
	public Id Id;
	public Date MetricsDate;
	public Integer ObjectCount;
	public Datetime SystemModstamp;
	public Id UserLicenseId;
	public UserLicense UserLicense;

	public CustomObjectUserLicenseMetrics clone$() {throw new java.lang.UnsupportedOperationException();}
	public CustomObjectUserLicenseMetrics clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CustomObjectUserLicenseMetrics clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CustomObjectUserLicenseMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CustomObjectUserLicenseMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
