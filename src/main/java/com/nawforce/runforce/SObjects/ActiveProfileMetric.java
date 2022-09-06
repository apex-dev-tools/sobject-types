/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.*;

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
