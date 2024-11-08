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
public class ContextMapping extends SObject {
	public static SObjectType$<ContextMapping> SObjectType;
	public static SObjectFields$<ContextMapping> Fields;

	public Id ContextDefinitionVersionId;
	public ContextDefinitionVersion ContextDefinitionVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public String InheritedFrom;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;
	public String Title;

	public ContextMappingIntent[] ContextMappingIntents;
	public ContextNodeMapping[] ContextNodeMappings;

	public ContextMapping clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContextMapping clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContextMapping clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContextMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContextMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
