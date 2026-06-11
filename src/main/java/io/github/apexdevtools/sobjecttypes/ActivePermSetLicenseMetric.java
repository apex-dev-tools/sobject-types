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
public class ActivePermSetLicenseMetric extends SObject {
	public static SObjectType$<ActivePermSetLicenseMetric> SObjectType;
	public static SObjectFields$<ActivePermSetLicenseMetric> Fields;

	public Integer ActiveUserCount;
	public Integer AssignedUserCount;
	public String DeveloperName;
	public Id Id;
	public String MasterLabel;
	public Date MetricsDate;
	public Id PermissionSetLicenseId;
	public PermissionSetLicense PermissionSetLicense;
	public Datetime SystemModstamp;
	public Integer TotalLicenses;

	public ActivePermSetLicenseMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActivePermSetLicenseMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActivePermSetLicenseMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActivePermSetLicenseMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActivePermSetLicenseMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
