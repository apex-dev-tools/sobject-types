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
public class AcceptedEventRelation extends SObject {
	public static SObjectType$<AcceptedEventRelation> SObjectType;
	public static SObjectFields$<AcceptedEventRelation> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id EventId;
	public Event Event;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id RelationId;
	public Name Relation;
	public Datetime RespondedDate;
	public String Response;
	public Datetime SystemModstamp;
	public String Type;

	public AcceptedEventRelation clone$() {throw new java.lang.UnsupportedOperationException();}
	public AcceptedEventRelation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AcceptedEventRelation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AcceptedEventRelation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AcceptedEventRelation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
