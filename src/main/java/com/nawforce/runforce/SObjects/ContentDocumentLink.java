/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContentDocumentLink extends SObject {
	public static SObjectType$<ContentDocumentLink> SObjectType;
	public static SObjectFields$<ContentDocumentLink> Fields;

	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id Id;
	public Boolean IsDeleted;
	public Id LinkedEntityId;
	public Name LinkedEntity;
	public String ShareType;
	public Datetime SystemModstamp;
	public String Visibility;

	public ContentDocumentLink clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentLink clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentLink clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
