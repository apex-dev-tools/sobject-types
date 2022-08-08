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
public class ForecastingOwnerAdjustment extends SObject {
	public static SObjectType$<ForecastingOwnerAdjustment> SObjectType;
	public static SObjectFields$<ForecastingOwnerAdjustment> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String ForecastCategoryName;
	public Id ForecastOwnerId;
	public User ForecastOwner;
	public com.nawforce.runforce.System.String ForecastingItemCategory;
	public Id ForecastingItemId;
	public ForecastingItem ForecastingItem;
	public Id ForecastingTypeId;
	public ForecastingType ForecastingType;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsAmount;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsQuantity;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Decimal OwnerAdjustedAmount;
	public Decimal OwnerAdjustedQuantity;
	public com.nawforce.runforce.System.String OwnerAdjustmentNote;
	public Id PeriodId;
	public Period Period;
	public com.nawforce.runforce.System.String ProductFamily;
	public Date StartDate;
	public Datetime SystemModstamp;
	public Id Territory2Id;
	public Territory2 Territory2;

	public ForecastingOwnerAdjustment clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingOwnerAdjustment clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingOwnerAdjustment clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingOwnerAdjustment clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingOwnerAdjustment clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
