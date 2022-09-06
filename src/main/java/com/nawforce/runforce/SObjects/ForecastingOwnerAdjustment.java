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
public class ForecastingOwnerAdjustment extends SObject {
	public static SObjectType$<ForecastingOwnerAdjustment> SObjectType;
	public static SObjectFields$<ForecastingOwnerAdjustment> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ForecastCategoryName;
	public Id ForecastOwnerId;
	public User ForecastOwner;
	public String ForecastingItemCategory;
	public Id ForecastingItemId;
	public ForecastingItem ForecastingItem;
	public Id ForecastingTypeId;
	public ForecastingType ForecastingType;
	public Id Id;
	public Boolean IsAmount;
	public Boolean IsDeleted;
	public Boolean IsQuantity;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal OwnerAdjustedAmount;
	public Decimal OwnerAdjustedQuantity;
	public String OwnerAdjustmentNote;
	public Id PeriodId;
	public Period Period;
	public String ProductFamily;
	public Date StartDate;
	public Datetime SystemModstamp;
	public Id Territory2Id;
	public Territory2 Territory2;

	public ForecastingOwnerAdjustment clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingOwnerAdjustment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingOwnerAdjustment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingOwnerAdjustment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingOwnerAdjustment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
