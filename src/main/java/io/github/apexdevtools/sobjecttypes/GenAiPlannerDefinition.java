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
public class GenAiPlannerDefinition extends SObject {
	public static SObjectType$<GenAiPlannerDefinition> SObjectType;
	public static SObjectFields$<GenAiPlannerDefinition> Fields;

	public String AgentGraph;
	public String Capabilities;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String PlannerType;
	public Datetime SystemModstamp;

	public GenAiFunctionDefinition[] GenAiFunctionDefinitions;
	public GenAiPlannerAttrDefinition[] GenAiPlannerAttrDefinitions;
	public GenAiPlannerFunctionDef[] GenAiPlannerPluginDefinitions;
	public GenAiPluginDefinition[] GenAiPluginDefinitions;

	public GenAiPlannerDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public GenAiPlannerDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GenAiPlannerDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GenAiPlannerDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GenAiPlannerDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
