/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class LoyaltyPgmPartnerPromotionChangeEvent extends SObject {
	public static SObjectType$<LoyaltyPgmPartnerPromotionChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyPgmPartnerPromotionChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Decimal ContributionPercentage;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramPartnerId;
	public LoyaltyProgramPartner LoyaltyProgramPartner;
	public String Name;
	public Id PromotionId;
	public Promotion Promotion;
	public String ReplayId;

	public LoyaltyPgmPartnerPromotionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmPartnerPromotionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmPartnerPromotionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmPartnerPromotionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmPartnerPromotionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
