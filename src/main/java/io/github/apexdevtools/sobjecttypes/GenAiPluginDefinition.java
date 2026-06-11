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
public class GenAiPluginDefinition extends SObject {
	public static SObjectType$<GenAiPluginDefinition> SObjectType;
	public static SObjectFields$<GenAiPluginDefinition> Fields;

	public Boolean CanEscalate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsLocal;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LocalDeveloperName;
	public String MasterLabel;
	public String NamespacePrefix;
	public Id ParentId;
	public SObject Parent;
	public Id PlannerId;
	public GenAiPlannerDefinition Planner;
	public String PluginType;
	public String Scope;
	public String Source;
	public Datetime SystemModstamp;

	public GenAiPluginFunctionDef[] GenAIPluginFunctionDefinitions;
	public GenAiFunctionDefinition[] GenAiFunctionDefinitions;

	public GenAiPluginDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public GenAiPluginDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GenAiPluginDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GenAiPluginDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GenAiPluginDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
