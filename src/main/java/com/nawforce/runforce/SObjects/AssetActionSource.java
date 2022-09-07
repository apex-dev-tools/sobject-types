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
public class AssetActionSource extends SObject {
	public static SObjectType$<AssetActionSource> SObjectType;
	public static SObjectFields$<AssetActionSource> Fields;

	public Decimal ActualTax;
	public Decimal AdjustmentAmount;
	public Id AssetActionId;
	public AssetAction AssetAction;
	public String AssetActionSourceNumber;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndDate;
	public Decimal EstimatedTax;
	public String ExternalReference;
	public String ExternalReferenceDataSource;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal ProductAmount;
	public Decimal Quantity;
	public Id ReferenceEntityItemId;
	public Name ReferenceEntityItem;
	public Datetime StartDate;
	public Decimal Subtotal;
	public Datetime SystemModstamp;
	public Datetime TransactionDate;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public AssetActionSource clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetActionSource clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetActionSource clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetActionSource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetActionSource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}