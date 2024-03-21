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
public class CreditMemoProcessedEvent extends SObject {
	public static SObjectType$<CreditMemoProcessedEvent> SObjectType;
	public static SObjectFields$<CreditMemoProcessedEvent> Fields;

	public String CorrelationIdentifier;
	public CrMemoProcessErrDtlEvent[] CrMemoProcessErrDtlEvents;
	public Id CreditMemoId;
	public CreditMemo CreditMemo;
	public String ErrorDetails;
	public String EventUuid;
	public Boolean IsSuccess;
	public String ReplayId;
	public String RequestIdentifier;

	public CreditMemoProcessedEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CreditMemoProcessedEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CreditMemoProcessedEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CreditMemoProcessedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CreditMemoProcessedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
