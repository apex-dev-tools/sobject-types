/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LoyaltyTierMshpFeeOption extends SObject {
	public static SObjectType$<LoyaltyTierMshpFeeOption> SObjectType;
	public static SObjectFields$<LoyaltyTierMshpFeeOption> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EffectiveEndDateTime;
	public Datetime EffectiveStartDateTime;
	public String FeeType;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyProgramCurrencyId;
	public LoyaltyProgramCurrency LoyaltyProgramCurrency;
	public Id LoyaltyTierId;
	public LoyaltyTier LoyaltyTier;
	public String MembershipDurationType;
	public Decimal MembershipFee;
	public String Name;
	public Integer Points;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public LoyaltyTierMshpFeeOptionHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public LoyaltyTierMshpFeeOption clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierMshpFeeOption clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierMshpFeeOption clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierMshpFeeOption clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierMshpFeeOption clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
