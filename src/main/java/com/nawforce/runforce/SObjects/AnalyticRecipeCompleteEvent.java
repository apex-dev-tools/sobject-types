/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
