/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WebCartAdjustmentBasisChangeEvent extends SObject {
	public static SObjectType$<WebCartAdjustmentBasisChangeEvent> SObjectType;
	public static SObjectFields$<WebCartAdjustmentBasisChangeEvent> Fields;

	public String AdjustmentBasisDetail;
	public Id AdjustmentBasisReferenceId;
	public Coupon AdjustmentBasisReference;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public Id WebCartId;
	public WebCart WebCart;

	public WebCartAdjustmentBasisChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebCartAdjustmentBasisChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebCartAdjustmentBasisChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebCartAdjustmentBasisChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebCartAdjustmentBasisChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
