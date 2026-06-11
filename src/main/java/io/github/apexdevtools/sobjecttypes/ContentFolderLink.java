/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

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
