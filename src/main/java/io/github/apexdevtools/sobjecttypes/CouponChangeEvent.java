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
public class CouponChangeEvent extends SObject {
	public static SObjectType$<CouponChangeEvent> SObjectType;
	public static SObjectFields$<CouponChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String CouponCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime EndDateTime;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PromotionId;
	public Promotion Promotion;
	public Integer RedemptionLimitAllBuyers;
	public Integer RedemptionLimitPerBuyer;
	public String ReplayId;
	public Datetime StartDateTime;
	public String Status;

	public CouponChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CouponChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CouponChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CouponChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CouponChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
