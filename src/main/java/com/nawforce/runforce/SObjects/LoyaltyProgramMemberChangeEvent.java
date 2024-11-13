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
public class LoyaltyProgramMemberChangeEvent extends SObject {
	public static SObjectType$<LoyaltyProgramMemberChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyProgramMemberChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Boolean CanReceivePartnerPromotions;
	public Boolean CanReceivePromotions;
	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EnrollmentChannel;
	public Date EnrollmentDate;
	public Id GroupCreatedByMemberId;
	public LoyaltyProgramMember GroupCreatedByMember;
	public String GroupName;
	public Id Id;
	public Boolean IsEligibleForTierAssessment;
	public Date LastActivityDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MemberStatus;
	public String MemberType;
	public Date MembershipEndDate;
	public Date MembershipLastRenewalDate;
	public String MembershipNumber;
	public Id OwnerId;
	public User Owner;
	public Id ProgramId;
	public LoyaltyProgram Program;
	public String ReferralCode;
	public Id ReferredById;
	public LoyaltyProgramMember ReferredBy;
	public Id RelatedCorporateMembershipId;
	public LoyaltyProgramMember RelatedCorporateMembership;
	public String ReplayId;
	public String StatementFrequency;
	public Datetime StatementLastGeneratedDate;
	public String StatementMethod;

	public LoyaltyProgramMemberChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramMemberChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramMemberChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
