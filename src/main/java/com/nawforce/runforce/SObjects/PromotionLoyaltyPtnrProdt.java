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
