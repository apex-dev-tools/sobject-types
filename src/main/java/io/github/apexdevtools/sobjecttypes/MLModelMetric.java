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
public class MLModelMetric extends SObject {
	public static SObjectType$<MLModelMetric> SObjectType;
	public static SObjectFields$<MLModelMetric> Fields;

	public Decimal BasicMetricValue;
	public String ComplexMetricValue;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataSetType;
	public Datetime EndTime;
	public String GraphType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MetricType;
	public Id ModelId;
	public MLModel Model;
	public String Name;
	public Integer RowCount;
	public String Span;
	public Datetime StartTime;
	public Datetime SystemModstamp;

	public MLModelMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public MLModelMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MLModelMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MLModelMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MLModelMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
