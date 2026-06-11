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
public class ContentDocumentSubscription extends SObject {
	public static SObjectType$<ContentDocumentSubscription> SObjectType;
	public static SObjectFields$<ContentDocumentSubscription> Fields;

	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id Id;
	public Boolean IsCommentSub;
	public Boolean IsDocumentSub;
	public Id UserId;
	public User User;

	public ContentDocumentSubscription clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentSubscription clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentSubscription clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
