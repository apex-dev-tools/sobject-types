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
public class EmbeddedServiceLabel extends SObject {
	public static SObjectType$<EmbeddedServiceLabel> SObjectType;
	public static SObjectFields$<EmbeddedServiceLabel> Fields;

	public String CustomLabelName;
	public String DurableId;
	public String EmbeddedServiceConfigDeveloperName;
	public Id Id;
	public String LabelKey;

	public EmbeddedServiceLabel clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmbeddedServiceLabel clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmbeddedServiceLabel clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmbeddedServiceLabel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmbeddedServiceLabel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
