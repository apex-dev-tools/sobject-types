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
public class AIInsightFeedback extends SObject {
	public static SObjectType$<AIInsightFeedback> SObjectType;
	public static SObjectFields$<AIInsightFeedback> Fields;

	public String ActualValue;
	public String AiFeedback;
	public String AiInsightFeedbackType;
	public Id AiRecordInsightId;
	public AIRecordInsight AiRecordInsight;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer Rank;
	public Datetime SystemModstamp;
	public Id ValueId;
	public Name Value;

	public AIInsightFeedback clone$() {throw new java.lang.UnsupportedOperationException();}
	public AIInsightFeedback clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightFeedback clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightFeedback clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightFeedback clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
