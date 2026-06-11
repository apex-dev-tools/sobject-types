/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class Publisher extends SObject {
	public static SObjectType$<Publisher> SObjectType;
	public static SObjectFields$<Publisher> Fields;

	public String DurableId;
	public Id Id;
	public Boolean IsSalesforce;
	public Integer MajorVersion;
	public Integer MinorVersion;
	public String Name;
	public String NamespacePrefix;

	public EntityDefinition[] InstalledEntityDefinitions;
	public FieldDefinition[] InstalledFieldDefinitions;

	public Publisher clone$() {throw new java.lang.UnsupportedOperationException();}
	public Publisher clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Publisher clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Publisher clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Publisher clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
