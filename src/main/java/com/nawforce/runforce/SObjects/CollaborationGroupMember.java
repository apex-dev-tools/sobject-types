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
