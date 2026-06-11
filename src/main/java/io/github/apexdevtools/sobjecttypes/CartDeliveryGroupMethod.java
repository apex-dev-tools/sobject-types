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
public class CartDeliveryGroupMethod extends SObject {
	public static SObjectType$<CartDeliveryGroupMethod> SObjectType;
	public static SObjectFields$<CartDeliveryGroupMethod> Fields;

	public Decimal AdjustedShippingFee;
	public String Carrier;
	public Id CartCheckoutSessionId;
	public CartCheckoutSession CartCheckoutSession;
	public Id CartDeliveryGroupId;
	public CartDeliveryGroup CartDeliveryGroup;
	public String ClassOfService;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ExternalProvider;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer ProcessTime;
	public String ProcessTimeUnit;
	public Id ProductId;
	public Product2 Product;
	public String ReferenceNumber;
	public Decimal ShippingFee;
	public Datetime SystemModstamp;
	public Decimal TotalAdjustmentAmount;
	public Integer TransitTimeMax;
	public Integer TransitTimeMin;
	public String TransitTimeUnit;
	public Id WebCartId;
	public WebCart WebCart;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public CartDeliveryGroupMethod clone$() {throw new java.lang.UnsupportedOperationException();}
	public CartDeliveryGroupMethod clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CartDeliveryGroupMethod clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CartDeliveryGroupMethod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CartDeliveryGroupMethod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
