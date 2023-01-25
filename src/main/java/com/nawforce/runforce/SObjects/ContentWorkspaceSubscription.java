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
public class ContentWorkspaceSubscription extends SObject {
	public static SObjectType$<ContentWorkspaceSubscription> SObjectType;
	public static SObjectFields$<ContentWorkspaceSubscription> Fields;

	public Id ContentWorkspaceId;
	public ContentWorkspace ContentWorkspace;
	public Id Id;
	public Id UserId;
	public User User;

	public ContentWorkspaceSubscription clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspaceSubscription clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspaceSubscription clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspaceSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspaceSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
