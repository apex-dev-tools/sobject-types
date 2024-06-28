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
public class ReturnOrderItemTax extends SObject {
	public static SObjectType$<ReturnOrderItemTax> SObjectType;
	public static SObjectFields$<ReturnOrderItemTax> Fields;

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
	public Decimal Rate;
	public Id ReturnOrderId;
	public ReturnOrder ReturnOrder;
	public Id ReturnOrderItemAdjustmentId;
	public ReturnOrderItemAdjustment ReturnOrderItemAdjustment;
	public String ReturnOrderItemTaxNumber;
	public Id ReturnOrderLineItemId;
	public ReturnOrderLineItem ReturnOrderLineItem;
	public Datetime SystemModstamp;
	public Date TaxEffectiveDate;
	public String Type;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public ReturnOrderItemTax clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderItemTax clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderItemTax clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderItemTax clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderItemTax clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
