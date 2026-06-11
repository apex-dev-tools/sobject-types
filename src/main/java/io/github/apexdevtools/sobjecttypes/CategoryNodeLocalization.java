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
public class CategoryNodeLocalization extends SObject {
	public static SObjectType$<CategoryNodeLocalization> SObjectType;
	public static SObjectFields$<CategoryNodeLocalization> Fields;

	public Id CategoryNodeId;
	public CategoryNode CategoryNode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String NamespacePrefix;
	public Datetime SystemModstamp;
	public String Value;

	public CategoryNodeLocalization clone$() {throw new java.lang.UnsupportedOperationException();}
	public CategoryNodeLocalization clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CategoryNodeLocalization clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CategoryNodeLocalization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CategoryNodeLocalization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
