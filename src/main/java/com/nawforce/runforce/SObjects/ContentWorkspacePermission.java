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
