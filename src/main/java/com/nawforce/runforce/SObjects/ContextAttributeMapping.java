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
public class ContextAttributeMapping extends SObject {
	public static SObjectType$<ContextAttributeMapping> SObjectType;
	public static SObjectFields$<ContextAttributeMapping> Fields;

	public Id ContextAttributeId;
	public ContextAttribute ContextAttribute;
	public String ContextInputAttributeName;
	public Id ContextNodeMappingId;
	public ContextNodeMapping ContextNodeMapping;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public String InheritedFrom;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public ContextAttrHydrationDetail[] ContextAttrHydrationDetails;
	public CtxAttrHydrationCtx[] CtxAttrHydrationCtxs;

	public ContextAttributeMapping clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContextAttributeMapping clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContextAttributeMapping clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContextAttributeMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContextAttributeMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
