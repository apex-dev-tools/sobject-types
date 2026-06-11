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
public class DataAssessmentMetric extends SObject {
	public static SObjectType$<DataAssessmentMetric> SObjectType;
	public static SObjectFields$<DataAssessmentMetric> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer NumDuplicates;
	public Integer NumMatched;
	public Integer NumMatchedDifferent;
	public Integer NumProcessed;
	public Integer NumTotal;
	public Integer NumUnmatched;
	public Datetime SystemModstamp;

	public DataAssessmentFieldMetric[] DataAssessmentMetrics;

	public DataAssessmentMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataAssessmentMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataAssessmentMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataAssessmentMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataAssessmentMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
