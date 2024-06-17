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
public class ProductAttributeSetProduct extends SObject {
	public static SObjectType$<ProductAttributeSetProduct> SObjectType;
	public static SObjectFields$<ProductAttributeSetProduct> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ProductAttributeSetId;
	public ProductAttributeSet ProductAttributeSet;
	public Id ProductId;
	public Product2 Product;
	public Datetime SystemModstamp;

	public ProductAttributeSetProduct clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeSetProduct clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeSetProduct clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeSetProduct clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeSetProduct clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
