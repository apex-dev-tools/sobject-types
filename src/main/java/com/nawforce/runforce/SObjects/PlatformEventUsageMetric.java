/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PlatformEventUsageMetric extends SObject {
	public static SObjectType$<PlatformEventUsageMetric> SObjectType;
	public static SObjectFields$<PlatformEventUsageMetric> Fields;

	public Datetime EndDate;
	public String ExternalId;
	public Id Id;
	public String Name;
	public Datetime StartDate;
	public Long Value;

	public PlatformEventUsageMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public PlatformEventUsageMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PlatformEventUsageMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PlatformEventUsageMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PlatformEventUsageMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
