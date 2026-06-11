/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class SalesStore extends SObject {
	public static SObjectType$<SalesStore> SObjectType;
	public static SObjectFields$<SalesStore> Fields;

	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public String ImplementorType;
	public Id LocationId;
	public Location Location;
	public String Name;

	public SalesStore clone$() {throw new java.lang.UnsupportedOperationException();}
	public SalesStore clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SalesStore clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SalesStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SalesStore clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
