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
