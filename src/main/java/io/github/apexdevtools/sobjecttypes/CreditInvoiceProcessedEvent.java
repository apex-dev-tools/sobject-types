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
public class CreditInvoiceProcessedEvent extends SObject {
	public static SObjectType$<CreditInvoiceProcessedEvent> SObjectType;
	public static SObjectFields$<CreditInvoiceProcessedEvent> Fields;

	public String CorrelationIdentifier;
	public CrMemoProcessErrDtlEvent[] CrMemoProcessErrDtlEvents;
	public Id CreditMemoId;
	public CreditMemo CreditMemo;
	public String ErrorDetails;
	public String EventUuid;
	public Id InvoiceId;
	public Invoice Invoice;
	public Boolean IsSuccess;
	public String ReplayId;
	public String RequestIdentifier;

	public CreditInvoiceProcessedEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CreditInvoiceProcessedEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CreditInvoiceProcessedEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CreditInvoiceProcessedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CreditInvoiceProcessedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
