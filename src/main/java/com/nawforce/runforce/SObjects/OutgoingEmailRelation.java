/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class OutgoingEmailRelation extends SObject {
	public static SObjectType$<OutgoingEmailRelation> SObjectType;
	public static SObjectFields$<OutgoingEmailRelation> Fields;

	public String ExternalId;
	public Id Id;
	public String OutgoingEmailId;
	public String RelationAddress;
	public Id RelationId;
	public Name Relation;

	public OutgoingEmailRelation clone$() {throw new java.lang.UnsupportedOperationException();}
	public OutgoingEmailRelation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OutgoingEmailRelation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OutgoingEmailRelation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OutgoingEmailRelation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
