/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AIInsightAction extends SObject {
	public static SObjectType$<AIInsightAction> SObjectType;
	public static SObjectFields$<AIInsightAction> Fields;

	public Id ActionId;
	public Name Action;
	public String ActionName;
	public Id AiRecordInsightId;
	public AIRecordInsight AiRecordInsight;
	public Decimal Confidence;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime SystemModstamp;
	public String Type;

	public AIInsightValue[] AiInsightActions;
	public AIInsightFeedback[] Feedback;

	public AIInsightAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public AIInsightAction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightAction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AIInsightAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
