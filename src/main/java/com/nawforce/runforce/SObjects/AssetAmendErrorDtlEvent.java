/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
