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
public class CartTax extends SObject {
	public static SObjectType$<CartTax> SObjectType;
	public static SObjectFields$<CartTax> Fields;

	public String AdjustmentTargetType;
	public Decimal Amount;
	public Id CartId;
	public WebCart Cart;
	public Id CartItemId;
	public CartItem CartItem;
	public Id CartItemPriceAdjustmentId;
	public CartItemPriceAdjustment CartItemPriceAdjustment;
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
	public String Name;
	public Datetime SystemModstamp;
	public Date TaxCalculationDate;
	public Decimal TaxRate;
	public String TaxType;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public CartTax clone$() {throw new java.lang.UnsupportedOperationException();}
	public CartTax clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CartTax clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CartTax clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CartTax clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
