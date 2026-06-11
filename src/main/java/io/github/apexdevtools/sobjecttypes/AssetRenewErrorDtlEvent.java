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
public class AssetRenewErrorDtlEvent extends SObject {
	public static SObjectType$<AssetRenewErrorDtlEvent> SObjectType;
	public static SObjectFields$<AssetRenewErrorDtlEvent> Fields;

	public String ErrorCode;
	public String ErrorMessage;
	public String EventUuid;

	public AssetRenewErrorDtlEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetRenewErrorDtlEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetRenewErrorDtlEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetRenewErrorDtlEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetRenewErrorDtlEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
