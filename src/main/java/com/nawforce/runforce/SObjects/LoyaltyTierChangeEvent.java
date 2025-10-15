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
public class LoyaltyTierChangeEvent extends SObject {
	public static SObjectType$<LoyaltyTierChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyTierChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String Color;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public Id LoyaltyTierGroupId;
	public LoyaltyTierGroup LoyaltyTierGroup;
	public Decimal MaximumEligibleBalance;
	public Decimal MinimumEligibleBalance;
	public String Name;
	public String ReplayId;
	public Integer SequenceNumber;

	public LoyaltyTierChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyTierChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
