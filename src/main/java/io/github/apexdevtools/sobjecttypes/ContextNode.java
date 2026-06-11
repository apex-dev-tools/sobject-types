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
public class ContextNode extends SObject {
	public static SObjectType$<ContextNode> SObjectType;
	public static SObjectFields$<ContextNode> Fields;

	public Id CanonicalNodeId;
	public ContextNode CanonicalNode;
	public Id ContextDefinitionVersionId;
	public ContextDefinitionVersion ContextDefinitionVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DisplayName;
	public Id Id;
	public String InheritedFrom;
	public Boolean IsCustomMappingAllowed;
	public Boolean IsDeleted;
	public Boolean IsTransposable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;
	public String Title;

	public ContextAttribute[] ContextAttributes;
	public ContextNodeAttrDictionary[] ContextNodeAttrDictionaries;
	public ContextNodeMapping[] ContextNodeMappings;
	public ContextNode[] ContextRelationshipNodes;
	public ContextTag[] ContextTags;

	public ContextNode clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContextNode clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContextNode clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContextNode clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContextNode clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
