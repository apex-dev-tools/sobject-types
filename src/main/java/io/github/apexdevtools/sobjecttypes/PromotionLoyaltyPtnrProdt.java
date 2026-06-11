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
public class PromotionLoyaltyPtnrProdt extends SObject {
	public static SObjectType$<PromotionLoyaltyPtnrProdt> SObjectType;
	public static SObjectFields$<PromotionLoyaltyPtnrProdt> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyPartnerId;
	public LoyaltyProgramPartner LoyaltyPartner;
	public Id LoyaltyPartnerProductId;
	public LoyaltyPartnerProduct LoyaltyPartnerProduct;
	public Id LoyaltyProductId;
	public Product2 LoyaltyProduct;
	public String Name;
	public Id ProductCategoryId;
	public ProductCategory ProductCategory;
	public Id PromotionId;
	public Promotion Promotion;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PromotionLoyaltyPtnrProdtFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PromotionLoyaltyPtnrProdtHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public PromotionLoyaltyPtnrProdt clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromotionLoyaltyPtnrProdt clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromotionLoyaltyPtnrProdt clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromotionLoyaltyPtnrProdt clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromotionLoyaltyPtnrProdt clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
