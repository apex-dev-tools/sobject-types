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
public class LoyaltyTierGroupChangeEvent extends SObject {
	public static SObjectType$<LoyaltyTierGroupChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyTierGroupChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String ExtendExpiration;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsHiddenToMembers;
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public String Name;
	public Date QpResetDate;
	public Integer QpResetFrequency;
	public String QpResetPeriod;
	public String ReplayId;
	public Id TierAssessmentCurrencyId;
	public LoyaltyProgramCurrency TierAssessmentCurrency;
	public String TierModel;
	public Integer TierPeriodQuantity;
	public String TierPeriodUnit;

	public LoyaltyTierGroupChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierGroupChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
