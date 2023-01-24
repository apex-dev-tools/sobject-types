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
public class ContentFolderLink extends SObject {
	public static SObjectType$<ContentFolderLink> SObjectType;
	public static SObjectFields$<ContentFolderLink> Fields;

	public Id ContentFolderId;
	public ContentFolder ContentFolder;
	public String EnableFolderStatus;
	public Id Id;
	public Boolean IsDeleted;
	public Id ParentEntityId;
	public ContentWorkspace ParentEntity;

	public ContentFolderLink clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentFolderLink clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentFolderLink clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentFolderLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentFolderLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
