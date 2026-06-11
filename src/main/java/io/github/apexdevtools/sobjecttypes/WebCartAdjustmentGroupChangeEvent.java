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
public class WebCartAdjustmentGroupChangeEvent extends SObject {
	public static SObjectType$<WebCartAdjustmentGroupChangeEvent> SObjectType;
	public static SObjectFields$<WebCartAdjustmentGroupChangeEvent> Fields;

	public Id AdjustmentBasisReferenceId;
	public Coupon AdjustmentBasisReference;
	public String AdjustmentSource;
	public String AdjustmentTargetType;
	public String AdjustmentType;
	public Decimal AdjustmentValue;
	public Id CartId;
	public WebCart Cart;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id PriceAdjustmentCauseId;
	public Promotion PriceAdjustmentCause;
	public Integer Priority;
	public String ReplayId;
	public Decimal TaxAmount;
	public Decimal TotalAmount;

	public WebCartAdjustmentGroupChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebCartAdjustmentGroupChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebCartAdjustmentGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebCartAdjustmentGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebCartAdjustmentGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
