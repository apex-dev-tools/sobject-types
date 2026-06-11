/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ProductClassificationChangeEvent extends SObject {
	public static SObjectType$<ProductClassificationChangeEvent> SObjectType;
	public static SObjectFields$<ProductClassificationChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentProductClassificationId;
	public ProductClassification ParentProductClassification;
	public String ReplayId;
	public String Status;

	public ProductClassificationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductClassificationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductClassificationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductClassificationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductClassificationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
