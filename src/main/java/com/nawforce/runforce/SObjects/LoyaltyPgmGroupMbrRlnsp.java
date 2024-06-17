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
public class LoyaltyPgmGroupMbrRlnsp extends SObject {
	public static SObjectType$<LoyaltyPgmGroupMbrRlnsp> SObjectType;
	public static SObjectFields$<LoyaltyPgmGroupMbrRlnsp> Fields;

	public Id AccountId;
	public Account Account;
	public Boolean CanMemberRedeemFromGroup;
	public Id ContactId;
	public Contact Contact;
	public String ContributionCalculationType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyProgramGroupMemberId;
	public LoyaltyProgramMember LoyaltyProgramGroupMember;
	public String MemberName;
	public Decimal MemberPointContributionPercent;
	public String MemberRole;
	public String Name;
	public Id RelatedLoyaltyProgramMemberId;
	public LoyaltyProgramMember RelatedLoyaltyProgramMember;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public LoyaltyPgmGroupMbrRlnspHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public LoyaltyPgmGroupMbrRlnsp clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmGroupMbrRlnsp clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmGroupMbrRlnsp clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmGroupMbrRlnsp clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPgmGroupMbrRlnsp clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
