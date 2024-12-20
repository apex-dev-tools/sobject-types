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
public class EventRelation extends SObject {
	public static SObjectType$<EventRelation> SObjectType;
	public static SObjectFields$<EventRelation> Fields;

	public Id AccountId;
	public Account Account;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id EventId;
	public Event Event;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsInvitee;
	public Boolean IsParent;
	public Boolean IsWhat;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id RelationId;
	public Name Relation;
	public Datetime RespondedDate;
	public String Response;
	public String Status;
	public Datetime SystemModstamp;

	public EventRelation clone$() {throw new java.lang.UnsupportedOperationException();}
	public EventRelation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EventRelation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EventRelation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EventRelation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
