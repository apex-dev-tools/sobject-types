/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class ContentTaxonomyRelatedTerm extends SObject {
	public static SObjectType$<ContentTaxonomyRelatedTerm> SObjectType;
	public static SObjectFields$<ContentTaxonomyRelatedTerm> Fields;

	public Id ContentTaxonomyId;
	public ContentTaxonomy ContentTaxonomy;
	public Id ContentTaxonomyTermId;
	public ContentTaxonomyTerm ContentTaxonomyTerm;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public ContentTaxonomyRelatedTerm clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentTaxonomyRelatedTerm clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentTaxonomyRelatedTerm clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentTaxonomyRelatedTerm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentTaxonomyRelatedTerm clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
