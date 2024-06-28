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
public class EventRelationChangeEvent extends SObject {
	public static SObjectType$<EventRelationChangeEvent> SObjectType;
	public static SObjectFields$<EventRelationChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id EventId;
	public Event Event;
	public Id Id;
	public Boolean IsInvitee;
	public Boolean IsParent;
	public Boolean IsWhat;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id RelationId;
	public SObject Relation;
	public String ReplayId;
	public Datetime RespondedDate;
	public String Response;
	public String Status;

	public EventRelationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EventRelationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EventRelationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EventRelationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EventRelationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
