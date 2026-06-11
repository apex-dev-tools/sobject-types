/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class ContentTaxonomyTermRelatedTerm extends SObject {
	public static SObjectType$<ContentTaxonomyTermRelatedTerm> SObjectType;
	public static SObjectFields$<ContentTaxonomyTermRelatedTerm> Fields;

	public Id ContentTaxonomyId;
	public ContentTaxonomy ContentTaxonomy;
	public Id ContentTaxonomyTermId;
	public ContentTaxonomyTerm ContentTaxonomyTerm;
	public Id ContentTaxonomyTrmRelaTypeId;
	public ContentTaxonomyTermRelationshipType ContentTaxonomyTrmRelaType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id RelatedContentTaxonomyTermId;
	public ContentTaxonomyTerm RelatedContentTaxonomyTerm;
	public Datetime SystemModstamp;

	public ContentTaxonomyTermRelatedTerm clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentTaxonomyTermRelatedTerm clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentTaxonomyTermRelatedTerm clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentTaxonomyTermRelatedTerm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentTaxonomyTermRelatedTerm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
