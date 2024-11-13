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
public class ContextNodeMapping extends SObject {
	public static SObjectType$<ContextNodeMapping> SObjectType;
	public static SObjectFields$<ContextNodeMapping> Fields;

	public Id ContextMappingId;
	public ContextMapping ContextMapping;
	public Id ContextNodeId;
	public ContextNode ContextNode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public String InheritedFrom;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MappedContextDefinition;
	public String Object;
	public Datetime SystemModstamp;

	public ContextAttributeMapping[] ContextAttributeMappings;
	public ContextNodeAttrDictionary[] ContextNodeAttrDictionaries;

	public ContextNodeMapping clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContextNodeMapping clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContextNodeMapping clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContextNodeMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContextNodeMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
