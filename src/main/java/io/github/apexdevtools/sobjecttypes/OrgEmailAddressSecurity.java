/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class OrgEmailAddressSecurity extends SObject {
	public static SObjectType$<OrgEmailAddressSecurity> SObjectType;
	public static SObjectFields$<OrgEmailAddressSecurity> Fields;

	public Id Id;
	public Id OrgWideEmailAddressId;
	public OrgWideEmailAddress OrgWideEmailAddress;
	public Id ParentId;
	public Profile Parent;
	public Datetime SystemModstamp;

	public OrgEmailAddressSecurity clone$() {throw new java.lang.UnsupportedOperationException();}
	public OrgEmailAddressSecurity clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OrgEmailAddressSecurity clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OrgEmailAddressSecurity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OrgEmailAddressSecurity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
