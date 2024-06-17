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
public class ReturnOrderItemAdjustment extends SObject {
	public static SObjectType$<ReturnOrderItemAdjustment> SObjectType;
	public static SObjectFields$<ReturnOrderItemAdjustment> Fields;

	public Decimal Amount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ReturnOrderId;
	public ReturnOrder ReturnOrder;
	public String ReturnOrderItemAdjustmentNumber;
	public Id ReturnOrderLineItemId;
	public ReturnOrderLineItem ReturnOrderLineItem;
	public Datetime SystemModstamp;
	public Decimal TotalAmtWithTax;
	public Decimal TotalTaxAmount;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ReturnOrderItemTax[] ReturnOrderItemTaxes;

	public ReturnOrderItemAdjustment clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderItemAdjustment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderItemAdjustment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderItemAdjustment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderItemAdjustment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
