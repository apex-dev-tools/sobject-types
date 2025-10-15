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
public class AssetStatePeriod extends SObject {
	public static SObjectType$<AssetStatePeriod> SObjectType;
	public static SObjectFields$<AssetStatePeriod> Fields;

	public Decimal Amount;
	public Id AssetId;
	public Asset Asset;
	public String AssetStatePeriodNumber;
	public String BillingFrequency;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal Discount;
	public Decimal DiscountAmount;
	public String Division;
	public Datetime EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LegalEntityId;
	public LegalEntity LegalEntity;
	public Decimal Mrr;
	public Decimal Quantity;
	public Datetime StartDate;
	public Datetime SystemModstamp;
	public Decimal UnitPrice;
	public Decimal UnitPriceUplift;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AssetStatePeriodAttribute[] AssetStatePeriodAttributes;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public AssetStatePeriod clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetStatePeriod clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetStatePeriod clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetStatePeriod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetStatePeriod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
