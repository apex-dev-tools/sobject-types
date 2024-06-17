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
public class LoyaltyProgramCurrency extends SObject {
	public static SObjectType$<LoyaltyProgramCurrency> SObjectType;
	public static SObjectFields$<LoyaltyProgramCurrency> Fields;

	public Decimal CostperUnit;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String CurrencyType;
	public String ExpiryModel;
	public Integer ExpiryPeriodFrequency;
	public String ExpiryPeriodUnit;
	public String ExtendExpiration;
	public Boolean HasEscrow;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public Id LoyaltyTierGroupId;
	public LoyaltyTierGroup LoyaltyTierGroup;
	public String Name;
	public Datetime SystemModstamp;

	public LoyaltyPgmPartnerCurrency[] CurrencyRelationship;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public LoyaltyLedger[] LoyaltyProgramCurrencyLedger;
	public LoyaltyMemberCurrency[] Loyalty_Member_Currency;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public GameReward[] RewardDefinitions;

	public LoyaltyProgramCurrency clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramCurrency clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramCurrency clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramCurrency clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramCurrency clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
