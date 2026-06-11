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
public class PackagePushJob extends SObject {
	public static SObjectType$<PackagePushJob> SObjectType;
	public static SObjectFields$<PackagePushJob> Fields;

	public Integer DurationSeconds;
	public Datetime EndTime;
	public Id Id;
	public Id PackagePushRequestId;
	public PackagePushRequest PackagePushRequest;
	public Datetime StartTime;
	public String Status;
	public String SubscriberOrganizationKey;
	public Datetime SystemModstamp;

	public PackagePushError[] PackagePushErrors;

	public PackagePushJob clone$() {throw new java.lang.UnsupportedOperationException();}
	public PackagePushJob clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PackagePushJob clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PackagePushJob clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PackagePushJob clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
