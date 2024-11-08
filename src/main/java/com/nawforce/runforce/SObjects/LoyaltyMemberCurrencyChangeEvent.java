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
public class LoyaltyMemberCurrencyChangeEvent extends SObject {
	public static SObjectType$<LoyaltyMemberCurrencyChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyMemberCurrencyChangeEvent> Fields;

	public Decimal BalanceBeforeReset;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal EscrowPointsBalance;
	public Decimal ExpirablePoints;
	public Id Id;
	public Datetime LastAccrualProcessedDate;
	public Datetime LastEscrowProcessedDate;
	public Date LastExpirationProcessRunDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Date LastResetDate;
	public Id LoyaltyMemberId;
	public LoyaltyProgramMember LoyaltyMember;
	public Id LoyaltyProgramCurrencyId;
	public LoyaltyProgramCurrency LoyaltyProgramCurrency;
	public String Name;
	public Date NextResetDate;
	public Decimal PointsBalBeforeSecondLastReset;
	public Decimal PointsBalance;
	public Datetime RedemStlPendFromDateTime;
	public String ReplayId;
	public Decimal TotalEscrowPointsAccrued;
	public Decimal TotalEscrowRolloverPoints;
	public Decimal TotalPointsAccrued;
	public Decimal TotalPointsExpired;
	public Decimal TotalPointsRedeemed;

	public LoyaltyMemberCurrencyChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMemberCurrencyChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMemberCurrencyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMemberCurrencyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyMemberCurrencyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
