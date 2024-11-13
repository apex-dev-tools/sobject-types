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
public class LoyaltyPgmGroupMbrRlnspChangeEvent extends SObject {
	public static SObjectType$<LoyaltyPgmGroupMbrRlnspChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyPgmGroupMbrRlnspChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Boolean CanMemberRedeemFromGroup;
	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public String ContributionCalculationType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyProgramGroupMemberId;
	public LoyaltyProgramMember LoyaltyProgramGroupMember;
	public String MemberName;
	public Decimal MemberPointContributionPercent;
	public String MemberRole;
	public String Name;
	public Id RelatedLoyaltyProgramMemberId;
	public LoyaltyProgramMember RelatedLoyaltyProgramMember;
	public String ReplayId;

	public LoyaltyPgmGroupMbrRlnspChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmGroupMbrRlnspChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmGroupMbrRlnspChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmGroupMbrRlnspChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmGroupMbrRlnspChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
