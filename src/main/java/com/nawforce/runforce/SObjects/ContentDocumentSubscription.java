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

	public ContentDocumentSubscription clone$() {throw new UnsupportedOperationException();}
	public ContentDocumentSubscription clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public ContentDocumentSubscription clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public ContentDocumentSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public ContentDocumentSubscription clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
