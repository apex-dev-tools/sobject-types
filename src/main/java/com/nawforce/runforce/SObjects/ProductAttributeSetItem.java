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
public class ProductAttributeSetItem extends SObject {
	public static SObjectType$<ProductAttributeSetItem> SObjectType;
	public static SObjectFields$<ProductAttributeSetItem> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ProductAttributeSetId;
	public ProductAttributeSet ProductAttributeSet;
	public Integer Sequence;
	public Datetime SystemModstamp;

	public ProductAttributeSetItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeSetItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeSetItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeSetItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductAttributeSetItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
