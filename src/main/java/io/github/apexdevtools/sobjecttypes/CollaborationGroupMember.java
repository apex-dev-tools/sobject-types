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
public class CollaborationGroupMember extends SObject {
	public static SObjectType$<CollaborationGroupMember> SObjectType;
	public static SObjectFields$<CollaborationGroupMember> Fields;

	public Id CollaborationGroupId;
	public CollaborationGroup CollaborationGroup;
	public String CollaborationRole;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Datetime LastFeedAccessDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MemberId;
	public User Member;
	public Id NetworkId;
	public Network Network;
	public String NotificationFrequency;
	public Datetime SystemModstamp;

	public CollaborationGroupMember clone$() {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroupMember clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroupMember clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroupMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroupMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
