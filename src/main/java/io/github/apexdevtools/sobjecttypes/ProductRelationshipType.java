/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ProductRelationshipType extends SObject {
	public static SObjectType$<ProductRelationshipType> SObjectType;
	public static SObjectFields$<ProductRelationshipType> Fields;

	public String AssociatedProductRoleCat;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MainProductRoleCat;
	public String Name;
	public Datetime SystemModstamp;

	public FulfillmentLineRel[] FulfillmentLineRelationships;
	public ProductRelatedComponent[] ProductRelatedComponents;

	public ProductRelationshipType clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductRelationshipType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductRelationshipType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductRelationshipType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductRelationshipType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
