/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
