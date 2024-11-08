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
public class PricingProcedureOutputMap extends SObject {
	public static SObjectType$<PricingProcedureOutputMap> SObjectType;
	public static SObjectFields$<PricingProcedureOutputMap> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPricingRecipeActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public SObject.SObject LookupField;
	public Id OutputFieldNameId;
	public SObject OutputFieldName;
	public String OutputFieldNameString;
	public String OutputType;
	public String PricingComponentType;
	public Id PricingRecipeTableMappingId;
	public PricingRecipeTableMapping PricingRecipeTableMapping;
	public Datetime SystemModstamp;

	public PricingProcedureOutputMap clone$() {throw new java.lang.UnsupportedOperationException();}
	public PricingProcedureOutputMap clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PricingProcedureOutputMap clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PricingProcedureOutputMap clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PricingProcedureOutputMap clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
