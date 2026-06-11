/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AIInsightValue extends SObject {
	public static SObjectFields$<AIInsightValue> Fields;

	public Id AiInsightActionId;
	public AIInsightAction AiInsightAction;
	public Id AiRecordInsightId;
	public AIRecordInsight AiRecordInsight;
	public Decimal Confidence;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Field;
	public String FieldValueLowerBound;
	public String FieldValueUpperBound;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id SobjectLookupValueId;
	public SObject SobjectLookupValue;
	public String SobjectType;
	public Datetime SystemModstamp;
	public String Value;
	public String ValueType;

	public AIInsightReason[] AIInsightReasons;
	public AIInsightFeedback[] Feedback;

	public AIInsightValue clone$() {throw new java.lang.UnsupportedOperationException();}
	public AIInsightValue clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightValue clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightValue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightValue clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
