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
public class ContentWorkspaceMember extends SObject {
	public static SObjectType$<ContentWorkspaceMember> SObjectType;
	public static SObjectFields$<ContentWorkspaceMember> Fields;

	public Id ContentWorkspaceId;
	public ContentWorkspace ContentWorkspace;
	public Id ContentWorkspacePermissionId;
	public ContentWorkspacePermission ContentWorkspacePermission;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id MemberId;
	public Name Member;
	public String MemberType;

	public ContentWorkspaceMember clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspaceMember clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspaceMember clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspaceMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspaceMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
