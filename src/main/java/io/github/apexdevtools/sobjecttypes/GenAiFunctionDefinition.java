/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class GenAiFunctionDefinition extends SObject {
	public static SObjectType$<GenAiFunctionDefinition> SObjectType;
	public static SObjectFields$<GenAiFunctionDefinition> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public String InvocationTarget;
	public String InvocationTargetType;
	public Boolean IsConfirmationRequired;
	public Boolean IsDeleted;
	public Boolean IsIncludeInProgressIndicator;
	public Boolean IsLocal;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LocalDeveloperName;
	public String MasterLabel;
	public String NamespacePrefix;
	public Id ParentId;
	public GenAiPlannerFunctionDef Parent;
	public Id PlannerId;
	public GenAiPlannerDefinition Planner;
	public Id PluginId;
	public GenAiPluginDefinition Plugin;
	public String ProgressIndicatorMessage;
	public String Source;
	public Datetime SystemModstamp;

	public GenAiPlannerAttrDefinition[] GenAiPlannerAttrDefinitions;

	public GenAiFunctionDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public GenAiFunctionDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GenAiFunctionDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GenAiFunctionDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GenAiFunctionDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
