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
public class GroupMember extends SObject {
	public static SObjectType$<GroupMember> SObjectType;
	public static SObjectFields$<GroupMember> Fields;

	public Id GroupId;
	public Group Group;
	public Id Id;
	public Datetime SystemModstamp;
	public Id UserOrGroupId;
	public SObject UserOrGroup;

	public GroupMember clone$() {throw new UnsupportedOperationException();}
	public GroupMember clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public GroupMember clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public GroupMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public GroupMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
