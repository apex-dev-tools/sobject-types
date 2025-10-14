/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AssetAction extends SObject {
	public static SObjectType$<AssetAction> SObjectType;
	public static SObjectFields$<AssetAction> Fields;

	public Datetime ActionDate;
	public Decimal ActualTaxChange;
	public Decimal AdjustmentAmountChange;
	public Decimal Amount;
	public String AssetActionNumber;
	public Id AssetId;
	public Asset Asset;
	public String Category;
	public String CategoryEnum;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Decimal EstimatedTaxChange;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal MrrChange;
	public Decimal ProductAmountChange;
	public Decimal QuantityChange;
	public Decimal SubtotalChange;
	public String Subtype;
	public Datetime SystemModstamp;
	public Decimal TotalAmount;
	public Decimal TotalCancellationsAmount;
	public Decimal TotalCrossSellsAmount;
	public Decimal TotalDownsellsAmount;
	public Decimal TotalInitialSaleAmount;
	public Decimal TotalMrr;
	public Decimal TotalOtherAmount;
	public Decimal TotalQuantity;
	public Decimal TotalRenewalsAmount;
	public Decimal TotalTermsAndConditionsAmount;
	public Decimal TotalTransfersAmount;
	public Decimal TotalUpsellsAmount;
	public String Type;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AssetActionSource[] AssetActionSources;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public AssetAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetAction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetAction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetAction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
