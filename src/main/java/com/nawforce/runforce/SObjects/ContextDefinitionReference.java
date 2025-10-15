/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContextDefinitionReference extends SObject {
	public static SObjectType$<ContextDefinitionReference> SObjectType;
	public static SObjectFields$<ContextDefinitionReference> Fields;

	public Id ContextDefinitionId;
	public ContextDefinition ContextDefinition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public String InheritedFrom;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ReferenceContextDefinition;
	public Datetime SystemModstamp;

	public ContextDefinitionReference clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContextDefinitionReference clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContextDefinitionReference clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContextDefinitionReference clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContextDefinitionReference clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
