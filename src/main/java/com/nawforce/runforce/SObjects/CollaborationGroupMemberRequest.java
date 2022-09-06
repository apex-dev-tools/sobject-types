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
public class CollaborationGroupMemberRequest extends SObject {
	public static SObjectType$<CollaborationGroupMemberRequest> SObjectType;
	public static SObjectFields$<CollaborationGroupMemberRequest> Fields;

	public Id CollaborationGroupId;
	public CollaborationGroup CollaborationGroup;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id RequesterId;
	public User Requester;
	public String ResponseMessage;
	public String Status;
	public Datetime SystemModstamp;

	public CollaborationGroupMemberRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroupMemberRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroupMemberRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroupMemberRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationGroupMemberRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
