/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MobileSecurityUserMetric extends SObject {
	public static SObjectType$<MobileSecurityUserMetric> SObjectType;
	public static SObjectFields$<MobileSecurityUserMetric> Fields;

	public Id Id;
	public Date MetricsDate;
	public Datetime SystemModstamp;
	public Decimal UserCount;

	public MobileSecurityUserMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public MobileSecurityUserMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MobileSecurityUserMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MobileSecurityUserMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MobileSecurityUserMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
