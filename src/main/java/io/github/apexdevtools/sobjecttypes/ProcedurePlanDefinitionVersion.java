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
public class ProcedurePlanDefinitionVersion extends SObject {
	public static SObjectType$<ProcedurePlanDefinitionVersion> SObjectType;
	public static SObjectFields$<ProcedurePlanDefinitionVersion> Fields;

	public String ContextDefinition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DefaultReadContextMapping;
	public String DefaultSaveContextMapping;
	public String DeveloperName;
	public Datetime EffectiveFrom;
	public Datetime EffectiveTo;
	public Id Id;
	public String InheritedFrom;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ProcedurePlanDefinitionId;
	public ProcedurePlanDefinition ProcedurePlanDefinition;
	public Integer Rank;
	public Datetime SystemModstamp;

	public ProcedurePlanSection[] ProcedurePlanSectionCanonicalMappings;
	public ProcedurePlanVariable[] ProcedurePlanVariableCanonicalMappings;

	public ProcedurePlanDefinitionVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanDefinitionVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanDefinitionVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanDefinitionVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanDefinitionVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
