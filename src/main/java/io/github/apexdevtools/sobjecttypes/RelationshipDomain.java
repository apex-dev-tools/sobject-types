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
public class RelationshipDomain extends SObject {
	public static SObjectType$<RelationshipDomain> SObjectType;
	public static SObjectFields$<RelationshipDomain> Fields;

	public String ChildSobjectId;
	public String DurableId;
	public String FieldId;
	public Id Id;
	public Boolean IsCascadeDelete;
	public Boolean IsDeprecatedAndHidden;
	public Boolean IsRestrictedDelete;
	public Object JunctionIdListNames;
	public String ParentSobjectId;
	public String RelationshipInfoId;
	public String RelationshipName;

	public RelationshipDomain clone$() {throw new java.lang.UnsupportedOperationException();}
	public RelationshipDomain clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RelationshipDomain clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RelationshipDomain clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RelationshipDomain clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
