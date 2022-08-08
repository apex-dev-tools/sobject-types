/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContentWorkspacePermission extends SObject {
	public static SObjectType$<ContentWorkspacePermission> SObjectType;
	public static SObjectFields$<ContentWorkspacePermission> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String Description;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Boolean PermissionsAddComment;
	public com.nawforce.runforce.System.Boolean PermissionsAddContent;
	public com.nawforce.runforce.System.Boolean PermissionsAddContentOBO;
	public com.nawforce.runforce.System.Boolean PermissionsArchiveContent;
	public com.nawforce.runforce.System.Boolean PermissionsChatterSharing;
	public com.nawforce.runforce.System.Boolean PermissionsDeleteContent;
	public com.nawforce.runforce.System.Boolean PermissionsDeliverContent;
	public com.nawforce.runforce.System.Boolean PermissionsFeatureContent;
	public com.nawforce.runforce.System.Boolean PermissionsManageWorkspace;
	public com.nawforce.runforce.System.Boolean PermissionsModifyComments;
	public com.nawforce.runforce.System.Boolean PermissionsOrganizeFileAndFolder;
	public com.nawforce.runforce.System.Boolean PermissionsTagContent;
	public com.nawforce.runforce.System.Boolean PermissionsViewComments;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String Type;

	public ContentWorkspacePermission clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspacePermission clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspacePermission clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspacePermission clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspacePermission clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
