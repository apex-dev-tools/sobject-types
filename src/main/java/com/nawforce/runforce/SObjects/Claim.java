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
public class Claim extends SObject {
	public static SObjectType$<Claim> SObjectType;
	public static SObjectFields$<Claim> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal ActualAmount;
	public Decimal ApprovedAmount;
	public Datetime AssessmentDate;
	public Id CaseId;
	public Case Case;
	public String ClaimReason;
	public String ClaimReasonType;
	public String ClaimType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal EstimatedAmount;
	public Datetime FinalizedDate;
	public String FinancialAuthorityStatus;
	public String FnolChannel;
	public Id Id;
	public Id IncidentId;
	public Incident Incident;
	public Address IncidentSite;
	public String IncidentSiteCity;
	public String IncidentSiteCountry;
	public String IncidentSiteCountryCode;
	public String IncidentSiteGeocodeAccuracy;
	public Decimal IncidentSiteLatitude;
	public Decimal IncidentSiteLongitude;
	public String IncidentSitePostalCode;
	public String IncidentSiteState;
	public String IncidentSiteStateCode;
	public String IncidentSiteStreet;
	public Datetime InitiationDate;
	public Id InsuredAssetId;
	public InsurancePolicyAsset InsuredAsset;
	public Boolean IsAuthoritiesNotified;
	public Boolean IsClosed;
	public Boolean IsDeleted;
	public Boolean IsDrivable;
	public Boolean IsInhabitable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Datetime LossDate;
	public String LossType;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PolicyNumberId;
	public InsurancePolicy PolicyNumber;
	public String RenewalChannel;
	public String RepairShop;
	public String RepairShopLocation;
	public Datetime ReportDate;
	public String ReportNumber;
	public String ReportingAuthority;
	public String Severity;
	public Id SourceId;
	public Name Source;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;
	public String Summary;
	public Datetime SystemModstamp;
	public String UsageType;
	public Datetime VisitDate;
	public String VisitSite;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public ClaimCoverage[] ClaimCoverages;
	public ClaimItem[] ClaimItems;
	public ClaimParticipant[] ClaimParticipants;
	public ClaimPaymentSummary[] ClaimPaymentSummaries;
	public ClaimTeamMember[] ClaimTeamMembers;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public Visit[] Contexts;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EngagementTopic[] EngagementInitiatedTopic;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ClaimFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ClaimHistory[] Histories;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public PartyIncome[] PartyIncomes;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public ClaimShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public Claim clone$() {throw new java.lang.UnsupportedOperationException();}
	public Claim clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Claim clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Claim clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Claim clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
