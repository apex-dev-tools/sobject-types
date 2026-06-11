/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AuraDefinitionBundleInfo extends SObject {
	public static SObjectType$<AuraDefinitionBundleInfo> SObjectType;
	public static SObjectFields$<AuraDefinitionBundleInfo> Fields;

	public Decimal ApiVersion;
	public String AuraDefinitionBundleId;
	public String DeveloperName;
	public String DurableId;
	public Id Id;
	public String NamespacePrefix;

	public AuraDefinitionInfo[] Bundle;

	public AuraDefinitionBundleInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinitionBundleInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinitionBundleInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinitionBundleInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuraDefinitionBundleInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
