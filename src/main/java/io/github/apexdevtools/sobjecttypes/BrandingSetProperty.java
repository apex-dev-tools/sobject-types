/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class BrandingSetProperty extends SObject {
	public static SObjectType$<BrandingSetProperty> SObjectType;
	public static SObjectFields$<BrandingSetProperty> Fields;

	public Id BrandingSetId;
	public BrandingSet BrandingSet;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String PropertyName;
	public String PropertyValue;
	public Datetime SystemModstamp;

	public BrandingSetProperty clone$() {throw new java.lang.UnsupportedOperationException();}
	public BrandingSetProperty clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BrandingSetProperty clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BrandingSetProperty clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BrandingSetProperty clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
