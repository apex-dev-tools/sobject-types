/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CartItemPriceAdjustment extends SObject {
	public static SObjectType$<CartItemPriceAdjustment> SObjectType;
	public static SObjectFields$<CartItemPriceAdjustment> Fields;

	public String AdjustmentAmountScope;
	public Id AdjustmentBasisReferenceId;
	public Coupon AdjustmentBasisReference;
	public String AdjustmentSource;
	public String AdjustmentTargetType;
	public String AdjustmentType;
	public Decimal AdjustmentValue;
	public Id CartId;
	public WebCart Cart;
	public Id CartItemId;
	public CartItem CartItem;
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
	public Id PriceAdjustmentCauseId;
	public Promotion PriceAdjustmentCause;
	public Integer Priority;
	public Datetime SystemModstamp;
	public Decimal TotalAmount;
	public Decimal TotalGrossAmount;
	public Decimal TotalNetAmount;
	public Decimal TotalTax;
	public Id WebCartAdjustmentGroupId;
	public WebCartAdjustmentGroup WebCartAdjustmentGroup;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public CartTax[] CartItemPriceAdjustments;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public CartItemPriceAdjustment clone$() {throw new java.lang.UnsupportedOperationException();}
	public CartItemPriceAdjustment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CartItemPriceAdjustment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CartItemPriceAdjustment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CartItemPriceAdjustment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
