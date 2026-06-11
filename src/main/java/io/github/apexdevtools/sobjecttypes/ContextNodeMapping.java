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
