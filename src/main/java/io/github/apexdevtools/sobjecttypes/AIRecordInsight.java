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
public class AIRecordInsight extends SObject {
	public static SObjectType$<AIRecordInsight> SObjectType;
	public static SObjectFields$<AIRecordInsight> Fields;

	public Id AiApplicationId;
	public AIApplication AiApplication;
	public Decimal Confidence;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MlPredictionDefinitionId;
	public MLPredictionDefinition MlPredictionDefinition;
	public Id ModelId;
	public MLModel Model;
	public String Name;
	public String PredictionField;
	public String RunGuid;
	public Datetime RunStartTime;
	public String Status;
	public Datetime SystemModstamp;
	public String TargetField;
	public Id TargetId;
	public SObject Target;
	public String TargetSobjectType;
	public String Type;
	public Datetime ValidUntil;

	public AIInsightAction[] AIInsightActions;
	public AIInsightFeedback[] AIInsightFeedbacks;
	public AIInsightValue[] AIInsightValues;

	public AIRecordInsight clone$() {throw new java.lang.UnsupportedOperationException();}
	public AIRecordInsight clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AIRecordInsight clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AIRecordInsight clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AIRecordInsight clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
