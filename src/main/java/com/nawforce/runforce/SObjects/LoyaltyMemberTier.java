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
public class LoyaltyMemberTier extends SObject {
	public static SObjectType$<LoyaltyMemberTier> SObjectType;
	public static SObjectFields$<LoyaltyMemberTier> Fields;

	public Boolean AreBenefitsAssigned;
	public String ChangeReasonType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EffectiveDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyMemberId;
	public LoyaltyProgramMember LoyaltyMember;
	public Id LoyaltyTierGroupId;
	public LoyaltyTierGroup LoyaltyTierGroup;
	public Id LoyaltyTierId;
	public LoyaltyTier LoyaltyTier;
	public String Name;
	public String ReasonForChange;
	public Datetime SystemModstamp;
	public Date TierExpirationDate;

	public EngagementTopic[] EngagementInitiatedTopic;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public LoyaltyMemberTierHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public LoyaltyMemberTier clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMemberTier clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMemberTier clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMemberTier clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMemberTier clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
