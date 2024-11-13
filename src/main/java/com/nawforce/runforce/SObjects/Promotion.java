/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Promotion extends SObject {
	public static SObjectType$<Promotion> SObjectType;
	public static SObjectFields$<Promotion> Fields;

	public Boolean AreQualItemsExclFromDiscounts;
	public Id CampaignId;
	public Campaign Campaign;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer CumulativeUsageTarget;
	public String CurrencyIsoCode;
	public Decimal CurrentLiabilityAmount;
	public Integer CurrentPointCount;
	public Id DefaultVoucherDefinitionId;
	public VoucherDefinition DefaultVoucherDefinition;
	public String Description;
	public String DiscountOrder;
	public String DiscountRestriction;
	public String DisplayName;
	public Date EndDate;
	public Datetime EndDateTime;
	public Date EnrollmentEndDate;
	public Date EnrollmentStartDate;
	public String ExclusivityType;
	public String FulfillmentAction;
	public Id GameDefinitionId;
	public GameDefinition GameDefinition;
	public Id Id;
	public String ImageUrl;
	public Boolean IsActive;
	public Boolean IsAutomatic;
	public Boolean IsCloned;
	public Boolean IsCommercePromotion;
	public Boolean IsDeleted;
	public Boolean IsEnrollmentRequired;
	public Boolean IsPointsWithFactor;
	public Boolean IsQualCriteriaNotRequiredPerApplication;
	public Boolean IsQuickPromotion;
	public Boolean IsTiered;
	public Integer IssuedVoucherCount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyProgramCurrencyId;
	public LoyaltyProgramCurrency LoyaltyProgramCurrency;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public String LoyaltyPromotionType;
	public Decimal MaximumLiabilityAmount;
	public Integer MaximumRewardValue;
	public Integer MaximumUsageCount;
	public Integer MaximumVoucherCount;
	public String Name;
	public String Objective;
	public Id OwnerId;
	public Name Owner;
	public Decimal PointFactor;
	public Integer PriorityNumber;
	public String PromotionConfiguration;
	public String QualifierCriteria;
	public Id RelatedPromotionId;
	public Promotion RelatedPromotion;
	public Date StartDate;
	public Datetime StartDateTime;
	public String Status;
	public Datetime SystemModstamp;
	public String TargetCriteria;
	public String TermsAndConditions;
	public Integer TotalRewardPoints;
	public String TransactionJournalType;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PromotionFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProductComponentGrpOverride[] GroupOverrides;
	public PromotionHistory[] Histories;
	public TransactionJournal[] JournalPromotion;
	public LoyaltyLedger[] LedgerPromotion;
	public LoyaltyProgramMbrPromotion[] LoyaltyProgramMbrPromotions;
	public PromotionLoyaltyPtnrProdt[] LoyaltyPromotion;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProductRelComponentOverride[] OverrideContextId;
	public ProductAttributeDefinition[] OverrideContextProductAttributeDefinitions;
	public LoyaltyProgramPartnerLedger[] PartnerLedgerToPromotion;
	public WebCartAdjustmentGroup[] PriceAdjustmentGroups;
	public CartItemPriceAdjustment[] PriceAdjustmentItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Coupon[] PromotionCoupons;
	public LoyaltyPgmEngmtAttrProm[] PromotionEngagementAttributes;
	public PromotionMarketSegment[] PromotionMarketSegments;
	public PromotionQualifier[] PromotionQualifiers;
	public LoyaltyPgmPartnerPromotion[] PromotionRelationship;
	public LoyaltyProgramProcessRule[] PromotionRules;
	public PromotionTarget[] PromotionTargets;
	public PromotionTier[] PromotionTiers;
	public LoyaltyPgmMbrPromEligView[] PromotionsEligibility;
	public Promotion[] RelatedPromotions;
	public PromotionShare[] Shares;
	public GameParticipantReward[] SourceActivities;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public Voucher[] VoucherPromotion;

	public Promotion clone$() {throw new java.lang.UnsupportedOperationException();}
	public Promotion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Promotion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Promotion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Promotion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
