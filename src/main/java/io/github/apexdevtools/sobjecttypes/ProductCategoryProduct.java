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
public class ProductCategoryProduct extends SObject {
	public static SObjectType$<ProductCategoryProduct> SObjectType;
	public static SObjectFields$<ProductCategoryProduct> Fields;

	public Id CatalogId;
	public ProductCatalog Catalog;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPrimaryCategory;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ProductCategoryId;
	public ProductCategory ProductCategory;
	public Id ProductId;
	public Product2 Product;
	public String ProductToCategory;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProductCategoryProductHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SvcProcProdCatgProdExtrc[] ProductCategoryProducts;

	public ProductCategoryProduct clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductCategoryProduct clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductCategoryProduct clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductCategoryProduct clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductCategoryProduct clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
