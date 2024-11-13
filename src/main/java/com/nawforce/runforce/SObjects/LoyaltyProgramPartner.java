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
public class LoyaltyProgramPartner extends SObject {
	public static SObjectType$<LoyaltyProgramPartner> SObjectType;
	public static SObjectFields$<LoyaltyProgramPartner> Fields;

	public Decimal AccrualCostperUnit;
	public Decimal AlertValue;
	public String BillingType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CreditedPoints;
	public String CurrencyIsoCode;
	public Decimal DebitedPoints;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastProcessedDateTime;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyPartnerId;
	public Account LoyaltyPartner;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String PartnerCategory;
	public String PartnerIndustry;
	public String PartnerStatus;
	public String PartnerType;
	public Date PartnershipEndDate;
	public Date PartnershipStartDate;
	public Decimal PointsBalance;
	public Decimal PostpaidBillAmount;
	public Decimal PurchasedPoints;
	public Decimal RedemptionCostperUnit;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public LoyaltyProgramPartnerHistory[] Histories;
	public LoyaltyPartnerProduct[] LoyaltyPartnerProducts;
	public LoyaltyPgmPartnerPromotion[] LoyaltyPgmPartnerPromotions;
	public LoyaltyPgmPartnerCurrency[] LoyaltyProgramPartnerCurrencies;
	public LoyaltyPgmPtnrPrepaidPack[] LoyaltyProgramPartnerPrepaidPacks;
	public PromotionLoyaltyPtnrProdt[] LoyaltyPromotionPartner;
	public LoyaltyPgmPtnrLdgrSummary[] PartnerLedgerSummaryPartners;
	public LoyaltyProgramPartnerLedger[] PartnerLedgerToPartner;
	public TransactionJournal[] Partners;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public LoyaltyProgramPartnerShare[] Shares;

	public LoyaltyProgramPartner clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramPartner clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramPartner clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramPartner clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramPartner clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
