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
