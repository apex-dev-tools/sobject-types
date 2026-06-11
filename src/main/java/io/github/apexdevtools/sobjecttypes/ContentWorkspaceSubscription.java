/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

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
