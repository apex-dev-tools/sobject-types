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
public class ActivePermSetLicenseMetric extends SObject {
	public static SObjectType$<ActivePermSetLicenseMetric> SObjectType;
	public static SObjectFields$<ActivePermSetLicenseMetric> Fields;

	public Integer ActiveUserCount;
	public Integer AssignedUserCount;
	public Id Id;
	public Date MetricsDate;
	public Id PermissionSetLicenseId;
	public PermissionSetLicense PermissionSetLicense;
	public Datetime SystemModstamp;

	public ActivePermSetLicenseMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActivePermSetLicenseMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActivePermSetLicenseMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActivePermSetLicenseMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActivePermSetLicenseMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
