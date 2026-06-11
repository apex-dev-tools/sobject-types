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
public class GenAiPlannerAttrDefinition extends SObject {
	public static SObjectType$<GenAiPlannerAttrDefinition> SObjectType;
	public static SObjectFields$<GenAiPlannerAttrDefinition> Fields;

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
	public String MappingType;
	public String MasterLabel;
	public String ParameterName;
	public Id ParentId;
	public Name Parent;
	public Datetime SystemModstamp;

	public GenAiPlannerAttrDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public GenAiPlannerAttrDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GenAiPlannerAttrDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GenAiPlannerAttrDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GenAiPlannerAttrDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
