/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AssetAction extends SObject {
	public static SObjectType$<AssetAction> SObjectType;
	public static SObjectFields$<AssetAction> Fields;

	public Datetime ActionDate;
	public Decimal ActualTaxChange;
	public Decimal AdjustmentAmountChange;
	public Decimal Amount;
	public com.nawforce.runforce.System.String AssetActionNumber;
	public Id AssetId;
	public Asset Asset;
	public com.nawforce.runforce.System.String Category;
	public com.nawforce.runforce.System.String CategoryEnum;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Decimal EstimatedTaxChange;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal MrrChange;
	public Decimal ProductAmountChange;
	public Decimal QuantityChange;
	public Decimal SubtotalChange;
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
	public com.nawforce.runforce.System.String Type;

	public AssetActionSource[] AssetActionSources;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public AssetAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetAction clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetAction clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetAction clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetAction clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
