/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LoyaltyProgramCurrencyChangeEvent extends SObject {
	public static SObjectType$<LoyaltyProgramCurrencyChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyProgramCurrencyChangeEvent> Fields;

	public Object ChangeEventHeader;
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
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public Id LoyaltyTierGroupId;
	public LoyaltyTierGroup LoyaltyTierGroup;
	public String Name;
	public String ReplayId;

	public LoyaltyProgramCurrencyChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramCurrencyChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramCurrencyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramCurrencyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramCurrencyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
