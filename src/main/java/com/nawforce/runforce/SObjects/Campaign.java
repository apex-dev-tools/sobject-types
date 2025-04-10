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
public class Campaign extends SObject {
	public static SObjectType$<Campaign> SObjectType;
	public static SObjectFields$<Campaign> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public Decimal ActualCost;
	public Decimal AmountAllOpportunities;
	public Decimal AmountWonOpportunities;
	public Decimal BudgetedCost;
	public Id CampaignImageId;
	public ContentDocument CampaignImage;
	public Id CampaignMemberRecordTypeId;
	public RecordType CampaignMemberRecordType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Decimal ExpectedResponse;
	public Decimal ExpectedRevenue;
	public Decimal HierarchyActualCost;
	public Decimal HierarchyAmountAllOpportunities;
	public Decimal HierarchyAmountWonOpportunities;
	public Decimal HierarchyBudgetedCost;
	public Decimal HierarchyExpectedRevenue;
	public Integer HierarchyNumberOfContacts;
	public Integer HierarchyNumberOfConvertedLeads;
	public Integer HierarchyNumberOfLeads;
	public Integer HierarchyNumberOfOpportunities;
	public Integer HierarchyNumberOfResponses;
	public Integer HierarchyNumberOfWonOpportunities;
	public Decimal HierarchyNumberSent;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Date LastActivityDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Integer NumberOfContacts;
	public Integer NumberOfConvertedLeads;
	public Integer NumberOfLeads;
	public Integer NumberOfOpportunities;
	public Integer NumberOfResponses;
	public Integer NumberOfWonOpportunities;
	public Decimal NumberSent;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public Campaign Parent;
	public Date StartDate;
	public String Status;
	public Datetime SystemModstamp;
	public String Type;

	public ActionPlan[] ActionPlans;
	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CareProgramCampaign[] CampaignCareProgramCampaigns;
	public CampaignMemberStatus[] CampaignMemberStatuses;
	public CampaignMember[] CampaignMembers;
	public Promotion[] CampaignPromotions;
	public Campaign[] ChildCampaigns;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EngagementTopic[] EngagementInitiatedTopic;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CampaignFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public FlowRecord[] Flows;
	public AuthFormRequestRecord[] FormRequestRecordRelatedRecords;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CampaignHistory[] Histories;
	public InfoAuthorizationRequest[] InfoAuthRequestSourceRecords;
	public ListEmailRecipientSource[] ListEmailRecipientSources;
	public ListEmail[] ListEmails;
	public MultipartyInfoAuthRequest[] MultipartyInfoAuthRequestSourceRecords;
	public OpenActivity[] OpenActivities;
	public Opportunity[] Opportunities;
	public NetworkActivityAudit[] ParentEntities;
	public PartnerFundRequest[] PartnerFundRequests;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public CollaborationGroupRecord[] RecordAssociatedGroups;
	public WorkFeedbackRequest[] RelatedObjects;
	public CampaignShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public UserDefinedLabelAssignment[] UserDefinedLabelAssignments;

	public Campaign clone$() {throw new java.lang.UnsupportedOperationException();}
	public Campaign clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Campaign clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Campaign clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Campaign clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
