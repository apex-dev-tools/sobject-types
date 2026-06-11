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
