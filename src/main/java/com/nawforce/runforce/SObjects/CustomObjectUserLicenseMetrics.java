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
