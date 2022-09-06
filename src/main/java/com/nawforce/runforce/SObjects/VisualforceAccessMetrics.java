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
public class VisualforceAccessMetrics extends SObject {
	public static SObjectType$<VisualforceAccessMetrics> SObjectType;
	public static SObjectFields$<VisualforceAccessMetrics> Fields;

	public Id ApexPageId;
	public ApexPage ApexPage;
	public Integer DailyPageViewCount;
	public Id Id;
	public Date LogDate;
	public Date MetricsDate;
	public Id ProfileId;
	public Profile Profile;
	public Datetime SystemModstamp;

	public VisualforceAccessMetrics clone$() {throw new java.lang.UnsupportedOperationException();}
	public VisualforceAccessMetrics clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VisualforceAccessMetrics clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VisualforceAccessMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VisualforceAccessMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
