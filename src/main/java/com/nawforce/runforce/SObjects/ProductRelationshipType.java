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
