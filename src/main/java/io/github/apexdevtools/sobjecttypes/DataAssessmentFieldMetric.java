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
public class DataAssessmentFieldMetric extends SObject {
	public static SObjectType$<DataAssessmentFieldMetric> SObjectType;
	public static SObjectFields$<DataAssessmentFieldMetric> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataAssessmentMetricId;
	public DataAssessmentMetric DataAssessmentMetric;
	public String FieldName;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer NumMatchedBlanks;
	public Integer NumMatchedDifferent;
	public Integer NumMatchedInSync;
	public Integer NumUnmatchedBlanks;
	public Datetime SystemModstamp;

	public DataAssessmentValueMetric[] DataAssessmentValueMetrics;

	public DataAssessmentFieldMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataAssessmentFieldMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataAssessmentFieldMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataAssessmentFieldMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataAssessmentFieldMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
