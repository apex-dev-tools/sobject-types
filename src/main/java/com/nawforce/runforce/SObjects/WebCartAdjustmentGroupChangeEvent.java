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
