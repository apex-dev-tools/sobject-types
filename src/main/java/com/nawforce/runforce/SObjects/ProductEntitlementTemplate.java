/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class ProductEntitlementTemplate extends SObject {
	public static SObjectType$<ProductEntitlementTemplate> SObjectType;
	public static SObjectFields$<ProductEntitlementTemplate> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id EntitlementTemplateId;
	public EntitlementTemplate EntitlementTemplate;
	public Id Id;
	public Id Product2Id;
	public Product2 Product2;
	public Datetime SystemModstamp;

	public ProductEntitlementTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductEntitlementTemplate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductEntitlementTemplate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductEntitlementTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductEntitlementTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
