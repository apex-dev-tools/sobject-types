/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class ContentBody extends SObject {
	public static SObjectType$<ContentBody> SObjectType;
	public static SObjectFields$<ContentBody> Fields;

	public Id Id;
	public Boolean IsDeleted;

	public ContentBody clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentBody clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentBody clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentBody clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentBody clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
