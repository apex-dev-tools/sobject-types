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
	public Boolean IsLocalizationDisabled;
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
