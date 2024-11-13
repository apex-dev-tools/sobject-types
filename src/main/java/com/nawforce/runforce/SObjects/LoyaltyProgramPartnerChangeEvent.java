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
public class LoyaltyProgramPartnerChangeEvent extends SObject {
	public static SObjectType$<LoyaltyProgramPartnerChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyProgramPartnerChangeEvent> Fields;

	public Decimal AccrualCostperUnit;
	public Decimal AlertValue;
	public String BillingType;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CreditedPoints;
	public String CurrencyIsoCode;
	public Decimal DebitedPoints;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastProcessedDateTime;
	public Id LoyaltyPartnerId;
	public Account LoyaltyPartner;
	public Id LoyaltyProgramId;
	public LoyaltyProgram LoyaltyProgram;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String PartnerCategory;
	public String PartnerIndustry;
	public String PartnerStatus;
	public String PartnerType;
	public Date PartnershipEndDate;
	public Date PartnershipStartDate;
	public Decimal PointsBalance;
	public Decimal PostpaidBillAmount;
	public Decimal PurchasedPoints;
	public Decimal RedemptionCostperUnit;
	public String ReplayId;

	public LoyaltyProgramPartnerChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramPartnerChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramPartnerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramPartnerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramPartnerChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
