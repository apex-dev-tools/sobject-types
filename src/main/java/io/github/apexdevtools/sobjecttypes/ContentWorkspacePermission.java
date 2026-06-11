/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ContentWorkspacePermission extends SObject {
	public static SObjectType$<ContentWorkspacePermission> SObjectType;
	public static SObjectFields$<ContentWorkspacePermission> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Boolean PermissionsAddComment;
	public Boolean PermissionsAddContent;
	public Boolean PermissionsAddContentOBO;
	public Boolean PermissionsArchiveContent;
	public Boolean PermissionsChatterSharing;
	public Boolean PermissionsDeleteContent;
	public Boolean PermissionsDeliverContent;
	public Boolean PermissionsFeatureContent;
	public Boolean PermissionsManageWorkspace;
	public Boolean PermissionsModifyComments;
	public Boolean PermissionsOrganizeFileAndFolder;
	public Boolean PermissionsTagContent;
	public Boolean PermissionsViewComments;
	public Datetime SystemModstamp;
	public String Type;

	public ContentWorkspacePermission clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspacePermission clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspacePermission clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspacePermission clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspacePermission clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
