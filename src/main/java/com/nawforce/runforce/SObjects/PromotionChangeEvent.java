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
public class PromotionChangeEvent extends SObject {
	public static SObjectType$<PromotionChangeEvent> SObjectType;
	public static SObjectFields$<PromotionChangeEvent> Fields;

	public Boolean AreQualItemsExclFromDiscounts;
	public Id CampaignId;
	public Campaign Campaign;
	public Object ChangeEventHeader;
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
	public Boolean IsEnrollmentRequired;
	public Boolean IsPointsWithFactor;
	public Boolean IsQualCriteriaNotRequiredPerApplication;
	public Boolean IsQuickPromotion;
	public Boolean IsTiered;
	public Integer IssuedVoucherCount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
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
	public User Owner;
	public Decimal PointFactor;
	public Integer PriorityNumber;
	public String PromotionConfiguration;
	public String QualifierCriteria;
	public Id RelatedPromotionId;
	public Promotion RelatedPromotion;
	public String ReplayId;
	public Date StartDate;
	public Datetime StartDateTime;
	public String Status;
	public String TargetCriteria;
	public String TermsAndConditions;
	public Integer TotalRewardPoints;
	public String TransactionJournalType;

	public PromotionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromotionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromotionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromotionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromotionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
