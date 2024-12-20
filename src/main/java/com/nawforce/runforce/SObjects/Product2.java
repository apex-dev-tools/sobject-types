/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Product2 extends SObject {
	public static SObjectType$<Product2> SObjectType;
	public static SObjectFields$<Product2> Fields;

	public Boolean CanUseQuantitySchedule;
	public Boolean CanUseRevenueSchedule;
	public Datetime AvailabilityDate;
	public Id BasedOnId;
	public ProductClassification BasedOn;
	public String ConfigureDuringSale;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime DiscontinuedDate;
	public String DisplayUrl;
	public Datetime EndOfLifeDate;
	public Id ExternalDataSourceId;
	public ExternalDataSource ExternalDataSource;
	public String ExternalId;
	public String Family;
	public String HelpText;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsArchived;
	public Boolean IsAssetizable;
	public Boolean IsDeleted;
	public Boolean IsSerialized;
	public Boolean IsSoldOnlyWithOtherProds;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Integer NumberOfQuantityInstallments;
	public Integer NumberOfRevenueInstallments;
	public String ProductClass;
	public String ProductCode;
	public String QuantityInstallmentPeriod;
	public String QuantityScheduleType;
	public String QuantityUnitOfMeasure;
	public String RevenueInstallmentPeriod;
	public String RevenueScheduleType;
	public Id SellerId;
	public Seller Seller;
	public Id SourceProductId;
	public Product2 SourceProduct;
	public String SpecificationType;
	public String StockKeepingUnit;
	public Datetime SystemModstamp;
	public String TransferRecordMode;
	public String Type;
	public String UsageModelType;

	public ActivityHistory[] ActivityHistories;
	public AdvAccountForecastFact[] AdvAcctForecastFacts;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApplicationFormProduct[] ApplicationFormProducts;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public Asset[] Assets;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AttributeAdjustmentCondition[] AttributeAdjustmentConditions;
	public AttributeBasedAdjustment[] AttributeBasedAdjustments;
	public BundleBasedAdjustment[] BundleBasedAdjustments;
	public CartDeliveryGroupMethod[] CartDeliveryGroupMethods;
	public ProductRelatedComponent[] ChildProductRelatedComponents;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContractLineItem[] ContractLineItems;
	public CreditMemoLine[] CreditMemoLines;
	public DataUsePurpose[] DataUsePurposes;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EngagementTopic[] EngagementInitiatedTopic;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public Product2Feed[] Feeds;
	public DocTemplateSectionCondition[] FilterObjects;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public FulfillmentOrderLineItem[] FulfillmentOrderLineItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProductComponentGrpOverride[] GroupOverrides;
	public Product2History[] Histories;
	public IncidentRelatedItem[] IncidentRelatedItems;
	public InsurancePolicy[] InsurancePolicies;
	public InventoryItemReservation[] InventoryProducts;
	public InvoiceLine[] InvoiceLines;
	public ContractItemPrice[] Items;
	public TransactionJournal[] JournalProducts;
	public ListEmail[] ListEmails;
	public NetworkUserHistoryRecent[] NetworkUserHistoryRecentToRecord;
	public LoyaltyPartnerProduct[] LoyaltyPartnerProduct2;
	public LoyaltyPartnerProduct[] LoyaltyPartnerProducts;
	public PromotionLoyaltyPtnrProdt[] LoyaltyPromotionPartnerProduct2;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProductRelComponentOverride[] OverrideContextId;
	public ProductAttributeDefinition[] OverrideContextProductAttributeDefinitions;
	public ProductDisqualification[] ParentProductDisqualifications;
	public ProductQualification[] ParentProductQualifications;
	public ProductRelatedComponent[] ParentProductRelatedComponents;
	public PriceAdjustmentTier[] PriceAdjustmentTiers;
	public PriceBookEntryDerivedPrice[] PriceBookEntryContributingProducts;
	public PriceBookEntryDerivedPrice[] PriceBookEntryDerivedProducts;
	public PricebookEntry[] PricebookEntries;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Scope3PcmtItem[] ProcurementItems;
	public Benefit[] Product2_Benefits;
	public ProductAttributeDefinition[] ProductAttributeDefinitions;
	public ProductAttributeSetProduct[] ProductAttributeSetProducts;
	public ProductAttribute[] ProductAttributes;
	public CareProgramProduct[] ProductCareProgramProducts;
	public ProductCategoryProduct[] ProductCategoryProducts;
	public ProductComponentGroup[] ProductComponentGroups;
	public ProductConsumptionSchedule[] ProductConsumptionSchedules;
	public CostBookEntry[] ProductCostBookEntry;
	public ProductDisqualification[] ProductDisqualifications;
	public ProductEmissionsFactor[] ProductEmissionsFactors;
	public ProductFulfillmentLocation[] ProductFulfillmentLocations;
	public ProductItem[] ProductItems;
	public ProductQualification[] ProductQualifications;
	public ProductRequestLineItem[] ProductRequestLineItems;
	public ProductSellingModelOption[] ProductSellingModelOptions;
	public ProductServiceCampaignItem[] ProductServiceCampaignItems;
	public ProductServiceCampaign[] ProductServiceCampaignProducts;
	public ProductTransfer[] ProductTransfers;
	public ProductAttribute[] ProductVariantAttributes;
	public ProductWarrantyTerm[] ProductWarrantyTermProducts;
	public ProductAvailabilityProjection[] Product_Availability_Projections;
	public ProductConsumed[] ProductsConsumed;
	public ProductRequired[] ProductsRequired;
	public PromotionLineItemRule[] PromotionLineItemRules;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ReturnOrderLineItem[] ReturnOrderLineItems;
	public ProductDisqualification[] RootProductDisqualifications;
	public ProductQualification[] RootProductQualifications;
	public SerializedProduct[] SerializedProducts;
	public ShipmentItem[] ShipmentItems;
	public SurveySubject[] SurveySubjectEntities;
	public SupplierProduct[] SupplierProducts;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public VoucherDefinition[] VoucherProduct2;
	public VoucherDefinition[] VoucherProducts;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkPlanSelectionRule[] WorkPlanSelectionRules;

	public Product2 clone$() {throw new java.lang.UnsupportedOperationException();}
	public Product2 clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Product2 clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Product2 clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Product2 clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
