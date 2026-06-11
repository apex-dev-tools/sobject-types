/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

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
