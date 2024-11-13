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
public class ContextAttrHydrationDetail extends SObject {
	public static SObjectType$<ContextAttrHydrationDetail> SObjectType;
	public static SObjectFields$<ContextAttrHydrationDetail> Fields;

	public Id ContextAttributeMappingId;
	public ContextAttributeMapping ContextAttributeMapping;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public String InheritedFrom;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ObjectName;
	public Id ParentHydrationDetailId;
	public ContextAttrHydrationDetail ParentHydrationDetail;
	public String QueryAttribute;
	public Datetime SystemModstamp;

	public ContextAttrHydrationDetail[] ContextAttrHydrationDetails;

	public ContextAttrHydrationDetail clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContextAttrHydrationDetail clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContextAttrHydrationDetail clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContextAttrHydrationDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContextAttrHydrationDetail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
