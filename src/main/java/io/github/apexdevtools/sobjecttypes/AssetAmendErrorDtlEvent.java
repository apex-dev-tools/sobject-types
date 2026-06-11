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
public class AssetAmendErrorDtlEvent extends SObject {
	public static SObjectType$<AssetAmendErrorDtlEvent> SObjectType;
	public static SObjectFields$<AssetAmendErrorDtlEvent> Fields;

	public String ErrorCode;
	public String ErrorMessage;
	public String EventUuid;

	public AssetAmendErrorDtlEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetAmendErrorDtlEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetAmendErrorDtlEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetAmendErrorDtlEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetAmendErrorDtlEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
