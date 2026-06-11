/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LoyaltyPgmCurrencyExtPrdChangeEvent extends SObject {
	public static SObjectType$<LoyaltyPgmCurrencyExtPrdChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyPgmCurrencyExtPrdChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer ExtensionDuration;
	public String ExtensionDurationUnit;
	public String ExtensionType;
	public Id Id;
	public Boolean IsExpiryExempt;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramCurrencyId;
	public LoyaltyProgramCurrency LoyaltyProgramCurrency;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public Id LoyaltyTierId;
	public LoyaltyTier LoyaltyTier;
	public String Name;
	public String ReplayId;
	public Id TargetAudienceReferenceId;
	public LoyaltyTier TargetAudienceReference;

	public LoyaltyPgmCurrencyExtPrdChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmCurrencyExtPrdChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmCurrencyExtPrdChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmCurrencyExtPrdChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmCurrencyExtPrdChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
