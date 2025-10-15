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
public class LoyaltyTier extends SObject {
	public static SObjectType$<LoyaltyTier> SObjectType;
	public static SObjectFields$<LoyaltyTier> Fields;

	public String Color;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public Id LoyaltyTierGroupId;
	public LoyaltyTierGroup LoyaltyTierGroup;
	public Decimal MaximumEligibleBalance;
	public Decimal MinimumEligibleBalance;
	public String Name;
	public Integer SequenceNumber;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public LoyaltyTierHistory[] Histories;
	public LoyaltyMemberTier[] LoyaltyTier;
	public LoyaltyTierMshpFeeOption[] LoyaltyTierMshpOptions;
	public LoyaltyTierPromotion[] LoyaltyTierPromotions;
	public LoyaltyTierBenefit[] LoyaltyTiers;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public LoyaltyTier clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTier clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTier clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTier clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTier clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
