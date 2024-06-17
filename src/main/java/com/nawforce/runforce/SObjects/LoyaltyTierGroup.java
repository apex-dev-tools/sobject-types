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
public class LoyaltyTierGroup extends SObject {
	public static SObjectType$<LoyaltyTierGroup> SObjectType;
	public static SObjectFields$<LoyaltyTierGroup> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String ExtendExpiration;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsHiddenToMembers;
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public String Name;
	public Date QpResetDate;
	public Integer QpResetFrequency;
	public String QpResetPeriod;
	public Datetime SystemModstamp;
	public Id TierAssessmentCurrencyId;
	public LoyaltyProgramCurrency TierAssessmentCurrency;
	public String TierModel;
	public Integer TierPeriodQuantity;
	public String TierPeriodUnit;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public LoyaltyProgramProcess[] LoyaltyProcessesTierGroup;
	public LoyaltyMemberTier[] LoyaltyTierGroup;
	public LoyaltyTier[] LoyaltyTiers;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public LoyaltyTierGroup clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierGroup clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierGroup clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
