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
public class CollaborationInvitation extends SObject {
	public static SObjectType$<CollaborationInvitation> SObjectType;
	public static SObjectFields$<CollaborationInvitation> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public String InvitedUserEmail;
	public String InvitedUserEmailNormalized;
	public Id InviterId;
	public User Inviter;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String OptionalMessage;
	public Id ParentId;
	public CollaborationInvitation Parent;
	public Id SharedEntityId;
	public SObject SharedEntity;
	public String Status;
	public Datetime SystemModstamp;

	public CollaborationInvitation clone$() {throw new java.lang.UnsupportedOperationException();}
	public CollaborationInvitation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationInvitation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationInvitation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CollaborationInvitation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
