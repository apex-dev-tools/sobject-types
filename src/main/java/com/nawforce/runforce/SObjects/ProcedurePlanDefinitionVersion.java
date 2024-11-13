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
