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
public class AIInsightReason extends SObject {
	public static SObjectType$<AIInsightReason> SObjectType;
	public static SObjectFields$<AIInsightReason> Fields;

	public Id AiInsightValueId;
	public AIInsightValue AiInsightValue;
	public Decimal Contribution;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String FeatureType;
	public String FeatureValue;
	public String FieldName;
	public String FieldValue;
	public Id Id;
	public Decimal Intensity;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Operator;
	public String ReasonLabelKey;
	public Id RelatedInsightReasonId;
	public AIInsightReason RelatedInsightReason;
	public Integer SortOrder;
	public Datetime SystemModstamp;
	public Decimal Variance;

	public AIInsightReason clone$() {throw new java.lang.UnsupportedOperationException();}
	public AIInsightReason clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightReason clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightReason clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightReason clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
