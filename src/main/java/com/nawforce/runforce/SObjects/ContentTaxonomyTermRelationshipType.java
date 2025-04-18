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
public class ContentTaxonomyTermRelationshipType extends SObject {
	public static SObjectType$<ContentTaxonomyTermRelationshipType> SObjectType;
	public static SObjectFields$<ContentTaxonomyTermRelationshipType> Fields;

	public String ContentTaxonomyTrmRelaCatg;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime SystemModstamp;

	public ContentTaxonomyTermRelationshipType clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentTaxonomyTermRelationshipType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentTaxonomyTermRelationshipType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentTaxonomyTermRelationshipType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentTaxonomyTermRelationshipType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
