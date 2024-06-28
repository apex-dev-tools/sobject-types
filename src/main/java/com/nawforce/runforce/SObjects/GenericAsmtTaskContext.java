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
public class GenericAsmtTaskContext extends SObject {
	public static SObjectType$<GenericAsmtTaskContext> SObjectType;
	public static SObjectFields$<GenericAsmtTaskContext> Fields;

	public Id ContextId;
	public Name Context;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DefinitionReferenceId;
	public GenericAsmtTaskContext DefinitionReference;
	public String Description;
	public Datetime EndDateTime;
	public Id GenericTaskRelationId;
	public Name GenericTaskRelation;
	public Id Id;
	public String ImplementorType;
	public Boolean IsDefinition;
	public Boolean IsDeleted;
	public Boolean IsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime StartDateTime;
	public String Status;
	public String StatusCode;
	public Datetime SystemModstamp;

	public GenericAsmtTaskContext clone$() {throw new java.lang.UnsupportedOperationException();}
	public GenericAsmtTaskContext clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GenericAsmtTaskContext clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GenericAsmtTaskContext clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GenericAsmtTaskContext clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
