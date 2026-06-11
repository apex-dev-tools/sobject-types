/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

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

	public GroupMember clone$() {throw new java.lang.UnsupportedOperationException();}
	public GroupMember clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GroupMember clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GroupMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GroupMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
