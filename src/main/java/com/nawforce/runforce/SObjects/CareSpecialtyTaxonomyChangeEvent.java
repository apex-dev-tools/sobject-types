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
public class CareSpecialtyTaxonomyChangeEvent extends SObject {
	public static SObjectType$<CareSpecialtyTaxonomyChangeEvent> SObjectType;
	public static SObjectFields$<CareSpecialtyTaxonomyChangeEvent> Fields;

	public Id CareSpecialtyId;
	public CareSpecialty CareSpecialty;
	public Id CareTaxonomyId;
	public CareTaxonomy CareTaxonomy;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;

	public CareSpecialtyTaxonomyChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareSpecialtyTaxonomyChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareSpecialtyTaxonomyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareSpecialtyTaxonomyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareSpecialtyTaxonomyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
