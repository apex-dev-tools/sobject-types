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
public class CrMemoProcessErrDtlEvent extends SObject {
	public static SObjectType$<CrMemoProcessErrDtlEvent> SObjectType;
	public static SObjectFields$<CrMemoProcessErrDtlEvent> Fields;

	public String ErrorCode;
	public String ErrorMessage;
	public Id ErrorSourceId;
	public SObject ErrorSource;
	public String EventUuid;

	public CrMemoProcessErrDtlEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CrMemoProcessErrDtlEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CrMemoProcessErrDtlEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CrMemoProcessErrDtlEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CrMemoProcessErrDtlEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
