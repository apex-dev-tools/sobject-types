/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

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
