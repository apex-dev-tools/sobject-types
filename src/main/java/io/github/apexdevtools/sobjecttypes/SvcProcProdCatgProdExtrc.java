/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SvcProcProdCatgProdExtrc extends SObject {
	public static SObjectType$<SvcProcProdCatgProdExtrc> SObjectType;
	public static SObjectFields$<SvcProcProdCatgProdExtrc> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ProductCatalogId;
	public ProductCatalog ProductCatalog;
	public Id ProductCategoryId;
	public ProductCategory ProductCategory;
	public String ProductCategoryName;
	public Id ProductCategoryProductId;
	public ProductCategoryProduct ProductCategoryProduct;
	public Id ServiceProcessDefinitionId;
	public Product2 ServiceProcessDefinition;
	public String ServiceProcessDescription;
	public String ServiceProcessName;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SvcProcProdCatgProdExtrcShare[] Shares;

	public SvcProcProdCatgProdExtrc clone$() {throw new java.lang.UnsupportedOperationException();}
	public SvcProcProdCatgProdExtrc clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SvcProcProdCatgProdExtrc clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SvcProcProdCatgProdExtrc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SvcProcProdCatgProdExtrc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
