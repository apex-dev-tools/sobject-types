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
public class PromotionPartyUsageChangeEvent extends SObject {
	public static SObjectType$<PromotionPartyUsageChangeEvent> SObjectType;
	public static SObjectFields$<PromotionPartyUsageChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String AdditionalAttributeInfo;
	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Integer IssuedVoucherCount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramMemberId;
	public LoyaltyProgramMember LoyaltyProgramMember;
	public String Name;
	public Integer OrderCount;
	public Id PartyId;
	public SObject Party;
	public Decimal PointsCredited;
	public Id PromotionId;
	public Promotion Promotion;
	public String ReplayId;
	public String Type;
	public Decimal UsageCount;

	public PromotionPartyUsageChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromotionPartyUsageChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromotionPartyUsageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromotionPartyUsageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromotionPartyUsageChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
