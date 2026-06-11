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
public class CtxAttrHydrationCtx extends SObject {
	public static SObjectType$<CtxAttrHydrationCtx> SObjectType;
	public static SObjectFields$<CtxAttrHydrationCtx> Fields;

	public Id ContextAttributeMappingId;
	public ContextAttributeMapping ContextAttributeMapping;
	public String ContextQueryAttribute;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public String InheritedFrom;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public CtxAttrHydrationCtx clone$() {throw new java.lang.UnsupportedOperationException();}
	public CtxAttrHydrationCtx clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CtxAttrHydrationCtx clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CtxAttrHydrationCtx clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CtxAttrHydrationCtx clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
