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
public class ContentVersionComment extends SObject {
	public static SObjectType$<ContentVersionComment> SObjectType;
	public static SObjectFields$<ContentVersionComment> Fields;

	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id ContentVersionId;
	public ContentVersion ContentVersion;
	public Datetime CreatedDate;
	public Id Id;
	public String UserComment;

	public ContentVersionComment clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionComment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionComment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionComment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionComment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
