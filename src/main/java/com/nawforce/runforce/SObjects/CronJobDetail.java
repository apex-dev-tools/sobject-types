/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class CronJobDetail extends SObject {
	public static SObjectType$<CronJobDetail> SObjectType;
	public static SObjectFields$<CronJobDetail> Fields;

	public Id Id;
	public String JobType;
	public String Name;

	public CronJobDetail clone$() {throw new java.lang.UnsupportedOperationException();}
	public CronJobDetail clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CronJobDetail clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CronJobDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CronJobDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
