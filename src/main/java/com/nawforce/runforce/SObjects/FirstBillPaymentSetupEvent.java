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
public class FirstBillPaymentSetupEvent extends SObject {
	public static SObjectType$<FirstBillPaymentSetupEvent> SObjectType;
	public static SObjectFields$<FirstBillPaymentSetupEvent> Fields;

	public String CorrelationIdentifier;
	public String ErrorCode;
	public String ErrorMessage;
	public String EventUuid;
	public Boolean IsSuccess;
	public Id OrderSummaryId;
	public String ProcessingStage;
	public String ReplayId;
	public String RequestIdentifier;

	public FirstBillPaymentSetupEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FirstBillPaymentSetupEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FirstBillPaymentSetupEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FirstBillPaymentSetupEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FirstBillPaymentSetupEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
