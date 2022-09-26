/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class ContentWorkspaceDoc extends SObject {
	public static SObjectType$<ContentWorkspaceDoc> SObjectType;
	public static SObjectFields$<ContentWorkspaceDoc> Fields;

	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id ContentWorkspaceId;
	public ContentWorkspace ContentWorkspace;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsOwner;
	public Datetime SystemModstamp;

	public ContentWorkspaceDoc clone$() {throw new UnsupportedOperationException();}
	public ContentWorkspaceDoc clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public ContentWorkspaceDoc clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public ContentWorkspaceDoc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public ContentWorkspaceDoc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
