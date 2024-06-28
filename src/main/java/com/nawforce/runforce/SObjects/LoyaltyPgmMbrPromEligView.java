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
public class LoyaltyPgmMbrPromEligView extends SObject {
	public static SObjectType$<LoyaltyPgmMbrPromEligView> SObjectType;
	public static SObjectFields$<LoyaltyPgmMbrPromEligView> Fields;

	public Decimal CurrPromotionLiabilityAmt;
	public String CurrencyIsoCode;
	public Integer CurrentPromotionPointsCount;
	public Id DefaultVoucherDefinitionId;
	public VoucherDefinition DefaultVoucherDefinition;
	public String Description;
	public Boolean DoesPromHavePtWithFctr;
	public Date EndDate;
	public String ExternalId;
	public String FulfillmentAction;
	public Id Id;
	public Boolean IsMbrEligBsdCmpnOrSgmt;
	public Boolean IsPromotionEnrollmentRqr;
	public Integer IssuedPromotionVoucherCount;
	public Id LoyaltyProgramCurrencyId;
	public LoyaltyProgramCurrency LoyaltyProgramCurrency;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public Id LoyaltyProgramMemberId;
	public LoyaltyProgramMember LoyaltyProgramMember;
	public String LoyaltyPromotionType;
	public Decimal MaxPromotionLiabilityAmount;
	public Integer MaxPromotionVoucherCount;
	public Integer MaximumPromotionRewardValue;
	public String MemberEligibilityCategory;
	public String Objective;
	public Date PromEnrollmentStartDate;
	public Integer PromotionCumulativeUsageTgt;
	public Date PromotionEnrollmentEndDate;
	public Id PromotionId;
	public Promotion Promotion;
	public String PromotionImageUrl;
	public String PromotionName;
	public Decimal PromotionPointFactor;
	public String PromotionTrxnJournalType;
	public Date StartDate;
	public Integer TotalPromotionRewardPointsVal;

	public LoyaltyPgmMbrPromEligView clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrPromEligView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrPromEligView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrPromEligView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmMbrPromEligView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
