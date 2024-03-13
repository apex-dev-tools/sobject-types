/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AIMetric extends SObject {
	public static SObjectType$<AIMetric> SObjectType;
	public static SObjectFields$<AIMetric> Fields;

	public Decimal BasicMetricValue;
	public String ComplexMetricValue;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EndTime;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MetricOrigin;
	public String MetricType;
	public String Name;
	public Integer RowCount;
	public String Span;
	public Datetime StartTime;
	public Datetime SystemModstamp;

	public AIMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public AIMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AIMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AIMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AIMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
