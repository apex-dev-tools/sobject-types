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
public class PartyIncome extends SObject {
	public static SObjectType$<PartyIncome> SObjectType;
	public static SObjectFields$<PartyIncome> Fields;

	public Integer CalendarYear;
	public Id ClaimId;
	public Claim Claim;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EmployerAddress;
	public Id EmployerId;
	public Account Employer;
	public String EmployerName;
	public String EmployerPhone;
	public Datetime EndDate;
	public Id Id;
	public Decimal IncomeAmount;
	public String IncomeFrequency;
	public Decimal IncomeLossPercent;
	public String IncomeStatus;
	public String IncomeType;
	public Boolean IsDeleted;
	public String JobTitle;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String ModificationReason;
	public String Name;
	public Decimal NetIncome;
	public Id OwnerId;
	public Name Owner;
	public Id PartyId;
	public Name Party;
	public Datetime StartDate;
	public Datetime SystemModstamp;
	public String UsageType;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public PartyIncomeFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public PartyIncomeHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PartyIncomeShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public PartyIncome clone$() {throw new java.lang.UnsupportedOperationException();}
	public PartyIncome clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PartyIncome clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PartyIncome clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PartyIncome clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
