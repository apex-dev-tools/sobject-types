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
