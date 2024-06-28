/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WebCartAdjustmentGroup extends SObject {
	public static SObjectType$<WebCartAdjustmentGroup> SObjectType;
	public static SObjectFields$<WebCartAdjustmentGroup> Fields;

	public Id AdjustmentBasisReferenceId;
	public Coupon AdjustmentBasisReference;
	public String AdjustmentSource;
	public String AdjustmentTargetType;
	public String AdjustmentType;
	public Decimal AdjustmentValue;
	public Id CartId;
	public WebCart Cart;
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
	public Decimal TaxAmount;
	public Decimal TotalAmount;
	public Decimal TotalAmountWithTax;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CartItemPriceAdjustment[] WebCartAdjustmentGroups;

	public WebCartAdjustmentGroup clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebCartAdjustmentGroup clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebCartAdjustmentGroup clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebCartAdjustmentGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebCartAdjustmentGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
