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
