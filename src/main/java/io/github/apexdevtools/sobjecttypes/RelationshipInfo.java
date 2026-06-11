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
public class RelationshipInfo extends SObject {
	public static SObjectType$<RelationshipInfo> SObjectType;
	public static SObjectFields$<RelationshipInfo> Fields;

	public String ChildSobjectId;
	public String DurableId;
	public String FieldId;
	public Id Id;
	public Boolean IsCascadeDelete;
	public Boolean IsDeprecatedAndHidden;
	public Boolean IsRestrictedDelete;
	public Object JunctionIdListNames;

	public RelationshipDomain[] RelationshipDomains;

	public RelationshipInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public RelationshipInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RelationshipInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RelationshipInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RelationshipInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
