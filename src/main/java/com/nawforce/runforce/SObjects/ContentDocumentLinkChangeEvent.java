/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ContentDocumentLinkChangeEvent extends SObject {
	public static SObjectType$<ContentDocumentLinkChangeEvent> SObjectType;
	public static SObjectFields$<ContentDocumentLinkChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id Id;
	public Id LinkedEntityId;
	public SObject LinkedEntity;
	public String ReplayId;
	public String ShareType;
	public String Visibility;

	public ContentDocumentLinkChangeEvent clone$() {throw new UnsupportedOperationException();}
	public ContentDocumentLinkChangeEvent clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public ContentDocumentLinkChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public ContentDocumentLinkChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public ContentDocumentLinkChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
