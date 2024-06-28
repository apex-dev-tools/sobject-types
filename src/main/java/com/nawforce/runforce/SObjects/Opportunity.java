/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Opportunity extends SObject {
	public static SObjectType$<Opportunity> SObjectType;
	public static SObjectFields$<Opportunity> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public Id AccountId;
	public Account Account;
	public Decimal Amount;
	public Id CampaignId;
	public Campaign Campaign;
	public Date CloseDate;
	public Id ContactId;
	public Contact Contact;
	public Id ContractId;
	public Contract Contract;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Decimal ExpectedRevenue;
	public String Fiscal;
	public Integer FiscalQuarter;
	public Integer FiscalYear;
	public String ForecastCategory;
	public String ForecastCategoryName;
	public Boolean HasOpenActivity;
	public Boolean HasOpportunityLineItem;
	public Boolean HasOverdueTask;
	public Id Id;
	public Boolean IsClosed;
	public Boolean IsDeleted;
	public Boolean IsExcludedFromTerritory2Filter;
	public Boolean IsPrivate;
	public Boolean IsSplit;
	public Boolean IsWon;
	public Date LastActivityDate;
	public Id LastAmountChangedHistoryId;
	public OpportunityHistory LastAmountChangedHistory;
	public Id LastCloseDateChangedHistoryId;
	public OpportunityHistory LastCloseDateChangedHistory;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastStageChangeDate;
	public Datetime LastViewedDate;
	public String LeadSource;
	public String Name;
	public String NextStep;
	public Id OwnerId;
	public User Owner;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public Decimal Probability;
	public Integer PushCount;
	public String StageName;
	public Id SyncedQuoteId;
	public Quote SyncedQuote;
	public Datetime SystemModstamp;
	public Id Territory2Id;
	public Territory2 Territory2;
	public Decimal TotalOpportunityQuantity;
	public String Type;

	public AccountPartner[] AccountPartners;
	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContactRequest[] ContactRequests;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EngagementTopic[] EngagementInitiatedTopic;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public OpportunityFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public OpportunityFieldHistory[] Histories;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public ResidentialLoanApplication[] Lending_Applications;
	public ListEmail[] ListEmails;
	public MessagingSession[] MessagingSessions;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public OpportunityCompetitor[] OpportunityCompetitors;
	public OpportunityContactRole[] OpportunityContactRoles;
	public OpportunityHistory[] OpportunityHistories;
	public OpportunityLineItem[] OpportunityLineItems;
	public OpportunityPartner[] OpportunityPartnersFrom;
	public OpportunityRelatedDeleteLog[] OpportunityRelatedDeleteLogs;
	public OpportunitySplit[] OpportunitySplits;
	public OpportunityTeamMember[] OpportunityTeamMembers;
	public Order[] Orders;
	public NetworkActivityAudit[] ParentEntities;
	public Partner[] Partners;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Quote[] Quotes;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public CollaborationGroupRecord[] RecordAssociatedGroups;
	public WorkFeedbackRequest[] RelatedObjects;
	public VoiceCall[] RelatedRecords;
	public ServiceAppointment[] ServiceAppointments;
	public OpportunityShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
	public InsurancePolicy[] SourceOpportunity;
	public SwarmMember[] SwarmMembers;
	public Swarm[] Swarms;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public UserDefinedLabelAssignment[] UserDefinedLabelAssignments;
	public VideoCall[] VideoRelatedRecords;

	public Opportunity clone$() {throw new java.lang.UnsupportedOperationException();}
	public Opportunity clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Opportunity clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Opportunity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Opportunity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
