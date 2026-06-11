/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CreateAssetOrderEvent extends SObject {
	public static SObjectType$<CreateAssetOrderEvent> SObjectType;
	public static SObjectFields$<CreateAssetOrderEvent> Fields;

	public CreateAssetOrderDtlEvent[] AssetDetails;
	public String CorrelationIdentifier;
	public String EventUuid;
	public String ReplayId;
	public String RequestIdentifier;

	public CreateAssetOrderEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CreateAssetOrderEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CreateAssetOrderEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CreateAssetOrderEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CreateAssetOrderEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
