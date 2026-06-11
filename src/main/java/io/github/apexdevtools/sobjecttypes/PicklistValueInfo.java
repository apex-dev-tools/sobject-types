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
public class PicklistValueInfo extends SObject {
	public static SObjectType$<PicklistValueInfo> SObjectType;
	public static SObjectFields$<PicklistValueInfo> Fields;

	public String DurableId;
	public String EntityParticleId;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDefaultValue;
	public String Label;
	public String ValidFor;
	public String Value;

	public PicklistValueInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public PicklistValueInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PicklistValueInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PicklistValueInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PicklistValueInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
