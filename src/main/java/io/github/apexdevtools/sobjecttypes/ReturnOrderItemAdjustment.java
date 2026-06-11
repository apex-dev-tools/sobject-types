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

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
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
