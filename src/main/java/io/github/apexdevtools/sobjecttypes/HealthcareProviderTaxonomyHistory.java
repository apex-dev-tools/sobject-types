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
public class HealthcareProviderTaxonomyHistory extends SObject {
	public static SObjectType$<HealthcareProviderTaxonomyHistory> SObjectType;
	public static SObjectFields$<HealthcareProviderTaxonomyHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public String Field;
	public Id HealthcareProviderTaxonomyId;
	public HealthcareProviderTaxonomy HealthcareProviderTaxonomy;
	public Id Id;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;

	public HealthcareProviderTaxonomyHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProviderTaxonomyHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProviderTaxonomyHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProviderTaxonomyHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthcareProviderTaxonomyHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
