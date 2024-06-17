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
public class ProductSellingModelOption extends SObject {
	public static SObjectType$<ProductSellingModelOption> SObjectType;
	public static SObjectFields$<ProductSellingModelOption> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id Product2Id;
	public Product2 Product2;
	public Id ProductSellingModelId;
	public ProductSellingModel ProductSellingModel;
	public Id ProrationPolicyId;
	public ProrationPolicy ProrationPolicy;
	public Datetime SystemModstamp;

	public ProductSellingModelOption clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductSellingModelOption clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductSellingModelOption clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductSellingModelOption clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductSellingModelOption clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
