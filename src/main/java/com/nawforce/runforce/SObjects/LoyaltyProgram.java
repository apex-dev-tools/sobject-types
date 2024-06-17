/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LoyaltyProgram extends SObject {
	public static SObjectType$<LoyaltyProgram> SObjectType;
	public static SObjectFields$<LoyaltyProgram> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Integer EscrowPeriod;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String Status;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public LoyaltyProgramFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public LoyaltyProgramHistory[] Histories;
	public TransactionJournal[] JournalProgram;
	public LoyaltyProgramBadge[] LoyaltyProgramBadges;
	public LoyaltyProgramCurrency[] LoyaltyProgramCurrencies;
	public LoyaltyPgmEngmtAttribute[] LoyaltyProgramEngagementAttributes;
	public LoyaltyProgramMember[] LoyaltyProgramMembers;
	public LoyaltyProgramPartner[] LoyaltyProgramPartners;
	public LoyaltyProgramProcess[] LoyaltyProgramProcesses;
	public VoucherDefinition[] LoyaltyPrograms;
	public Promotion[] LoyaltyPromotions;
	public LoyaltyTierGroup[] LoyaltyTierGroups;
	public LoyaltyPgmMbrPromEligView[] MemberPromotions;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public BenefitType[] ProgramBenefitTypes;
	public LoyaltyProgramShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public LoyaltyProgram clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgram clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgram clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgram clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyProgram clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
