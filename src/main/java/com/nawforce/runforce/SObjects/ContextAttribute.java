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
public class ContextAttribute extends SObject {
	public static SObjectType$<ContextAttribute> SObjectType;
	public static SObjectFields$<ContextAttribute> Fields;

	public Id ContextNodeId;
	public ContextNode ContextNode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Description;
	public String DisplayName;
	public String DomainSet;
	public String FieldType;
	public Id Id;
	public String InheritedFrom;
	public Boolean IsCustomMappingAllowed;
	public Boolean IsDeleted;
	public Boolean IsKey;
	public Boolean IsTransient;
	public Boolean IsValue;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;
	public String Title;

	public ContextAttributeMapping[] ContextAttributeMappings;
	public ContextTag[] ContextTags;

	public ContextAttribute clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContextAttribute clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContextAttribute clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContextAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContextAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
