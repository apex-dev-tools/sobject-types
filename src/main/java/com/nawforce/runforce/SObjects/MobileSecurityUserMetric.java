/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.*;

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
