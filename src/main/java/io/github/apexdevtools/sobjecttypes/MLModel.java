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
public class MLModel extends SObject {
	public static SObjectType$<MLModel> SObjectType;
	public static SObjectFields$<MLModel> Fields;

	public String ApprovalStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Dataset;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ModelType;
	public String Name;
	public Id PredictionDefinitionId;
	public MLPredictionDefinition PredictionDefinition;
	public Id RecommendationDefinitionId;
	public MLRecommendationDefinition RecommendationDefinition;
	public String ScoringStatus;
	public Datetime SystemModstamp;
	public Datetime TrainingEndTime;
	public Datetime TrainingStartTime;

	public MLModelFactor[] MLModelFactors;
	public MLModelMetric[] MLModelMetrics;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public MLModel clone$() {throw new java.lang.UnsupportedOperationException();}
	public MLModel clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MLModel clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MLModel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MLModel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
