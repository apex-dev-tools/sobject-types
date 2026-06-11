/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AnalyticRecipeCompleteEvent extends SObject {
	public static SObjectType$<AnalyticRecipeCompleteEvent> SObjectType;
	public static SObjectFields$<AnalyticRecipeCompleteEvent> Fields;

	public Boolean CanTriggerExecution;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public String Message;
	public String RecipeId;
	public String RecipeLabel;
	public String ReplayId;
	public String Requester;
	public Integer Runtime;
	public Datetime StartDate;
	public String Status;
	public Integer WaitTime;

	public AnalyticRecipeCompleteEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticRecipeCompleteEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticRecipeCompleteEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticRecipeCompleteEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticRecipeCompleteEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
