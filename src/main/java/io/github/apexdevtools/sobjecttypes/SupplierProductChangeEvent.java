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
public class SupplierProductChangeEvent extends SObject {
	public static SObjectType$<SupplierProductChangeEvent> SObjectType;
	public static SObjectFields$<SupplierProductChangeEvent> Fields;

	public Date AttributeEndDate;
	public Date AttributeStartDate;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DefaultProductEmssnFctrId;
	public ProductEmissionsFactor DefaultProductEmssnFctr;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ProductId;
	public Product2 Product;
	public String ReplayId;
	public Decimal SourcingAllocPercentage;
	public Id SupplierId;
	public Supplier Supplier;
	public Decimal SupplierRank;

	public SupplierProductChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SupplierProductChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SupplierProductChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SupplierProductChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SupplierProductChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
