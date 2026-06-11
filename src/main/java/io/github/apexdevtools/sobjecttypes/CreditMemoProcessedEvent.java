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
