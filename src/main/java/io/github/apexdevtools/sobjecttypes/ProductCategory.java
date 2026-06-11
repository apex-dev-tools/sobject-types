/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ProductCategory extends SObject {
	public static SObjectType$<ProductCategory> SObjectType;
	public static SObjectFields$<ProductCategory> Fields;

	public Id CatalogId;
	public ProductCatalog Catalog;
	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsNavigational;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Integer NumberOfProducts;
	public Id ParentCategoryId;
	public ProductCategory ParentCategory;
	public Integer SortOrder;
	public Datetime SystemModstamp;

	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public ProductCategory[] ChildCategories;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContractGroupPlan[] ContractGroupPlans;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProductCategoryFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GroupClassContribution[] GroupClassContributions;
	public ProductCategoryHistory[] Histories;
	public ContractItemPrice[] Items;
	public LoyaltyPartnerProduct[] LoyaltyPartnerProductCategory;
	public LoyaltyPartnerProduct[] LoyaltyPartnerProducts;
	public PromotionLoyaltyPtnrProdt[] LoyaltyPromotionProductCategory;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TransactionJournal[] ProductCategories;
	public ProductCategoryDisqual[] ProductCategoryDisqualifications;
	public ProductCategoryProduct[] ProductCategoryProducts;
	public ProductCategoryQualification[] ProductCategoryQualifications;
	public PromotionLineItemRule[] PromotionLineItemRules;
	public VoucherDefinition[] VoucherProductCategory;
	public VoucherDefinition[] VoucherProducts;

	public ProductCategory clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductCategory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductCategory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductCategory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductCategory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
