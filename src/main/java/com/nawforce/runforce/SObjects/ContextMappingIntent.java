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
public class ContextMappingIntent extends SObject {
	public static SObjectType$<ContextMappingIntent> SObjectType;
	public static SObjectFields$<ContextMappingIntent> Fields;

	public Id ContextMappingId;
	public ContextMapping ContextMapping;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MappingIntent;
	public Datetime SystemModstamp;

	public ContextMappingIntent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContextMappingIntent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContextMappingIntent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContextMappingIntent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContextMappingIntent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
