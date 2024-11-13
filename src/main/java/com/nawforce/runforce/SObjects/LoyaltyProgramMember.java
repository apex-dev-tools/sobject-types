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
public class LoyaltyProgramMember extends SObject {
	public static SObjectType$<LoyaltyProgramMember> SObjectType;
	public static SObjectFields$<LoyaltyProgramMember> Fields;

	public Id AccountId;
	public Account Account;
	public Boolean CanReceivePartnerPromotions;
	public Boolean CanReceivePromotions;
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
	public Boolean IsDeleted;
	public Boolean IsEligibleForTierAssessment;
	public Date LastActivityDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MemberStatus;
	public String MemberType;
	public Date MembershipEndDate;
	public Date MembershipLastRenewalDate;
	public String MembershipNumber;
	public Id OwnerId;
	public Name Owner;
	public Id ProgramId;
	public LoyaltyProgram Program;
	public String ReferralCode;
	public Id ReferredById;
	public LoyaltyProgramMember ReferredBy;
	public Id RelatedCorporateMembershipId;
	public LoyaltyProgramMember RelatedCorporateMembership;
	public String StatementFrequency;
	public Datetime StatementLastGeneratedDate;
	public String StatementMethod;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public EmailMessage[] Emails;
	public EngagementTopic[] EngagementInitiatedTopic;
	public EngagementInteraction[] EngagementInitiatingAttendee;
	public EngagementTopic[] EngagementRelatedPerson;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EngagementAttendee[] ExternalAttendees;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GameParticipant[] GameParticipantLoyaltyMembers;
	public LoyaltyProgramMemberHistory[] Histories;
	public LoyaltyProgramMbrPromotion[] LoyaltyMemberPromotions;
	public LoyaltyPgmGroupMbrRlnsp[] LoyaltyPgmGroupMbrRlnsps;
	public LoyaltyProgramMemberBadge[] LoyaltyProgramMemberBadges;
	public LoyaltyLedger[] LoyaltyProgramMemberLedger;
	public LoyaltyMembershipLifecycle[] LoyaltyProgramMemberMembershipLifecycle;
	public LoyaltyProgramMemberCase[] LoyaltyProgramMemberRelatedCases;
	public LoyaltyMemberCurrency[] Loyalty_Member_Currency;
	public LoyaltyMemberTier[] Loyalty_Member_Tier;
	public MemberBenefit[] MemberBenefitMembers;
	public LoyaltyPgmMbrPromEligView[] MemberPromotions;
	public OpenActivity[] OpenActivities;
	public GameParticipant[] Participants;
	public LoyaltyProgramPartnerLedger[] PartnerLedgerToMember;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public LoyaltyPgmMbrAttributeVal[] ProgramMemberAttributeValues;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public TransactionJournal[] Referrer;
	public LoyaltyPgmGroupMbrRlnsp[] Rel_LoyaltyPgmGroupMbrRlnsps;
	public TransactionJournal[] RelatedMembership;
	public LoyaltyProgramMemberShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TransactionJournal[] Transaction_Journal;
	public Voucher[] VoucherLoyaltyProgramMember;

	public LoyaltyProgramMember clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramMember clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramMember clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgramMember clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
