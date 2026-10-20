/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.eventbus.ChangeEventHeader;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WebCartActivityLogChangeEvent extends SObject {
	public static SObjectType$<WebCartActivityLogChangeEvent> SObjectType;
	public static SObjectFields$<WebCartActivityLogChangeEvent> Fields;

	public Id CartItemId;
	public CartItem CartItem;
	public ChangeEventHeader ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id InitiatedById;
	public User InitiatedBy;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String OperationSummary;
	public String OperationType;
	public Id ProductId;
	public Product2 Product;
	public String ReplayId;
	public Id SourceCartId;
	public WebCart SourceCart;
	public String Status;
	public Id WebCartId;
	public WebCart WebCart;

	public WebCartActivityLogChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebCartActivityLogChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebCartActivityLogChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebCartActivityLogChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebCartActivityLogChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
