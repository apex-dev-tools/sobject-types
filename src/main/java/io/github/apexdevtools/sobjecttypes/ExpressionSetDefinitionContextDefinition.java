/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ExpressionSetDefinitionContextDefinition extends SObject {
	public static SObjectType$<ExpressionSetDefinitionContextDefinition> SObjectType;
	public static SObjectFields$<ExpressionSetDefinitionContextDefinition> Fields;

	public String ContextDefinitionApiName;
	public Id ContextDefinitionId;
	public ContextDefinition ContextDefinition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExecutableContextDefinition;
	public String ExpressionSetApiName;
	public Id ExpressionSetDefinitionId;
	public ExpressionSetDefinition ExpressionSetDefinition;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public ExpressionSetDefinitionContextDefinition clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetDefinitionContextDefinition clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetDefinitionContextDefinition clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetDefinitionContextDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetDefinitionContextDefinition clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
