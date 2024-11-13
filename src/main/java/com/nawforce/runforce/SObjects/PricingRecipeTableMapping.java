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
public class PricingRecipeTableMapping extends SObject {
	public static SObjectType$<PricingRecipeTableMapping> SObjectType;
	public static SObjectFields$<PricingRecipeTableMapping> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String FileBasedDecisionTableName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsInternal;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LookupTableId;
	public Name LookupTable;
	public String PricingComponentType;
	public Id PricingRecipeId;
	public PricingRecipe PricingRecipe;
	public Datetime SystemModstamp;

	public PricingProcedureOutputMap[] PricingRecipeTableMappingForPOM;

	public PricingRecipeTableMapping clone$() {throw new java.lang.UnsupportedOperationException();}
	public PricingRecipeTableMapping clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PricingRecipeTableMapping clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PricingRecipeTableMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PricingRecipeTableMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
